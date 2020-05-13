public class StackPush extends PushAndPop implements Runnable {
    @Override
    public void run() {
        for (int value = 1; value <= 20; value++) {
            STACK.push(value);
            System.out.println("Stack Push "+STACK);
        }
    }
}
