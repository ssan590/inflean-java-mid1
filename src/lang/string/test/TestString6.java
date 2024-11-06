package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        while (index >= 0) { // indexOf 함수에 해당하는 값이 없는 경우 -1 을 리턴한다.
            index = str.indexOf(key, index + 1);
            System.out.println("index in while = " + index);
            count++;
        }
        System.out.println("count = " + count);
    }
}
