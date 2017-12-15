package state;

public class OpenState extends LiftState {


    @Override
    protected void close() {
        context.setLiftState(Context.closeState);
        context.getLiftState().close();
    }

    @Override
    protected void open() {
        System.out.println("电梯门开启");
    }
}
