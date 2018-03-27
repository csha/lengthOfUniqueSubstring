
import java.util.HashMap;
import java.util.List;

import java.util.Arrays;
import java.util.ArrayList;

public class main {
	/*
	 * 	Find longest substring in a string that contains no repeating characters.
	 * 
	 * 	Ex: abcc = abc 	Length = 3
	 * 		stop = stop Length = 4
	 * 		x = x		Length = 1
	 * 		XX = X		Length = 1
	 * 		null = null Length = 0
	 * 
	 * */
	
	public static void printSubstring2(String givenString)
	{
		
		char[] charArray = givenString.toCharArray();
		ArrayList<Character> dupeList = new ArrayList<>();
		int currentLength = 0;
		int maxLength = 0;
		int startPos = 0;
		int endPos = 0;
		
		
		for (int ptr1 = 0; ptr1 < charArray.length; ptr1++)
		{
			currentLength = 0;
			dupeList.clear();
			for(int ptr2 = ptr1; ptr2 < charArray.length; ptr2++)
			{
				if(dupeList.contains(charArray[ptr2]))
				{
					if(maxLength<currentLength)
					{
						maxLength = currentLength;
						startPos = ptr1;
						endPos = ptr2;
						break;
					}
				}
				else
				{
					currentLength++;
					dupeList.add(charArray[ptr2]);
				}
			}
			if(maxLength < currentLength)
			{maxLength = currentLength;
			startPos = ptr1;
			endPos = charArray.length-1;}
		}
		if(givenString.length() != 0)
		{
			ArrayList<Character> finalProduct = new ArrayList<>();
			for(int i = startPos; i <= endPos; i++) {finalProduct.add(charArray[i]);}
			System.out.println("string = "+ givenString);
			System.out.println("Max unique length = " + maxLength);
		}
		else {System.out.println("string = "+ givenString);
		System.out.println("Max unique length = " + 0);}
		
	}

	
	public static void printSubstring(String givenString) 
	{
		
		char[] charArray = givenString.toCharArray();
		ArrayList<Character> duplicateChars = new ArrayList<>();
		int maxLength = 0;
		int startPtr = 0;
		int endPtr = 0;
		int currentLength = 0;
		for(int ptr = 0; ptr < charArray.length; ptr++)
		{
			currentLength = 0;
			duplicateChars.clear();
			for(int ptr2 = ptr; ptr2 < charArray.length; ptr2++)
			{
				currentLength++;
				if(duplicateChars.contains(charArray[ptr2])) 
				{
					if(currentLength > maxLength)
					{
						startPtr = ptr;
						endPtr = ptr2;
						maxLength = currentLength;
					}
					break;
					
				}
				else
				{
					
					duplicateChars.add(charArray[ptr2]);
					if(ptr2 == charArray.length-1)
					{
						if(currentLength > maxLength)
						{
							startPtr = ptr;
							endPtr = ptr2;
							maxLength = currentLength;
						}
						break;
					}
				}
			}
		}
		
		if(givenString.length() != 0) 
		{
			System.out.println("String is = "+ givenString);
			System.out.println("Max unique length = " + maxLength);
		}
		else {System.out.println("String is = "+ givenString);
		System.out.println("Max unique length = " + 0);}
	}
	
	
	

	public static void main(String[] args) {
		/*
		 * 	Find longest substring in a string that contains no repeating characters.
		 * 
		 * 	Ex: abcc = abc 	Length = 3
		 * 		stop = stop Length = 4
		 * 		x = x		Length = 1
		 * 		XX = X		Length = 1
		 * 		null = null Length = 0
		 * 
		 * */

		
		printSubstring2("abc");
		printSubstring2("1231456789");
		printSubstring2("abcabcd");
		printSubstring2("xx");
		printSubstring2("");
		printSubstring2("33334333");
	}

}
