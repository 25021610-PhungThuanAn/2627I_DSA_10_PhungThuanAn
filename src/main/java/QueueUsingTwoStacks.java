public class QueueUsingTwoStacks<Item> {
    MyStack<Item> stackIn = new MyStack<>();
    MyStack<Item> stackOut = new MyStack<>();

    public void enqueue(Item item)
    {
        stackIn.push(item);
    }

    public Item dequeue() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }

        return stackOut.pop();
    }

    public void print()
    {
        if (stackOut.isEmpty())
        {
            while (!stackIn.isEmpty())
            {
                stackOut.push(stackIn.pop());
            }
        }
        System.out.println(stackOut.peek());

    }
}
