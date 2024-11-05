package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer i1 = Integer.valueOf(str);

        // Integer -> int
        int i2 = i1.intValue();

        // int -> Integer
        Integer i3 = Integer.valueOf(i2);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
