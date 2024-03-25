import java.util.Scanner;
public class Main
{
    public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in); 
         System.out.println("enter the base of square matrices");   
         n=sc.nextInt();
        int[][]a=new int[n][n];
        int[][]b=new int[n][n];
        int[][]c=new int[n][n];
        System.out.println("enter the elements of 1st matrix row wise\n ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
              b[i][j]=sc.nextInt();
        System.out.println("multiplying the matrices...");
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
        {
               c[i][j]=c[i][j]*a[i][k]*b[k][j];
        System.out.println("the product is:");
        for( i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
        System.out.println(c[i][j]+"");
        System.out.println();
        sc.close();
        }
               
        }    
        }
        }
    
    }
}
