package prototype;

import org.apache.tools.ant.util.DateUtils;

import java.time.Instant;
import java.util.Date;

public class Client {

    public static void main(String[] args) throws Exception {
        Sheep old = new Sheep();
        Date date = new Date();
        String name = "KOP";
        old.setName(name);
        old.setBirthday(date);

        System.out.println(old);
        System.out.println("Date is : " + new Date());
        Sheep newOne = (Sheep) old.clone();
        System.out.println(newOne);

        Thread.sleep(2000);

        newOne.getBirthday().setTime(System.currentTimeMillis());
        System.out.println(newOne);
        System.out.println(old);

    }
}
