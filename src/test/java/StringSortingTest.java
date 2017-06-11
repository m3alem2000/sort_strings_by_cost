import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringSortingTest {
	StringSorting stringSorting;
	
	@Before
	public void setup(){
		stringSorting = new StringSorting();
	}
	@Test
	public void test_sortStringsByCost_sortStringArrayBasedOnEachStringNumericalValueInAscendingOrder(){
	    String strArray[] = {"tem","cab","exz"};
	    String expected[] = {"cab","tem","exz"};
		Assert.assertArrayEquals(expected, stringSorting.sortStringsByCost(strArray));
	}
	
	@Test
	public void test_sortStringsByCost_sortStringArrayForDifferentStringLength(){
	    String strArray[] = {"t","cab","xz"};
	    String expected[] = {"cab","t","xz"};
	    String actual[] = stringSorting.sortStringsByCost(strArray);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test_numericalValue_getNumericalValueOfCharacterBasedOnItsPosition(){
		int valA= stringSorting.numericalValue("a");
		int valB = stringSorting.numericalValue("b");
		int valZ = stringSorting.numericalValue("z");
		Assert.assertEquals(valA, 1);
		Assert.assertEquals(valB, 2);
		Assert.assertEquals(valZ, 26);
	}
	
	@Test
	public void test_arraySort_sortsStringArrayToMatchInegerArrayForOneCharacter(){
	    Integer x[] = {26,25,24};
	    String y[] = {"z","y","x"};
	    String expected[] = {"x","y","z"};
		Assert.assertArrayEquals(expected, stringSorting.arraySort(x, y));

	}
	
	@Test
	public void test_arraySort_sortsStringArrayToMatchIntegerArrayForMoreThanOneCharacter(){
	    Integer valueArray[] = {38,6,55};
	    String strArray[] = {"tem","cab","exz"};
	    String expected[] = {"cab","tem","exz"};
		Assert.assertArrayEquals(expected, stringSorting.arraySort(valueArray, strArray));
	}
	
}