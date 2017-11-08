package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Action {

    private static final Logger LOG = LoggerFactory.getLogger(Role.class);

    public void loading() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Action is loading");
        }
    }
}
