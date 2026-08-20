







import java.util.Scanner;

public class taskThree {

public static void main(String[] args) {


Scanner input = new Scanner(System.in);

int sum = 0;

int average = 0;

for (int index =1; index <= 10; index++) {

System.out.println( "Enter a number; ");

int number = input.nextInt();

 sum += number;
 
average = sum/10;

}
System.out.println("Sum = " + sum);
System.out.println("average = " + average);
}

}
