package state;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new CloseState());
        context.open();
        context.close();
        context.stop();
        context.run();
    }
}
