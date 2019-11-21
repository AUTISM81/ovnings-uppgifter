import java.util.Scanner;

public class ovning1 {
    public static void main(String[] args) {
        //scanner
        Scanner kb = new Scanner(System.in);

        //variable
        System.out.println("how many number would you like to count the average of?");
        int x = kb.nextInt();
        int [] b1 = new int [x];
        int count = 1;
        double summa = 0;

        //variable numbers
        System.out.println("Type in 10 the numbers you want to know the average of?");

        for (int i = 0; i < b1.length; i++){
            System.out.println("number " + count + ":");
            b1[i] = kb.nextInt();
            count++;
        }
        for (int y = 0; y < b1.length; y++){
            summa = summa + b1[y];
        }
                System.out.println("Your average is " + summa/x);
    }
}
