package state;

public class StopState extends LiftState {

    @Override
    protected void stop() {
        System.out.println("电梯停止运行");
    }

    @Override
    protected void open() {
        context.setLiftState(Context.openState);
        context.getLiftState().open();
    }
}
