package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Role {
    private static final Logger LOG = LoggerFactory.getLogger(Role.class);

    public void loading() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Role is loading");
        }
    }
}
