package observer.normal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Article article = new Article("12345");
        Reader readerOne = new Reader();
        Reader readerTwo = new Reader();
        Reader readerThree = new Reader();

        article.register(readerOne);
        article.register(readerTwo);
        article.register(readerThree);
        LOG.debug("标题更改之前为：{}", article.getTitle());
        article.changeTitle("98765");
        LOG.debug("标题更改之后为：{}", article.getTitle());

    }
}
