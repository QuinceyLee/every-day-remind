import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static com.Main.dateFormat;
import static java.time.Year.now;

public class TestDemo {
    @Test
    public void testFormat() throws ParseException {
        Date date = new Date();
//
        GregorianCalendar gc = new GregorianCalendar();
        Year now = now();
        gc.set(Calendar.YEAR,now.getValue());//设置年
        gc.set(Calendar.MONTH, 7);//这里0是1月..以此向后推
        gc.set(Calendar.DAY_OF_MONTH, 17);//设置天
        date = gc.getTime();

        String loveDate = dateFormat.format(date);
//        loveDate.setYear(2022);
        System.out.println(loveDate);
    }
}
