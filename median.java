import java.io.*;
import java.util.*;
class Mean 
{
    public static void main(String[] args)
    {      
        int[] numbers = { 4, 5, 7, 7, 8, 8, 10, 10, 10 }:
        double mean = 0;
        for (int number : numbers)
        {
            mean += number;
        }
        mean /= numbers.length;
        System.out.println("Mean: " + mean);        
        Arrays.sort(numbers);
        int middle = numbers.length / 2;
        double median;
        if (numbers.length % 2 == 0)
        {
            median = (numbers[middle - 1] + numbers[middle]) / 2.0;
        } 
        else 
        {
            median = numbers[middle];
        }
        System.out.println("Median: " + median);        
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            int count = 0;
            for (int j = 0; j < numbers.length; j++)
            {
                if (numbers[j] == numbers[i]) 
                {
                    count++;
                }
            }
            if (count > maxCount) 
            {
                maxCount = count;
                mode = numbers[i];
            }
        }
        System.out.println("Mode: " + mode);
    }
}