package Strategy;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new BubbleSortStrategy());
        System.out.println(context.doSomething());
        context.setMyStrategy(new MergeSortStrategy());
        System.out.println(context.doSomething());
    }
}
