package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        // 이너클래스를 만들 경우 바깥 클래스를 먼저 생성해야 한다.
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
