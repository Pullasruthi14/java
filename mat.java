import java.io.*;
import java.util.*;
class Matmul
{
    public static void main(String[] args) 
     {
      int[][] matrix1 = { {2, 3, 4},
                          {5, 6, 7},
                          {8, 9, 1} 
     };
      int[][] matrix2 = { {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}
     }:
      int[][] resultMatrix = new int[3][3];      
      for(int i = 0; i < 3; i++) 
      {
          for(int j = 0; j < 3; j++) 
          {
              for(int k = 0; k < 3; k++) 
              {
                  resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
              }
          }
      }     
     for(int i = 0; i < 3; i++)
     {    
         for(int j = 0; j < 3; j++) 
         {
             System.out.print(resultMatrix[i][j] + " ");
         }
         System.out.println();
      }
   }
}


