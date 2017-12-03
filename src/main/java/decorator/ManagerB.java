package decorator;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-03 下午 19:35
 */
public class ManagerB extends Manager {

    public ManagerB(Project project) {
        super(project);
    }

    @Override
    public void startNewWork() {
        System.out.println("测试经理开始新的工作计划");
    }
}
