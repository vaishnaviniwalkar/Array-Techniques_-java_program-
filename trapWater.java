package two_pointer;

public class trapWater {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = func(arr);
        System.out.println(res);
    }

    public static int func(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        int leftmax = arr[left], rightmax = arr[right];
        int water = 0;
        while(left<right){
            if(leftmax < rightmax){
                left++;
                leftmax = Math.max(leftmax, arr[left]);
                water += leftmax - arr[left];
            }
            else{
                right--;
                rightmax = Math.max(rightmax, arr[right]);
                water += rightmax - arr[right];
            }
        }
        return water;
    }
}
