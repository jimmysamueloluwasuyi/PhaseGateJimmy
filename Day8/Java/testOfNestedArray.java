





import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class nestedArray {
  
@Test

public void testThatTheElementsInArraysInsideAnotherArrayAreAdded(){

//Given

int[][] number = [[3,9], [2,8], [0,6]]; 

//When

int[] expectedResult = nextedArray.sumOfNestedArray(number);

int[] actualResult = [12,10,6];

//Check

assertArrayEquals(expectedResult,actualResult);  
}
}


