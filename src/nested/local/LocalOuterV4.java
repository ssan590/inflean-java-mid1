package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);

                // 인스턴스는 지역 변수보다 더 어래 살아남는다.
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar+" + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();

        // 만약 localVar 의 값을 변경한다면? 다시 캡쳐해야 하나??
//        localVar = 10; //컴파일오류
//        paramVar = 20; // 컴파일오류
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();

    }
}
