import java.util.Scanner;

public class ovning1 {
    public static void main(String[] args) {
        //scanner
        Scanner kb = new Scanner(System.in);

        //variable
        int [] b1 = new int [10];
        int count = 1;

        //variable numbers
        System.out.println("Type in 10 the numbers you want to know the average of?");

        for (int i = 0; i < b1.length; i++){
            System.out.println("number " + count + ":");
            b1[i] = kb.nextInt();
            count++;
        }
        double summa = b1[1] + b1[2] + b1[3] + b1[4] + b1[5] + b1[6] + b1[7] + b1[8] + b1[9] + b1[0];
                System.out.println("Your average is " + summa/10);
    }
}
