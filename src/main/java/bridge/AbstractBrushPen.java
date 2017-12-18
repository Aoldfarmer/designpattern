package bridge;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-18 下午 23:01
 */
public abstract class AbstractBrushPen {

    protected AbstractColor color;

    public abstract void operationDraw();

    public void setColor(AbstractColor color) {
        this.color = color;
    }
}
