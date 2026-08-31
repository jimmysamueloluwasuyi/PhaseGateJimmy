
public class LowestCommonDenominator {

public static void main(String[] args) {

int firstNumber = 4;

int secondNumber = 6;

int lcm = 1;

for (int index = 1; ; index++) {

if (index % firstNumber == 0 && index % secondNumber == 0) {

lcm = index;

break;
}
}

System.out.println("LCM = " + lcm);
}
}













