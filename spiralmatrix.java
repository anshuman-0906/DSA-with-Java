public class spiralmatrix {
    public static void spiral(int matrix[][]){
        int sr=0,sc=0,er=matrix.length-1,ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++)
                System.out.print(matrix[sr][i]);

             for(int i=sr+1;i<=er;i++)
                System.out.print(matrix[i][ec]);

             for(int i=ec-1;i>=sc;i--){
               if (sr==er) break;
               System.out.print(matrix[er][i]);
                 }

             for(int i=er-1;i>=sr+1;i--){
               if (sc==ec) break;
               System.out.print(matrix[i][sc]);
                 }
            sr++; ec--; er--; sc++;             
        }
    }
    

public static void main(String[]args){
    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    spiral(matrix);
}
}
