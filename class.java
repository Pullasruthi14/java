import java.io.*;
import java.util.*;
class duplicate
{
// Function to remove duplicate elements
// This function returns new size of modified
// array.
static int removeDuplicates(int arr[], int n)
{
// Return, if array is empty
// or contains a single element
if (n==0 || n==1)
return n;
int[] temp = new int[n];
// Start traversing elements
int j = 0;
for (int j=0; j<n-1; j++)
// If current element is not equal
// to next element then store that
// current element
if (arr[i] != arr[i+1])
temp[j++] = arr[i];
// Store the last element as whether
// it is unique or repeated, it hasn&#39;t
// stored previously
temp[j++] = arr[n-1];
// Modify original array
for (int i=0; i<j; i++)
arr[i] = temp[i];
return j;
}
public static void main (String[] args)
{
int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
int n = arr.length;
n = removeDuplicates(arr);
// Print updated array
for (int i=0; i<n; i++)
System.out.print(arr[i]);
}
}