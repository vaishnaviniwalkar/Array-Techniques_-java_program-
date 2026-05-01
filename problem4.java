package sliding_window;

// Subarray product less than k
public class problem4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 0;
        System.out.println(func(arr,k));
        
    }
    public static int func(int arr[], int k){
        if(k<=1){
            return 0;
        }
        int n = arr.length;
        int left = 0, count = 0, prod = 1;
        for(int r=0; r<n ; r++){
            prod *= arr[r];
            while(prod>=k){
                prod /= arr[left];
                left++;
            }
            count += r- left + 1;
        }
        return count;
    }    
}
