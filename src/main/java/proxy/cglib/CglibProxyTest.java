package proxy.cglib;

public class CglibProxyTest {

    public static void main(String[] args) {
        DAOCglibProxy proxy = new DAOCglibProxy();
        StudentDAO studentDAO = (StudentDAO) proxy.getInstance(new StudentDAO());
        studentDAO.savaStudent();
    }
}
