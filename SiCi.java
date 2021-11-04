import java.util.Scanner;
public class SiCi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        int p = sc.nextInt();
        System.out.println("Enter the Rate");
        int r = sc.nextInt();
        System.out.println("Enter the Time");
        int t = sc.nextInt();
        int SI = ((p*r*t)/100);
        System.out.println("The Simple interest is " + SI);
        System.out.println("Enter the number of compounding");
        int n = sc.nextInt();
        double A = p*(1+r/n)^n*t;
        double CI = A - p;
        System.out.println("Compund Interest" + CI);
    }
}
