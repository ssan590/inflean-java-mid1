package enumeration.ex1;

public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DisCountService disCountService = new DisCountService();
        int basic = disCountService.discount(StringGrade.BASIC, price);
        int gold = disCountService.discount(StringGrade.GOLD, price);
        int diamond = disCountService.discount(StringGrade.DIAMOND, price);

        System.out.println("배이직 등급 할인 금액: " + basic);
        System.out.println("gold 등급 할인 금액: " + gold);
        System.out.println("diamond 등급 할인 금액: " + diamond);
    }
}
