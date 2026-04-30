package two_pointer;

import java.util.Arrays;

public class moveZeros{
    public static void main(String[] args) {
        int arr[] = {1,0,12,0,8,0};
        int res[] = func(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] func(int[] arr){
        int j=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=j; i<n; i++){
            arr[i] = 0;
        }
        return arr;
    }
} 