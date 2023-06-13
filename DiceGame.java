import java.util.Scanner;
import java.util.Random;

class DiceGame{
    public static void main(String[] args){
        
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        int a=0;
        int b=0;

        Random random = new Random();
        a = random.nextInt(6) + 1;
        b = random.nextInt(6) + 1;
        int sum = a + b;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + a);
        System.out.println("Die 2: " + b);
        System.out.println("Total value: " + sum);
    }
}