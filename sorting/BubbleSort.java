public class BubbleSort {
    public static void main(String[] args)
    {
        int arr[]={56,5,33,24,87,6,4};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
