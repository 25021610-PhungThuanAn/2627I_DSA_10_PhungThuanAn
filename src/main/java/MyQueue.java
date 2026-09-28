import java.util.NoSuchElementException;

public class MyQueue<Item> {
    private class Node
    {
        Item item;      // Luu du lieu can thiet
        Node next;      // Chi den phan tu tiep theo
    }

    private int size;
    private Node first;      // Chi den phan tu dau tien
    private Node last;       // Chi den phan tu cuoi cung

    public MyQueue()
    {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty()
    {
        return this.first == null;
    }

    public int getSize()
    {
        return this.size;
    }

    public void enqueue(Item item)
    {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty())
        {
            first = last;
        }
        else
        {
            oldLast.next = last;
        }
        this.size += 1;
    }

    public Item dequeue()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Queue is empty");
        }
        Item item = first.item;
        this.first = first.next;
        this.size -= 1;
        if (isEmpty())
        {
            last = null;
        }
        return item;


    }
}
