import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args)
	{
		int n = 4;
		String names[]= { "Rahul", "Ajay", "Gourav", "Riya" };
		Arrays.sort(names);

		System.out.println("The names in alphabetical order are: ");
		for (int i = 0; i < n; i++) 
 {
			System.out.println(names[i]);
		}
	}
}
