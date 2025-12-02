import java.util.Arrays;

class Merge_sort {

    public static void main(String ar[]) {
        int arr[] = {5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int [] arr,int start,int end)
    {
      if(end-start==1)
      {
        return ;
      }
      int mid=start+(end-start)/2;

      mergeSort(arr, start, mid);
      mergeSort(arr,mid,end);

      merge(arr,start,mid,end);

    }
    static void merge(int [] arr,int start,int mid,int end)
    {
      int temp[]=new int[end-start];

      int i=start;
      int j=mid;
      int k=0;
      
      while(i<mid &&j<end)
      {
        if(arr[i]<arr[j])
        {
          temp[k]=arr[i];
          i++;
          k++;
        }
        else{
          temp[k]=arr[j];
          j++;
          k++;
        }
      }
      while(i<mid)
      {
        temp[k]=arr[i];
        i++;
        k++;
      }
      while(j<end){
        temp[k]=arr[j];
        j++;
        k++;
      }
      for(int l=0;l<temp.length;l++)
      {
        arr[start+l]=temp[l];
      }   
    }
}
