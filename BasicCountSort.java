public class BasicCountSort {
    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void countSort(int arr[]) {
        int max = findMax(arr);
        int [] count = new int [max+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for(int i=0;i<count.length;i++) {
            for(int j=0;j<count[i];j++) {
                arr[k++] = i;
            }
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {2,4,2,6,4,1,3};

        System.out.println("Original Array : ");
        printArray(arr);

        System.out.println("Our sorted Array ");
        countSort(arr);
        printArray(arr);
    }
}