package binarytree;


public class BuildMaxHeap {
  
    
    
    public static void main(String[] args) {
        int[] heapArray = {1,3,6,5,9,8};
        
        for (int i : minHeapInsert(heapArray, 2)) {
            System.out.print(i +",");
        }


    }
    public static int[] minHeapInsert(int[] heapArray, int data)
    {
        int size = heapArray.length+1;
        int[] finalArray = new int[size];   
        
        for (int i=0;i<size-1;i++)
        {
            finalArray[i] = heapArray[i];
        }
        finalArray[size-1] = data;
       
        int index = size  ;
        try{
            while(finalArray[index-1] > finalArray[index/2-1])
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