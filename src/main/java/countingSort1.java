public class countingSort1 {
    public static void countingSort(int[] arr)
    {
        int[] counts = new int[100];

        for (int i = 0; i < arr.length; i ++)
        {
            int number = arr[i];
            counts[number]++;
        }

        for (int i = 0; i < counts.length; i++)
        {
            System.out.print(counts[i] + " ");
        }
        System.out.println();
    }
}
