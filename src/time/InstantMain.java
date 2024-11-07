package time;

import java.time.Instant;
import java.time.ZonedDateTime;

// Instant는 초 단위 간단한 연산만 가능하므로, 복잡한 날짜 계산은 하지 못함
public class InstantMain {

    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);

    }
}
