package partTwo;

import partTwo.pkgStack.IStack;
import java.util.Vector;

public class GrowableStack implements IStack {

    private static Vector<Integer> growableStack;

    public GrowableStack() {
        growableStack = new Vector<Integer>();
    }

    @Override
    public boolean push(int data) {
        growableStack.add(data);
        return true;
    }

    @Override
    public int pop() {
        int poppedElement = -1;
        int size = growableStack.size() - 1;
        if (!isEmpty())
            poppedElement = growableStack.get(size);
        growableStack.remove(size);
        return poppedElement;
    }

    @Override
    public int peek() {
        int size = growableStack.size() - 1;
        return growableStack.get(size);
    }

    @Override
    public boolean isEmpty() {
        return growableStack.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

}
