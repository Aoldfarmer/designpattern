package bridge;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-18 下午 23:04
 */
public class BigBrushPenRefine extends AbstractBrushPen {

    @Override
    public void operationDraw() {
        System.out.println("Big and" + color.bepaint() + "draw");
    }
}
