package decorator;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-03 下午 19:32
 */
public abstract class Manager implements Project {

    private Project project;

    public Manager(Project project) {
        this.project = project;
    }


    @Override
    public void doCoding() {
        startNewWork();
        project.doCoding();
    }

    protected void startNewWork() {

    }

}
