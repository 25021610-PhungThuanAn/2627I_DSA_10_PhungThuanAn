import java.util.Scanner;

public class EqualStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Đọc số lượng đĩa của 3 chồng
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // Tạo mảng tạm để hứng dữ liệu đầu vào (từ Đỉnh -> Đáy)
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];

        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        for (int i = 0; i < n3; i++) arr3[i] = sc.nextInt();

        // Khởi tạo 3 cấu trúc Stack tự code của bạn
        MyStack<Integer> stack1 = new MyStack<>();
        MyStack<Integer> stack2 = new MyStack<>();
        MyStack<Integer> stack3 = new MyStack<>();

        int sum1 = 0, sum2 = 0, sum3 = 0;

        // 2. Đẩy dữ liệu vào Stack (Duyệt vòng lặp ngược để đẩy từ Đáy lên)
        for (int i = n1 - 1; i >= 0; i--) {
            stack1.push(arr1[i]);
            sum1 += arr1[i];
        }
        for (int i = n2 - 1; i >= 0; i--) {
            stack2.push(arr2[i]);
            sum2 += arr2[i];
        }
        for (int i = n3 - 1; i >= 0; i--) {
            stack3.push(arr3[i]);
            sum3 += arr3[i];
        }

        // 3. Logic xử lý tìm độ cao chung lớn nhất
        while (true) {
            // Nếu 3 chồng cao bằng nhau thì dừng lại và in kết quả
            if (sum1 == sum2 && sum1 == sum3) {
                System.out.println(sum1);
                break;
            }

            // Tìm độ cao lớn nhất hiện tại
            int doCaoMax = Math.max(sum1, Math.max(sum2, sum3));

            // Rút đĩa ở chồng cao nhất và trừ đi tổng tương ứng
            if (doCaoMax == sum1) {
                sum1 -= stack1.pop();
            } else if (doCaoMax == sum2) {
                sum2 -= stack2.pop();
            } else if (doCaoMax == sum3) {
                sum3 -= stack3.pop();
            }
        }

        sc.close();
    }
}