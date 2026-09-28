import java.util.NoSuchElementException;

public class MyStack<Item> {
    private class Node
    {
        Item item;      // Lưu dữ liệu cần
        Node next;      // Trỏ đến phần tử tiếp theo
    }

    private Node top;       // Trỏ đến phần tử trên cùng
    private int size;

    public MyStack()
    {
        top = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int getSize()
    {
        return this.size;
    }

    public void push(Item item)
    {
        this.size += 1;
        Node oldTop = top;
        top = new Node();
        top.item = item;
        top.next = oldTop;
    }

    public Item pop()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Stack is empty");
        }

        this.size -= 1;
        Item item = top.item;
        this.top = top.next;
        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return top.item;
    }

}
