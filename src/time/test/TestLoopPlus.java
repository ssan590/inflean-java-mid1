package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            // 아래 둘은 같은 결과를 가짐(두번째는 편의메서드)
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
//            LocalDate nextDate = startDate.plusWeeks(2 * i);

            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
        }
    }
}
