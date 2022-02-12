import java.util.Date;
import java.text.SimpleDateFormat;
import static java.lang.System.out;


public class ImportTest {
    public static void main(String[] args) {
        Date today;
        today = new Date();

        Date oneday;
        oneday = new Date(30000);

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");


        out.println("hello");
    }
}
