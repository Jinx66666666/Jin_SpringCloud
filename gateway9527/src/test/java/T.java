import java.time.ZonedDateTime;

/**
 * @author: Jin
 * @Date: 2021/2/24 9:43
 * @Description:
 * @version: V1.0
 */
public class T {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        String  a = "abc";
        String  b = "abc";
        System.out.println(a==b);
    }
}
