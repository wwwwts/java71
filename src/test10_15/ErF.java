package test10_15;

public class ErF {
    public static int find(int [] arr,int num) {
        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<num){
                low=mid+1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,23,34,44,45,56,67,78};
        int index=find(arr,56);
        System.out.println(index+1);
    }
}
