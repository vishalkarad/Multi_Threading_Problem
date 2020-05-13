public class StackPop extends PushAndPop implements Runnable {
    @Override
    public void run() {
        for (int pop = 1; pop < 20; pop++) {
            if (STACK.isEmpty())
                System.out.println("The Stack is Empty");
            else {
                System.out.println("Pop This Value : " + STACK.peek());
                STACK.pop();
            }
        }
    }
}
