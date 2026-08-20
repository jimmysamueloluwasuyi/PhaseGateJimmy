import java.util.Scanner;

public class taskOne {

public static void main(String[] args) {


Scanner input = new Scanner(System.in);

int sum = 0;

for (int index =1; index <= 10; index++) {

System.out.println( "Enter a number; ");

int number = input.nextInt();

 sum += number;
 


}

System.out.println("Sum = " + sum);
}

}
