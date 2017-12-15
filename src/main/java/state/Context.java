package state;

public class Context {

    private LiftState liftState;

    public static final OpenState openState = new OpenState();
    public static final CloseState closeState = new CloseState();
    public static final RunState runState = new RunState();
    public static final StopState stopState = new StopState();

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void run() {
        liftState.run();
    }

    public void stop() {
        liftState.stop();
    }
}
