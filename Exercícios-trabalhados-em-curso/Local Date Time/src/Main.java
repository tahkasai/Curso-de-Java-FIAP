import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        // No Brasil
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        // Em Tokyo
        LocalDateTime agoraEmTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(agoraEmTokyo);

        // Lista de paises
        for(String s:ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
    }
}