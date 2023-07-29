package week04Project;

public class week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. 
		System.out.println("Step 1:");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //instantiate array of integers 
		//a. 
		int difference = ages[ages.length - 1] - ages[0] ; //ages[ages.length - 1] gives the value of the last value of ages since arrays have an index starting at 0
		System.out.println(difference);
		//b. 
		int[] agesAndOne = {3, 9, 23, 64, 2, 8, 28, 93, 89}; 
		int differenceNew = agesAndOne[agesAndOne.length - 1] - agesAndOne[0] ; //subtracted indexed values 
		System.out.println(differenceNew);
		//c. 
		double sum = 0;		//double to ensure decimal place is given 
		for (int ageValue : ages) { //enhanced for loop to iterate through all elements of the array 
			sum += ageValue; //adds each age value in the array to the element averageAge
		}
		double averageAge = sum/ages.length; //divides the sum by the number of elements to get the averageAge 
		System.out.println(averageAge); 
//2. 
		System.out.println("Step 2:");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //instantiate names array of String type 
		//a. 
		double sumName = 0; //double to ensure decimal place is given 
		for (String name : names) {//enhanced for loop to iterate through all elements of the array 
			sumName += name.length(); //adds number of characters in each name 
		} 
		double averageNameLength = sumName/names.length; //divides sum of characters in all the names by the number of names 
		System.out.println(averageNameLength);
		//b. 
		StringBuilder namesTogether = new StringBuilder(); //String Builder is better to use than String as it does not save points in memory when concatenating like String does 
		for (String name : names) { //enhanced for loop to iterate through the elements in the array 
			namesTogether.append(name + " "); //.append concatenates strings in a String Builder 
		}
		System.out.println(namesTogether);
//3. 
		System.out.println("Step 3:"); 
		//to access the last element of an array, you take the array length and subtract 1 since arrays have a zero-based index 
		//for example: 
		System.out.println(names[names.length - 1]);
		
//4. 	
		System.out.println("Step 4:");
		//to access the first element of an array, you input 0 as the index value since arrays have a zero-based index
		//for example: 
		System.out.println(names[0]);
		
//5. 
		System.out.println("Step 5:");
		int[] nameLengths = new int[names.length]; //instantiate a new array of integers called nameLengths with the same number of elements as the names array 
		for (int i = 0; i < names.length; i++) { //use a common for loop to gain access to the indices of the names array 
			nameLengths[i] = names[i].length(); //added an integer equal to the length of the names at each index to the nameLengths array 
		}
		
//6. 
		System.out.println("Step 6:");
		int elementsSum = 0; //instantiate a variable to hold the sum of the elements
		for (int i : nameLengths) { //enhanced for loop to iterate through the nameLengths array 
			elementsSum += i; //for each integer in the name lengths array, the value of the integer is added to the elementsSum variable 
		}
		System.out.println(elementsSum);
		
//7. 
		System.out.println("Step 7:");
		System.out.println(stringTogetherNTimes("Hello", 3));
		System.out.println(stringTogetherNTimes("Safari", 7));

//8. 
		System.out.println("Step 8:"); 
		String firstName = "Brianna"; 
		String lastName = "Boehm";
		System.out.println(firstPlusLast(firstName, lastName));
		
//9. 
		System.out.println("Step 9:");
		System.out.println(isSumOverHundred(ages));
		int[] randomInts = {1,2,3,4,5,50};
		System.out.println(isSumOverHundred(randomInts));
		
//10. 
		System.out.println("Step 10:");
		double[] newDoubleArray = {4.33, 5.12, 7.69, 9.15}; 
		System.out.println(returnAverage(newDoubleArray));
		
//11. 
		System.out.println("Step 11:");
		double[] otherDoubleArray = {3.33, 4.12, 6.69, 8.15};
		System.out.println(isAverageGreater(newDoubleArray, otherDoubleArray)); //testing, should return true 
		System.out.println(isAverageGreater(otherDoubleArray, newDoubleArray)); //testing, should return false 
		
//12. 
		System.out.println("Step 12:");
		boolean isHotOutside = true; 
		double moneyInPocket = 11.25; 
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket)); //test, should return true 
		
		boolean isHotOutside2 = false; 
		System.out.println(willBuyDrink(isHotOutside2, moneyInPocket)); //test, should return false 
		
