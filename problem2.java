package sliding_window;

// max consecutive ones
public class problem2 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,1,1,1,0,1};
        System.out.println(func(arr));
    }
    public static int func(int[] arr){
        int n =  arr.length;
        int maxcount = 0;
        int currcount = 0;
        for(int j=0; j<n; j++){
            if(arr[j] == 1){
                currcount++;
            }
            else{
                maxcount = Math.max(maxcount, currcount);
                currcount = 0;
            }
            
        }
        return Math.max(maxcount, currcount);
    }
}
