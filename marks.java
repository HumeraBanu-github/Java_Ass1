import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the marks");
        for (int i=0 ;i<3 ;i++)
        {
            for(int j= 0; j<3 ;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //reading the values
        for (int i=0 ;i<3 ;i++)
        {
            for(int j= 0; j<3 ;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
        //calculating the average of all the subjects
        for (int i=0 ;i<3 ;i++)
        {
            int sum=0;
            for(int j= 0; j<3 ;j++)
            {
                sum =sum + arr[i][j];  
            }
            System.out.println(" sum of subject" + sum);
            System.out.println("Average of subject" + sum/3);
        }
        //calculating the average and sum of all marks
        for (int i=0 ;i<3 ;i++)
        {
            int sum = 0;
            for(int j= 0; j<3 ;j++)
            {     
                sum =sum + arr[j][i];   
            }
            System.out.println(" sum of marks" + sum);
            System.out.println("Average of marks" + sum/3);
        }
    }
}