//13. 
		System.out.println("Step 13:");
		//This method will determine if the DNA sequence you input has a starting codon of AUG.  
		String sequenceOne = "aagucaccauguugag";
		System.out.println(containsStartCodon(sequenceOne)); //test, should return true 
		String sequenceTwo = "AAAUCCGAugccguCCGA";
		System.out.println(containsStartCodon(sequenceTwo)); //test, should return true 
		String sequenceThree = "aaaucccagauaaGAG";
		System.out.println(containsStartCodon(sequenceThree)); //test, should return false 
		
	} //end of main method 
 
//method for 7. 
	public static String stringTogetherNTimes (String word, int n) { //establishes a method that will take in a String and integer and return a String 
		StringBuilder wordTogether = new StringBuilder(word); //used a StringBuilder since it does not save a space in memory like String does each time 
		for ( int i = 1; i < n; i++) { //started with i = 1 and only iterated the number less than n times since the StringBuilder already has the word in it once 
			wordTogether.append(word);
		} return wordTogether.toString(); //converts the StringBuilder to String in order to send back the defined variable type 
	}
	
//method for 8. 
	public static String firstPlusLast (String firstName, String lastName) { //establishes a method that will take in two Strings and return a String 
		StringBuilder fullName = new StringBuilder(); //uses a StringBuilder since it does not save a space in memory like String does each time 
		fullName.append(firstName + " " + lastName); //concatenates the firstName and lastName Strings with a space between 
		return fullName.toString(); //converts the StringBuilder to String in order to send back the defined variable type
	}
	
//method for 9 
	public static boolean isSumOverHundred (int[] integers) { //establishes a method that will return a boolean value of true or false and take an integer array 
		int sum = 0; 
		for(int i : integers) { //enhanced for loop to add the value of each integer in the integers array to the sum 
			sum += i;
		} 
		boolean greaterThanHundred = false;
		if (sum > 100) { //tests if sum is greater than 100 
			greaterThanHundred = true; //only changes the boolean greaterThanHundred from false to true if the sum is greater than 100 
		} return greaterThanHundred; 
	}
	
//method for 10 
	public static double returnAverage (double[] doubleArray) { //establishes a method that will return a double after taking in an array of doubles 
		double sum = 0;
		for (double value : doubleArray ) {//uses an enhanced for loop to add the values of the doubles in the double array to the sum 
			sum += value; 
		}
		double average = sum/doubleArray.length; //divides the sum by the number of elements in the array 
		return average; //returns the double average 
	}
	
//method for 11 
	public static boolean isAverageGreater (double[] array1, double[] array2) { //establishes a method that will return a boolean value of true or false after taking in two double arrays 
		double sum1 = 0; 
		for (double value : array1 ) {//uses an enhanced for loop to add the values of the doubles in the double array to the sum 
			sum1 += value; 
		}
		double average1 = sum1/array1.length; //calculates the average of the values of the first double array 
		double sum2 = 0; 
		for (double value : array2 ) {//uses an enhanced for loop to add the values of the doubles in the double array to the sum 
			sum2 += value; 
		}
		double average2 = sum2/array2.length; //calculates the average of the values of the second double array 
		boolean isFirstAverageGreater = false;
		if (average1 > average2) { //changes the value of boolean isFirstAverageGreater to true if the average of the elements of the first double array is greater than the average of the values of the second double array 
			isFirstAverageGreater = true;
		}
		return isFirstAverageGreater; //returns boolean value of isFirstAverageGreater 
	}
	
//method for 12 
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) { //establishes a method that will return boolean value of true or false after taking in a boolean and a double 
		boolean buyDrink = false; //initializes a boolean 
		if (isHotOutside && moneyInPocket > 10.50) { //if both isHotOutside is true and the moneyInPocket is greater than 10.50, the boolean buyDrink will become true 
			buyDrink = true;
		} 
		return buyDrink; //returns value of boolean buyDrink 
	}
	
//method for 13 
	public static boolean containsStartCodon (String sequence) { //establishes a method that will return boolean value of true or false after taking in a String 
		boolean containsAUG = false; //initializes a boolean 
		String upperCaseSequence = sequence.toUpperCase(); //converts the sequence to all upper case letters and saves this in a new String (This step is important because sequences come in all lowercase, all uppercase, or a mixture.) 
		if (upperCaseSequence.contains("AUG")) { //uses an if statement to turn the containsAUG boolean value to true if the sequence contains AUG 
			containsAUG = true;
		}
		return containsAUG; //returns the value of the boolean containsAUG 
	}
		
} // end of Class 
