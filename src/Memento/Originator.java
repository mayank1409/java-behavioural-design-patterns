package Memento;

public class Originator {
    private String article;

    public Originator() {
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Memento save() {
        return new Memento(article);
    }

    public void restore(Memento memento) {
        this.article = memento.getState();
    }
}
