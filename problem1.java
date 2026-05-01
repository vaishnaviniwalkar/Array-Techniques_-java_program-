package sliding_window;
 
// max sum subarray of size k
public class problem1 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,10,23,3,1,0,20};
        int res = func(arr, 4);
        System.out.println(res);
    }
    public static int func(int arr[], int k){
        int sum = 0;
        int n = arr.length;
        for(int i=0; i<k; i++){
            sum = sum + arr[i];
        }
        int maxsum = sum;
        for(int j=k; j<n; j++){
            sum = sum + arr[j] - arr[j-k];
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
        
    }
}
