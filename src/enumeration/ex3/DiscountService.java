package enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;


        if (grade == Grade.BASIC) {
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        //enum switch 변경 가능
        switch (grade) {
            case BASIC -> discountPercent = 10;
            case GOLD -> discountPercent = 20;
            case DIAMOND -> discountPercent = 30;
            case null, default -> System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
