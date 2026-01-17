package Memento;

/**
 * Originator class for the Memento design pattern.
 * Creates mementos containing snapshots of its internal state,
 * and can restore its state from a previously saved memento.
 */
public class Originator {

    private String article;

    /**
     * Constructs an Originator with no initial state.
     */
    public Originator() {
        this.article = "";
    }

    /**
     * Constructs an Originator with an initial article.
     *
     * @param article the initial article content
     */
    public Originator(String article) {
        this.article = article;
    }

    /**
     * Gets the current article content.
     *
     * @return the article
     */
    public String getArticle() {
        return article;
    }

    /**
     * Sets the article content.
     *
     * @param article the article to set
     */
    public void setArticle(String article) {
        this.article = article != null ? article : "";
        System.out.println("Article changed to: " + this.article);
    }

    /**
     * Creates a memento capturing the current state.
     *
     * @return a Memento containing the current state
     */
    public Memento save() {
        return new Memento(article);
    }

    /**
     * Restores the state from a memento.
     *
     * @param memento the memento to restore from
     */
    public void restore(Memento memento) {
        if (memento != null) {
            this.article = memento.getState();
            System.out.println("Restored state to: " + this.article);
        } else {
            System.out.println("Error: Cannot restore from null memento");
        }
    }

    /**
     * Returns a string representation of the originator.
     *
     * @return the current state
     */
    @Override
    public String toString() {
        return "Originator{" +
                "article='" + article + '\'' +
                '}';
    }
}
