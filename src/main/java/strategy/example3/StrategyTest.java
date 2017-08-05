package strategy.example3;

import java.util.Arrays;

/**
 * @author koou
 * @version 1.0
 * @since 2017-08-05 下午 17:09
 */
public class StrategyTest {

    public static void main(String[] args) {
        String[] strArray = {"I", "am", "sk", "I"};
        Arrays.sort(strArray, Host.STRING_LEN_COMPARATOR);
        System.out.println(Arrays.toString(strArray));
    }
}
