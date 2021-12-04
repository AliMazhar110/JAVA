package partTwo.pkgStack;

public interface IStack {
    public boolean push(int data);
    public int pop();
    public int peek();
    public boolean isEmpty();
    public boolean isFull();
}