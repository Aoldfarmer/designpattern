package memo;

public class MemoRole {
    private int useTime;
    private String deviceName;
    private int stateLevel;

    public MemoRole( String deviceName, int useTime, int stateLevel) {
        this.useTime = useTime;
        this.deviceName = deviceName;
        this.stateLevel = stateLevel;
    }

    public void setMemento(MemoBean memento) {
        this.deviceName = memento.getDeviceName();
        this.stateLevel = memento.getStateLevel();
        this.useTime = memento.getUseTime();
    }

    public int getUseTime() {
        return useTime;
    }

    public void setUseTime(int useTime) {
        this.useTime = useTime;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getStateLevel() {
        return stateLevel;
    }

    public void setStateLevel(int stateLevel) {
        this.stateLevel = stateLevel;
    }

    public MemoBean createMemoObject() {
        MemoBean memento = new MemoBean();
        memento.setDeviceName(deviceName);
        memento.setStateLevel(stateLevel);
        memento.setUseTime(useTime);
        return memento;
    }

    public void getCurrentState() {
        System.out.println("当前设备名称：" + this.deviceName + "当前使用时间：" + this.useTime + "当前工作状态：" + this.stateLevel);
    }

}
