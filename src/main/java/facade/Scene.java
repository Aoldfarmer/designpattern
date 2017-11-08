package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scene {

    private static final Logger LOG = LoggerFactory.getLogger(Scene.class);

    public void loading() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("scene is loading...");
        }
    }
}
