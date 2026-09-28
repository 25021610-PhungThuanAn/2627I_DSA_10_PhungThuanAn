import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class w3_tailop_25021610 {

    public static int mucDoUuTien(String op) {
        if (op.equals("*") || op.equals("/"))
            return 2;
        if (op.equals("+") || op.equals("-"))
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập trung tự:");
        String chuoi = sc.nextLine();

        Stack<String> Toan_tu = new Stack<>();
        ArrayList<String> Ket_qua = new ArrayList<>();

        String[] mang_chuoi = chuoi.split("(?<=[-+*/()])|(?=[-+*/()])");

        for(int i = 0; i < mang_chuoi.length; i++) {
            String s1 = mang_chuoi[i].trim();
            if (s1.isEmpty())
                continue;

            if (s1.equals("(")) {
                Toan_tu.push(s1);
            }
            else if (s1.equals(")")) {
                // Rút toán tử ra cho đến khi gặp dấu "("
                while (!Toan_tu.isEmpty() && !Toan_tu.peek().equals("(")) {
                    Ket_qua.add(Toan_tu.pop());
                }
                if (!Toan_tu.isEmpty()) {
                    Toan_tu.pop(); // Xóa dấu "(" khỏi stack
                }
            }
            else if (s1.equals("+") || s1.equals("-") || s1.equals("*") || s1.equals("/")) {
                while (!Toan_tu.isEmpty() && mucDoUuTien(Toan_tu.peek()) >= mucDoUuTien(s1)) {
                    Ket_qua.add(Toan_tu.pop());
                }
                Toan_tu.push(s1);
            }
            else {
                Ket_qua.add(s1);
            }
        }

        while (!Toan_tu.isEmpty()) {
            Ket_qua.add(Toan_tu.pop());
        }

        System.out.println("Chuỗi hậu tố: " + String.join(" ", Ket_qua));
    }
}