import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CTC");
        double c = sc.nextDouble();
        if(c<180000)
        {
            System.out.println("The payable tax is NILL" );
        }
        else if(c > 181001 && c<300000)
        {
            System.out.println("The payable tax is " + c*0.1 );
        }
        else if(c > 300001 && c<500000)
        {
            System.out.println("The payable tax is " + c*0.2 );
        }
        else if(c > 500001 && c<1000000)
        {
            System.out.println("The payable tax is " + c*0.3 );
        }
    }
}
