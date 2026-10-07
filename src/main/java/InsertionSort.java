public class InsertionSort {
    public void insertIntoSorted(int[] arr)
    {
        int temp = arr[arr.length - 1];
        int i;
        for (i = (arr.length - 2); i >= 0; i--)
        {
            if (temp < arr[i])
            {
                arr[i + 1] = arr[i];
                printArray(arr);
            }
            else
            {
                arr[i + 1] = temp;
                printArray(arr);
                break;
            }
        }
        if (i == -1)
        {
            arr[0] = temp;
            printArray(arr);
        }
    }

    public void insertionSortPart2(int[] arr)
    {
        for (int j = 1; j <= arr.length - 1; j++)
        {
            int temp = arr[j];
            int i;

            for (i = j - 1; i >= 0; i--)
            {
                if (temp < arr[i])
                {
                    arr[i + 1] = arr[i];
                }
                else
                {
                    break;
                }
            }

            arr[i + 1] = temp;
            printArray(arr);
        }
    }
}