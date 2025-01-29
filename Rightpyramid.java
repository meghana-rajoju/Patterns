import java.util.Scanner;
public class Rightpyramid{
    public static void main(String[] args) {
        int i,j,row;
        System.out.println("Enter row:");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        for(i=0;i<row;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
