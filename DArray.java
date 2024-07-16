
package pkg3.d.array;

import java.util.Scanner;

public class DArray
{

    public static void main(String[] args)
    {
        System.out.println("\t----------->>>> Static 3 D Array <<<<------------");
      int[][][] thirdDiamensionalArrayName = { { {0,1,2} , {3,4,5} , {7,8,9} } , { {10,11,12} , {13,14,15} , {16,17,18} } , { {19,20,21} , {22,23,24} , {25,26,27} } };  
      for( int a = 0; a < thirdDiamensionalArrayName.length; a++ )
      {
          int b = 0;
          while( b < thirdDiamensionalArrayName.length )
          {
              int c = 0;
              do
              {
                  System.out.print(thirdDiamensionalArrayName[a][b][c]+"\t"); 
                  c++;
              }
              while( c < thirdDiamensionalArrayName.length );
              System.out.println("");
              b++;
          }
      }
        System.out.println("\t\t~~~~~~~~~~~~~ Dynamic 3 D Array ~~~~~~~~~~~~~~~~");
     Scanner data = new Scanner(System.in); 
       
     int rowSize , columnSize , elementSize;
      System.out.print("Enter row size = ");
      rowSize = data.nextInt();
        System.out.print("Enter column size = ");
        columnSize = data.nextInt();
         System.out.print("Enter element size = ");
         elementSize = data.nextInt();
       
      int[][][] arrayName = new int[rowSize][columnSize][elementSize];
       for( int d = 0; d < arrayName.length; d++ )
       {
           int e = 0;
           while( e < arrayName.length )
           {
               int f = 0;
               do
               {
                   System.out.print("Enter value into arrayName["+d+"]["+e+"]["+f+"] = ");
                   arrayName[d][e][f] = data.nextInt();
                   f++;
               }
               while( f < arrayName.length );
               e++;
           }
       }
       int g = 0;
       do
       {
           int h = 0;
           while( h < arrayName.length )
           {
               for( int i = 0; i < arrayName.length; i++ )
               {
                   System.out.print(arrayName[g][h][i]+"\t");
               }
               h++;
               System.out.println("");
           }
           g++;
       }
       while( g < arrayName.length );
       
       /* int g = 0;
       do
       {
           int h = 0;
           while( h < arrayName.length )
           {
               for( int i = 0; i < arrayName.length; i++ )
               {
                   System.out.print("arrayName["+g+"]["+h+"]["+i+"] = "+arrayName[g][h][i]);
               }
               h++;
           }
           g++;
       }
       while( g < arrayName.length ); */
    }
    
}
