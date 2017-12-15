package state;

public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    protected void open() {}
    protected void close() {}
    protected void run() {}
    protected void stop() {}

}
