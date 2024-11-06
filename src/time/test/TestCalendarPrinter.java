package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.println("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1); // 시작 일
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); // 다음달 첫째일 전까지 출력을 위해 필요

        // 월요일=1(1%7=1), .... 일요일=7(7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        // 첫번째 주 시작일이 일요일이 아닐 경우 공백을 넣어 요일을 맞춰주기 위해 필요
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) { //반복문을 통해 일자를 더하며 출력 하여 다음달 1일 전까지 반복 실행
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); // 10진수 수를 2칸을 차지하여 출력하고 한칸만 차지할 경우 왼쪽은 공백으로 채움
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) { // 출력 중 토요일 경우 다음 칸에서 출력하기 위해 필요
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }

    }
}
