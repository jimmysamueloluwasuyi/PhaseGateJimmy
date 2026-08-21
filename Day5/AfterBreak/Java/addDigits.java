

public class addDigits{

  public static int sumOfDigits(int number){

int sum = 0;

int digit=0;

while(number!=0){

digit = number % 10;

sum = sum  + digit;

number = number/10;
  }
}
return sum;

