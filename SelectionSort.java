public class SelectionSort {
    public static void selection(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int min_index = i;

            for(int j=i+1;j<n-1;j++) {
                if(arr[j]<arr[min_index])  {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }   
    
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {2,4,6,1,5,8};
        
        System.out.println("Orginal Array ");
        printArray(arr);
        System.out.println("After Sorting array ");
        selection(arr);
        printArray(arr);
        
    }
}