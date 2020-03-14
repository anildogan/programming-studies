package binarytree;


public class BuildMinHeap {
  
    
    
    public static void main(String[] args) {
        int[] heapArray = {3,5,6,8,2,1};
        for (int i : minHeapSort(heapArray)) {
            System.out.print(i +",");
        }
    }

    
    public static int[] minHeapSort(int[] heapArray)
    {
        int size = heapArray.length;
        int fixedSize = heapArray.length;
        
        int[] sortedArray = new int[size];
        
        int[] temp = null;
        for (int i : heapArray) {
            temp = minHeapInsert(temp, i);
        }
        heapArray = temp;
        int index = 0;
        
        while(index < fixedSize){
            
            sortedArray[index] = heapArray[0];
            int[] arr = new int[size-1];
            for (int i=0;i<size-1;i++)
            {
                arr[i] = heapArray[i+1];
            }

            
            int[] myArray = null;
            for (int i : arr) {
                myArray = minHeapInsert(myArray, i);
            }
            heapArray = myArray ;
            index++;
            if(heapArray != null) size = heapArray.length;
            System.out.println("sa");
            
            
        }
        return sortedArray;
    }
    public static int[] minHeapInsert(int[] heapArray, int data)
    {
        int size ;
        int[] finalArray; 
        if(heapArray == null) {
            size = 1;
            finalArray = new int[1]; 
            finalArray[0] = data;
            return finalArray;
        }
        else {

            size = heapArray.length+1;
            finalArray = new int[size];   
            
        }
        for (int i=0;i<size-1;i++)
        {
            finalArray[i] = heapArray[i];
        }
        finalArray[size-1] = data;
       
        int index = size  ;
        try{
            while(finalArray[index-1] < finalArray[index/2-1])
            {
                int temp = finalArray[index-1];
                finalArray[index-1] = finalArray[index/2-1] ;
                finalArray[index/2-1] = temp;
                index = index/2;
            }
        }
        catch (IndexOutOfBoundsException ex)
        {
            return finalArray;
        }
        
        return finalArray;
    }
 

    }