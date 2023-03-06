public class Problem_3 {
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void partition(int arr[]) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            while (arr[l] < 0)
                l++;
            while (arr[r] >= 0)
                r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

        }
    }

    public static void man(String args[]) {
        int[] arr = { -13, 20, 7, 0, -4, -13, 11, -5, -3 };

        System.out.println("Orginal array : ");
        display(arr);

        System.out.println("After sorting ");
        partition(arr);
        display(arr);
    }
}