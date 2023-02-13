public class BubbleSort { 
    public static void bubble_Sort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        int arr[] = {2,5,6,3,1,8};
        
        System.out.println("Before Sorting ");
        printArray(arr);
        
        System.out.println("After Sorting Array ");
        bubble_Sort(arr);
        printArray(arr);
    }    
}
