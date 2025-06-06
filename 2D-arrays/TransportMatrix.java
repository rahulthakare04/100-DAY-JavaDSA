public class TransportMatrix {
  public static void main(String[] args) {
    int row=2,col=3;
    int arr[][]={{11,12,13},{21,22,23}};

    //creating the new trasport mateix 
    int tp[][]=new int [col][row];

    //logic for transport the mateix 
    for(int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            tp[j][i]=arr[i][j];

        }
    }
    //print the real matrx 
    
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    //print the tp matrix 
    for(int i=0;i<col;i++){
        for(int j=0;j<row;j++){
            System.out.print(tp[i][j]+" ");
        }
        System.out.println();
    }


  }  
}
