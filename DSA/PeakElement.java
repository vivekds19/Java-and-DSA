class PeakElement {
    public static void main(String[] args) {
        int arr[]={0,10,5,2,20};
        System.out.println(peak(arr));

    }
    static int peak(int arr[])
    {
        int index=0;
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        return index;  
    } 
}