public class SimpleTextEditor {
    private StringBuilder text = new StringBuilder();
    MyStack<String> history = new MyStack<>();

    public void append(String chuoi)
    {
        history.push(text.toString());
        text.append(chuoi);
    }

    public void delete(int k)   // xoa di k ki tu cuoi cua van van
    {
        history.push(text.toString());
        text.delete(text.length() - k, text.length());
    }

    public void print(int k)
    {
        System.out.println(text.charAt(k - 1));
    }

    public void undo()
    {
        text = new StringBuilder(history.pop());
    }
}
