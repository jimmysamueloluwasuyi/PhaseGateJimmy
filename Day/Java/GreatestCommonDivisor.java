

public class GreatestCommonDivisor {

public static void main(String[] args) {

int firstNumber = 12;

int secondNumber = 8;

int gcd = 1;

for (int index = 1; index <= firstNumber && index <= secondNumber; index++) {

if (firstNumber % index == 0 && secondNumber % index == 0) {

gcd = index;
}
}

System.out.println("GCD = " + gcd);
}
}
