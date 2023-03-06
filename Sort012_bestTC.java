public class Sort012_bestTC {
    public static void display(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int a[],int x,int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    // sort
    static void sort012(int[] a) {
        int lo = 0, mid = 0, hi = a.length - 1;

        while (mid <= hi) {
            if (a[mid] == 0) {
                swap(a, mid, lo);
                mid++;
                lo++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a, mid, hi);
                hi--;
            }
        }
    }

    public static void main(String args[]) {
        int[] num = { 2, 2, 0, 0, 1, 1, 2, 0, 1, 0 };

        System.out.println("Before sorting ");
        display(num);
        System.out.println("After Sorting ");
        sort012(num);
        display(num);
    }

}
