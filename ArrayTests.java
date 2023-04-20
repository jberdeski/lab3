import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input2 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5,4,3,2,1}, input2);
  }

  @Test
  public void testReversed2(){
    int[] input2 = {43, 91, 0};
    ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{0, 91, 43}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {4.0, 3.0, 5.0, 6.0, 3.0, 20.0};
    assertEquals(7.6, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
}
