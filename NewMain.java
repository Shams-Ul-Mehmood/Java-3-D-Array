
package three_d_array;

import java.util.Scanner;

public class NewMain 
{

    public static void main(String[] args) 
    {
        Three_D_Array threeD_Array = new Three_D_Array();
        
        Scanner data1 = threeD_Array.data;
        
        int[][][] three_D_Array = threeD_Array.getThree_D_Array();
        
        System.out.println( threeD_Array);
    }
    
}
