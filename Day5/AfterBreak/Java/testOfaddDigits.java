
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testaddDigits{
  
@Test
public void testThatWhenIInputedEachDigitAreAdded(){

//Given
int firstNumber = 38; 

//When
int expectedSum = addDigits.sumOfDigits(number);
int actualSum = 11;

//Check
assertEquals(expectedSum,actualSum);  
}
}


