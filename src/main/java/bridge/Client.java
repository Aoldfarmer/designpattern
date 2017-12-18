package bridge;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-18 下午 23:05
 */
public class Client {
    public static void main(String[] args) {
        AbstractBrushPen brushPen = new BigBrushPenRefine();
        AbstractColor color = new RedColor();
        brushPen.setColor(color);
        brushPen.operationDraw();
    }

}
