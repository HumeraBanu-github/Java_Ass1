import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of subject1");
        int sub1 = sc.nextInt();
        System.out.println("Marks of subject2");
        int sub2 = sc.nextInt();
        System.out.println("Marks of subject3");
        var sub3 = sc.nextInt();
        double avg = (sub1 + sub2 + sub3)/3;
        System.out.println("average = " + avg);
        if( sub1>60 && sub2>60 && sub3>60)
        {
            System.out.println("Passed");     
        }
        else if(sub1>60 && sub2 >60 || sub3 > 60)
        {
            System.out.println("Promoted");
        }
        else if (sub1>60 || sub2<60 && sub3 < 60)
            {
                System.out.println("Failed");
            }
        
    }
    
}
