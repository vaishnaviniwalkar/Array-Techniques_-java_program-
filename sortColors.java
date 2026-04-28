package two_pointer;

import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int arr[] = {1,1,0,2,0,1,2,0,2};
        int res[] = func(arr);
        System.out.println(Arrays.toString(res));

    }
    public static int[] func(int arr[]){
        int n = arr.length;
        int countzero = 0, countone = 0, counttwo = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                countzero++;
            }
            if(arr[i] == 1){
                countone++;
            }
            if(arr[i] == 2){
                counttwo++;
            }
        }
        int idx = 0;
        while (countzero > 0) {
            arr[idx++] = 0;
            countzero--;
        }
        while (countone > 0) {
            arr[idx++] = 1;
            countone--;
        }
        while (counttwo > 0) {
            arr[idx++] = 2;
            counttwo--;
        }
        return arr;
    }
}
