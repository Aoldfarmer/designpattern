package strategy.example2;

import java.util.Arrays;

/**
 * @author koou
 * @version 1.0
 * @since 2017-08-05 下午 13:30
 */
public class StrategyTest {

    public static void main(String[] args) {
        int[] iarray = {1, 2, 3, 4, 5};
        //对int数组进行策略操作，修改数组第一个数字为9097
        StrategyProcess.apply(iarray, new Strategy<int[]>() {
            public <T> void process(T t) {
                int[] temparray = (int[]) t;
                if (temparray.length > 1) {
                    temparray[0] = 9097;
                }
            }
        });
        System.out.println(Arrays.toString(iarray));
    }
}
