package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();


        // 생성된 로또 번호 출력
        System.out.println(Arrays.toString(lottoNumbers));
        System.out.print("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
