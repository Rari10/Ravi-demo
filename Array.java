import java.util.*;
public class Array {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows in array element");
        int rows=sc.nextInt();

        System.out.println("enter number of columns in array element");
         int cols=sc.nextInt();

         int numbers [][]=new int[rows][cols];
        sc.close();
        for(int i=0;i<=2;i++)       
        {
            for(int j=0;j<=2;j++)
            {
               numbers [i][j]= sc.nextInt();
            }
        }

             for(int i=0;i<=2;i++)
            {
                for(int j=0;j<=2;j++)
                {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
    } 
}
    
    