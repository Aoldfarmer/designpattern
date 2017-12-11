package memo;

public class Main {

    public static void main(String[] args) {
        MemoRole role = new MemoRole("发电机", 0, 1);
        MemoManager manager = new MemoManager();
        System.out.println("机器开始发电：");
        role.getCurrentState();

        System.out.println("保存当前机器的状态");
        manager.setMemoBean(role.createMemoObject());

        role.setDeviceName("发电机");
        role.setStateLevel(5);
        role.setUseTime(1000);
        System.out.println("已经持续发电1000小时");
        role.getCurrentState();
        role.setMemento(manager.getMemoBean());

        System.out.println("恢复状态之后");
        role.getCurrentState();
    }
}
