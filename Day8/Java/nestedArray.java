

public class nestedArray {


public static int[] sumOfNestedArray(int[][] array) {

int[] numbers = new int[array.length];

for (int counter = 0; counter < array.length; counter++) {

int sum = 0;

for (int index = 0; counter < array[counter].length; index++) {

sum += array[counter][index];
}

numbers[counter] = sum;
}

return numbers;
}

}
