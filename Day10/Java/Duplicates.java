

public class Duplicates {

public static boolean DuplicatesChecker(int[] number) {

for (int index = 0; index < number.length; index++) {

for (int count = index + 1; count < number.length; count++) {

if (number[index] == number[count]) {

return true;
}
}
}

return false;  
}
}








































































//public static void main(String[] args) {
//
//int[] number = {1, 2, 3, 1};
//
//boolean result = checkDuplicates(number);
//
//System.out.println(result);
//}
//}



