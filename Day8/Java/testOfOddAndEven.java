



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class oddAndEven {
  
@Test

public void testThatWhenAnEvenNumberIsInputedItDoublesItAndWhenAnOddNumberISInputedItIncreasesBy1(){

//Given

int[] number = {12, 17, 39}; 

//When

int[] expectedResult = oddAndEven.oddAndEvenArray(number);

int[] actualResult = {24, 18, 40};

//Check

assertArrayEquals(expectedResult,actualResult);  
}
}


