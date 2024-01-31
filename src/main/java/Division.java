import java.util.Scanner;

public class Division {

    public static void main(String[] args) {



        System.out.println(" Enter the integers: ");

        int n1, n2, n3;
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = n1/n2;

        try {
            System.out.println(n3);
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero cannot possible");
        }

        }

    }
