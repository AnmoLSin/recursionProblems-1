/*
Binary Searching.
 */
package recursion;

public class binary {
    public static void main(String[] args) {
        int[] arr={11,34,56,77,88,99,123,456,2345};
        System.out.println("BinarySearch : "+search(arr,99,0,arr.length-1));
    }
    public static int search(int[] arr,int n,int s,int e)
    {
        if(s<=e)
        {
            int middle=(s+e)/2;
            if(arr[middle]>n)
            {
                return search(arr,n,s,middle-1);
            }
            else if(arr[middle]<n){
                return search(arr,n,middle+1,e);
            }
            else if(arr[middle]==n)
                return middle;
        }
        else
            return -1;
        return 0;
    }
}
