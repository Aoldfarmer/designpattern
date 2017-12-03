package decorator;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-03 下午 19:36
 */
public class Main {

    public static void main(String[] args) {

        Project managerA = new ManagerA(new ManagerB(new Employe()));
        managerA.doCoding();
    }
}
