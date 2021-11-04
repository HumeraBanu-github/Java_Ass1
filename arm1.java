import java.util.Scanner;
class arm1{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n>0)
        {
            sum = sum + (n%10)*(n%10)*(n%10);
            n=n/10;
        }
        if(sum == temp)
        {
            System.out.println("The number is Armstrong Number");
        }
        else
        {
            System.out.println("The number is not Armstrong Number");
        }
    }
}