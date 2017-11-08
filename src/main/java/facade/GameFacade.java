package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

public class GameFacade {
    private static final Logger LOG = LoggerFactory.getLogger(GameFacade.class);

    private Action action;
    private Role role;
    private Scene scene;

    public GameFacade() {
        action = new Action();
        role = new Role();
        scene = new Scene();
    }

    public void gameStart() {
        LOG.debug("game start, time: {}", Instant.now());
        role.loading();
        scene.loading();
        action.loading();
        LOG.debug("game start loading end, time: {}", Instant.now());
    }
}
