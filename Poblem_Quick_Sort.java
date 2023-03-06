public class Poblem_Quick_Sort { 
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sortPartition(int arr[]) {
        int  l =0, r = arr.length-1;

        while(l<r) {
            while(arr[l]<0) {
                l++;
            }
            while(arr[r]>=0) {
                r--;
            }

            if(l<r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {3,2,-1,4,-5,3,-12,9,-2,0};
        sortPartition(arr);
        printArray(arr);
    }
    
}
