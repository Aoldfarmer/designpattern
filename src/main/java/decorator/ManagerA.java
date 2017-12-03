package decorator;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-03 下午 19:34
 */
public class ManagerA extends Manager {

    public ManagerA(Project project) {
        super(project);
    }

    @Override
    public void startNewWork() {
        System.out.println("开发经理开始新的工作计划");
    }
}
