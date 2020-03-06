package arrays;

import java.util.Arrays;

public class rotation {
    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,3,4,5,6,7};
        print_array(leftRotateRecursive(arr,null,2 ,arr.length,arr.length-1));
    }
    public static int[] rightRotate(int[] arr, int d, int size) {
        int[] result = new int[size];

        for(int i=0;i<size;i++){
            if(i+d>size-1){
                result[((i+d)%size)] = arr[i];
            }
            else {
                result[i+d]=arr[i];
            }
        }
        return result;
    }
    public static int[] rightRotateRecursive(int[] arr,int[] result, int d, int size, int i) {
        if(result == null) result = new int[size];

        if(i+d>size-1){
            result[((i+d)%size)] = arr[i];
        }
        else {
            result[i+d]=arr[i];
        }
        if(i==size-1) return result ;
        return rightRotateRecursive(arr,result, d, size, i+1);

    }
    public static int[] leftRotateRecursive(int[] arr,int[] result, int d, int size, int i) {
        if(result == null) result = new int[size];

        if(i<0) return result ;

        if(i-d<0){
            result[((i-d)+size)] = arr[i];
        }
        else {
            result[i-d]=arr[i];
        }
        
        return leftRotateRecursive(arr,result, d, size, i-1);
    }
    public static int[] leftRotate(int[] arr, int d, int size) {
        int[] result = new int[size];
        
        for(int i=size-1;i>=0;i--){
            if(i-d<0){
                result[(size+(i-d))] = arr[i];
            }
            else {
                result[i-d]=arr[i];
            }
        }
        return result;
    }
    
    public static void print_array(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }

    
}