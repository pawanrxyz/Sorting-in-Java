public class Problem_Sort {
    public static void sortArr(int num[]) {
        int n = num.length;
        int x = -1,y = -1;

        if(n<=1) {
            return;
        }
        for(int i=1;i<n;i++) {
            if(num[i-1]>num[i]) {
                if(x == -1) { //first conflict
                    x = i-1;
                    y = i;
                } else {
                    y = i; //second conflict
                }
            }
        }
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

    public static void displayArr(int num[]) {
        for(int i=0;i<num.length;i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int num[] = {10,5,6,7,8,9,3};

        System.out.println("Original Array : ");
        displayArr(num);

        System.out.println("After sorting ");
        sortArr(num);
        displayArr(num);
    }
}