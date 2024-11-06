package lang.String;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        // String은 불변객체이므로 기존 문자열에 새로운 분자열을 합칠 경우 반환 된 값을 받을 수 있게 해야한다
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
