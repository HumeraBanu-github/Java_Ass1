import java.util.Scanner;

public class Cui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String username = "", password ="";
        do{
            System.out.println("ENter the username");
            username = sc.nextLine();
            System.out.println("ENter the PAssword");
            password = sc.nextLine();
            if(username.equals("Humera") && password.equals("Humera"))
            {
                System.out.println("Welcome " + username);
                return;
            }
            else{
                System.out.println("Incorrect Details Try Again!");
                count++;
            }
            
        }
        while(count<3);
        {
            System.out.println("contact Admin");
        }
    }
}
