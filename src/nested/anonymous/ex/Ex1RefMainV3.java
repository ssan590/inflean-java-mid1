package nested.anonymous.ex;

import java.util.Random;

//익명 클래스 사용
public class Ex1RefMainV3 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();

        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

   

    public static void main(String[] args) {
        
        Process dice = new Process(){

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주시위 + " + randomValue);
            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        // 생성자 필요 없음
//        Process dice = new Dice();
//        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
