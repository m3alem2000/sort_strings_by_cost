import java.util.Arrays;
public class StringSorting {
	static final int asciiOffset = 96;
	
	public String[] sortStringsByCost(String[] strArray){
		Integer[] intOutput = new Integer[strArray.length];
		String[] strOutput = new String[strArray.length];
		int charNumericalValue = 0;
		for(int i = 0 ; i < strArray.length ; i++){
			charNumericalValue = numericalValue(strArray[i]);
			intOutput[i] = charNumericalValue;
		}
		strOutput = arraySort(intOutput, strArray);
		return strOutput;
	}

	public int numericalValue(String str){
		int value = 0;
		for (int i = 0; i < str.length(); i++){
			value = value + ((int)(str.charAt(i)) - asciiOffset);
		}
		return value;
	}

	public String[] arraySort(Integer intArray[], String strArray[]){
		Integer[] sortedIntArray = Arrays.copyOf(intArray, intArray.length);
		String[] sortedStrArray = new String[intArray.length];
		int position = 0 ;
		Arrays.sort(sortedIntArray);
		for(int i = 0 ; i < intArray.length ;  i++){
			position = Arrays.asList(intArray).indexOf(sortedIntArray[i]);
			sortedStrArray[i] = strArray[position];
		}

		return sortedStrArray;
	}
}

//Write a method sort_strings_by_cost
//Parameters: array
//An array of strings (lower-case alpha characters only)
//Returns: array
//The input array with strings sorted according to each string's "cost" in ascending order
//A string's "cost" is the sum of the cost of each letter.
//The cost of each letter is its place in the alphabet (e.g. a = 1, z = 26) 
//Example:
//sort_strings_by_cost([tem, cab, exz]) returns [cab, tem, exz]