package decorator;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-03 下午 19:31
 */
public class Employe implements Project {

    @Override
    public void doCoding() {
        System.out.println("工程师在编程");
    }
}
