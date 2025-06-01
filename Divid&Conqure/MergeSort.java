public class MergeSort {
    
    
    public static void mergeSort(int a[],int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergeSort(a, lb, mid);
            mergeSort(a, mid+1, ub);
            merge(a,lb,mid,ub);
        }
    }
    
    public static void merge(int a[],int lb,int mid,int ub){

        int temp[]=new int[ub-lb+1];
        int i=lb;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ub){

            if(a[i]<=a[j]){
                temp[k]=a[i];
                i++;
            }
            else{
                temp[k]=a[j];
                j++;
            }
            k++;
        }

        if(i>mid){
            while(j<=ub){
                temp[k]=a[j];
                k++;j++;
            }
        }
        else{
            while(i<=mid){
                temp[k]=a[i];
                k++;i++;

            }
            
        }

        //copy to temp arry in origanal array
     for(int m = 0; m < temp.length; m++) {
       a[lb + m] = temp[m];}  // ✅ Corrected
}



    
   public static void printArray(int a[]){
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();

   }
    
    public static void main(String[] args) {
        int a []={5,9,1,3,7,6,40};
        mergeSort(a, 0, a.length-1);
        printArray(a);

    }
}
