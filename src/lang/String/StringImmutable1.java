package lang.String;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        // String은 불변객체이므로 기존 문자열에 새로운 분자열을 합칠 경우 반환 된 값을 받을 수 있게 해야한다
        str.concat(" java");
        System.out.println("str = " + str);
    }
}
