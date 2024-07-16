
package three_d_array;

import java.util.Scanner;

public class Three_D_Array 
{
   Scanner data = new Scanner(System.in); 
    private int[][][] three_D_Array = new int[2][2][2];
    
    public Three_D_Array()
    {
        for( int a = 0; a < three_D_Array.length; a++ )
        {
            int b = 0;
            while( b < three_D_Array.length )
            {
                 int c = 0;
                 do
                 {
                     System.out.print("Enter value into three_D_Array["+a+"]["+b+"]["+c+"] = ");
                     three_D_Array[a][b][c] = data.nextInt();
                     c++;
                 }
                 while( c < three_D_Array.length );
                 System.out.println("");
                b++;
            }
        }
        int d = 0; 
        do
        {
            int e = 0;
            while( e < three_D_Array.length )
            {
                for( int f = 0; f < three_D_Array.length; f++ )
                {
                    System.out.print(three_D_Array[d][e][f]+"\t");
                }
                System.out.println("");
                e++;
            }
            d++;
        }
        while( d < three_D_Array.length );
    }
    
    public int[][][] getThree_D_Array()
    {
        return three_D_Array;
    }
    
}
