package Strategy;

public class Context {
    private Strategy myStrategy;

    public Context(Strategy strategy) {
        this.myStrategy = strategy;
    }

    public void setMyStrategy(Strategy strategy) {
        this.myStrategy = strategy;
    }

    public String doSomething() {
        return this.myStrategy.execute();
    }
}
