import java.util.Scanner;

public class Question_4 {

    enum days{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        try {
            int d = sc.nextInt();
            try {
                System.out.println(days.values()[d - 1]);
            }
            catch(Exception e)
            {
                System.out.println("Not a valid day number");
            }
        }
        catch(Exception e)
        {
            System.out.println("Not a number");
        }

    }
}