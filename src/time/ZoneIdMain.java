package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        System.out.println("내 시스템 기본 ZoneId = " + ZoneId.systemDefault());

        ZoneId seoul = ZoneId.of("Asia/Seoul");
        System.out.println("seoul = " + seoul);
    }
}
