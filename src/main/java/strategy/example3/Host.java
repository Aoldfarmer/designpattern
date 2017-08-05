package strategy.example3;

import java.io.Serializable;
import java.util.Comparator;

/**
 * @author koou
 * @version 1.0
 * @since 2017-08-05 下午 17:03
 */
public class Host {

    private static class StrLenCmp implements Comparator<String>, Serializable {

        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
    //具体的策略
    public static final Comparator<String> STRING_LEN_COMPARATOR = new StrLenCmp();


}
