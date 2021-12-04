package partTwo;

import partTwo.pkgStack.IStack;

public class FixedStack implements IStack {

    private int size;
    private int currentSize;
    private int[] fixedStack;

    public FixedStack(int size) {
        this.size = size;
        this.currentSize = -1;
        this.fixedStack = new int[size];
    }

    @Override
    public boolean push(int data) {
        if (!isFull()) {
            this.fixedStack[++this.currentSize] = data;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int poppedElement = -1;
        if (!isEmpty())
            poppedElement = this.fixedStack[this.currentSize--];
        return poppedElement;
    }

    @Override
    public int peek() {
        return this.fixedStack[this.currentSize];
    }

    @Override
    public boolean isEmpty() {
        if (this.currentSize == -1)
            return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if (this.currentSize == this.size - 1)
            return true;
        return false;
    }
}

