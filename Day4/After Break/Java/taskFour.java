





import java.util.Scanner;

public class taskFive {

public static void main(String[] args) {


Scanner input = new Scanner(System.in);

int sum = 0;

for (int index =1; index <= 10; index++) {

System.out.println( "Enter a number; ");

int number = input.nextInt();
if (number %2 ==0){

 sum += number;
}
 
}
System.out.println("Sum = " + sum);
}

}
