package observer.normal;

public class Article extends AbstractSubject {
    private String title;

    public Article(String title) {
        this.title = title;
    }

    public void changeTitle(String title) {
        this.title = title;
        notifyObservers();
    }

    public String getTitle() {
        return title;
    }
}
