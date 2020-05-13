import java.util.Stack;

public class PushAndPop {

    Stack<Integer> STACK = new Stack<>();
    public static void main(String[] args) {
        StackPop pop = new StackPop();
        StackPush push = new StackPush();
        Thread popStack = new Thread(pop);
        Thread pushStack = new Thread(push);
        pushStack.start();
        popStack.start();
    }
}
