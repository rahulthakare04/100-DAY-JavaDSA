public class QuickSortAlgo {




    public static void printArr(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }




        public static void quickSort(int arr[],int si,int ei){
            if(si>=ei){
                return;
            }

            //last element 
            int pIdx=prtition(arr,si,ei);
            quickSort(arr, si, pIdx-1);//left part 
            quickSort(arr, pIdx+1, ei);//right part 
        }



        public static int prtition(int arr[],int si,int ei){
            int pivot=arr[ei];
            int i=si-1;

            for(int j=si;j<ei;j++){
                if(arr[j]<=pivot){
                    i++;
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            i++;
            int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp;
            return i;
        }
    public static void main(String[] args) {
        int arr[]={4,8,2,6,1,7,6};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
