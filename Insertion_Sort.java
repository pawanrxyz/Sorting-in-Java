public class Insertion_Sort { 
    public static void insertion_Sort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int j = i;
            while(j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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
        int arr[] = {2,3,6,1,4,7,8};
        System.out.println("Before Sorting Array ");
        printArray(arr);

        System.out.println("After Sorting Array ");
        insertion_Sort(arr);
        printArray(arr);
    }
    
}
