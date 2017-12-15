package state;

public class RunState extends LiftState {

    @Override
    protected void run() {
        System.out.println("运行中");
    }

    @Override
    protected void stop() {
        context.setLiftState(Context.stopState);
        context.getLiftState().stop();
    }
}
