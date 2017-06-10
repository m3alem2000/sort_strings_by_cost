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
	public void numericalValueTest(){
		int x = stringSorting.numericalValue("a");
		int y = stringSorting.numericalValue("z");
		Assert.assertEquals(x, 1);
		Assert.assertEquals(y, 26);
	}
	@Test
	public void arraySortTest1(){
	    Integer x[] = {38,6,55};
	    String y[] = {"tem","cab","exz"};
	    String expected[] = {"cab","tem","exz"};
		Assert.assertArrayEquals(expected, stringSorting.arraySort(x, y));
	}
	@Test
	public void arraySortTest2(){
	    Integer x[] = {26,25,24};
	    String y[] = {"z","y","x"};
	    String expected[] = {"x","y","z"};
		Assert.assertArrayEquals(expected, stringSorting.arraySort(x, y));

	}
}