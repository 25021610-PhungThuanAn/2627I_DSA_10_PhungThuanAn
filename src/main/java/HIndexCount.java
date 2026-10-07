import java.util.Scanner;

public class HIndexCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int hIndex = 0;

        for (int i = 0; i < N; i++) {
            int thuTuBaiBao = i + 1;
            if (arr[i] >= thuTuBaiBao) {
                hIndex = thuTuBaiBao;
            } else {
                break;
            }
        }

        System.out.println(hIndex);
        sc.close();
    }
}