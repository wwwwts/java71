package test10_15;

public class Yans {
    public static int abb(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > num) {
                high = mid - 1;
            } else if (array[mid] < num) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

   public static void mian (String [] args) {
        int[] arry={12,23,34,45,56,78,87};
        int num=78;
        int index=abb(arry,num);
        System.out.println(index+1);
    }
}


