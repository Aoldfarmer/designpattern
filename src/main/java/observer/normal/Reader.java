package observer.normal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reader implements IObserver {

    private static int count;
    private static final Logger LOG = LoggerFactory.getLogger(Reader.class);

    @Override
    public void update(ISubject iSubject) {
        if (iSubject instanceof Article) {
            Article article = (Article) iSubject;
            count++;
            LOG.debug("读者{}被通知到, 文章已被更改,更改后的标题为：{}", count, article.getTitle());
        }
    }
}
