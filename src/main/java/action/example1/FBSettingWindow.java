package action.example1;

import java.util.ArrayList;
import java.util.List;

public class FBSettingWindow {

    private String title;
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addFunctionButton(FunctionButton functionButton) {
        functionButtons.add(functionButton);
    }

    public void removeFunctionButton(FunctionButton functionButton) {
        functionButtons.remove(functionButton);
    }

    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (FunctionButton functionButton : functionButtons) {
            System.out.println(functionButton.getName());
        }
        System.out.println("------------");

    }
}
