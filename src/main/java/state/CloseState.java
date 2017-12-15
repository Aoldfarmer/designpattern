package state;

public class CloseState extends LiftState {

    @Override
    protected void close() {
        System.out.println("电梯门关闭");

    }

    @Override
    protected void open() {
        context.setLiftState(Context.openState);
        context.getLiftState().open();
    }

    @Override
    protected void run() {
        context.setLiftState(Context.runState);
        context.getLiftState().run();
    }

    @Override
    protected void stop() {
        context.setLiftState(Context.stopState);
        context.getLiftState().stop();
    }
}
