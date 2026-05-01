package sliding_window;

// max consecutive ones part III (leetcode)
public class problem3 {

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(func(arr,k));
    }

    public static int func(int arr[], int k){
        int n = arr.length;
        int zerocount = 0;
        int l = 0;
        for(int r = 0; r<n; r++){
            if(arr[r] == 0){
                zerocount++;
            }
            if(zerocount>k){
                if(arr[l] == 0){
                    zerocount--;
                }
                l++;
            }            
        }
        return n-l;
    }
}