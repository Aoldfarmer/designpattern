package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealSubject implements Subject {

    private static final Logger LOG = LoggerFactory.getLogger(RealSubject.class);

    @Override
    public void request() {
        LOG.debug("打印输出真实的对象{}", "RealSubject");
    }
}
