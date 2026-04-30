package two_pointer;

public class mostWater {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int res = func(arr);
        System.out.println(res);
    }

    public static int func(int[] arr){
        int n = arr.length;
        int maxArea = 0;
        int l=0, r=n-1;
        while(l<r){
            int h = Math.min(arr[l],arr[r]);
            int w = r-l;
            int area = h*w;
            maxArea = Math.max(area, maxArea);
            if(arr[l] <= arr[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}
