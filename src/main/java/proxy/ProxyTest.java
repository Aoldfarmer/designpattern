package proxy;

import proxy.jdk.Account;
import proxy.jdk.AccountImpl;
import proxy.jdk.Proxy;

public class ProxyTest {

    public static void main(String args[]) {
//        RealSubject realSubject = new RealSubject();
//        Proxy p = new Proxy(realSubject);
//        p.request();

        Proxy proxy = new Proxy();
        Account account = (Account) proxy.getInstance(new AccountImpl());
        account.queryAccount();
    }
}
