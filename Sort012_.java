public class Sort012_ {
    public static void sort_012(int arr[]) {
        int count_0 = 0,count_1 = 0,count_2 = 0;
        for(int j : arr) {
            if(j == 0) {
                count_0++;
            }
            else if(j == 1) {
                count_1++;
            }
            else {
                count_2++;
            }
        }

        int k = 0;
        while(count_0>0) {
            arr[k++] = 0;
            count_0--;
        }
        while(count_1>0) {
            arr[k++] = 1;
            count_1--;
        }
        while(count_2>0) {
            arr[k++] = 2;
            count_2--;
        }
    }

    public static void display(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {2,2,1,2,2,0,1,0,2,0};
        
        System.out.println("Before Sorting : ");
        display(arr);

        System.out.println("After Sorting : ");
        sort_012(arr);
        display(arr);
        
    }
}