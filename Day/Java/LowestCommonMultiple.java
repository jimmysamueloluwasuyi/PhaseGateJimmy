
public class LowestCommonMultiple {

public static void main(String[] args) {

int firstNumber = 8;

int secondNumber = 12;

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













