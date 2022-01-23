package sample;
import java.text.SimpleDateFormat;
import java.util.Date;

public class calc {



    public void data() {
        String data;
        Date currentDate = new Date();
        SimpleDateFormat time = new SimpleDateFormat("EEEE");
        data = time.format(currentDate);
    }

    public void getDays(int x) {
        return;
    }

}
