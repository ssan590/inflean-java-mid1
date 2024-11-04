package lang.String.test;

public class TestString {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] splitFruits = fruits.split(",");

        //분리하기
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        // 합치기
        String result = String.join("->", splitFruits);
        System.out.println(result);
    }
}
