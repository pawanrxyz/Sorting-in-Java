public class Problem_2 {
    public static void  display(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void partion(int arr[]) {

        int l = 0, r = arr.length-1;

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
        int arr[] = {34,5,0,21,-1,45,-4,4,-34};

        partion(arr);
        display(arr);
    }
}