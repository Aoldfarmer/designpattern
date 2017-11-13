package observer.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

public class ObserverOne implements Observer {

    private static final Logger LOG = LoggerFactory.getLogger(ObserverOne.class);

    @Override
    public void update(Observable o, Object arg) {
        Subject subject = (Subject) o;
        LOG.debug("数据正在被更新为:{}, arg:{}", subject.getData(), arg);
    }
}
