import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Jennifer Kaliszewski
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();

    // Create an array
    int[] array = {5, 9, 3, 12, 7, 3, 11, 5};

    // Output array in order using a while loop
    System.out.print("Array in order: ");
    int index = 0;
    while (index < array.length) {
      System.out.print(array[index] + " ");
      index++;
    }

    System.out.println();

    // Output the first and last values of the array
    System.out.println("First value: " + array[0]);
    System.out.println("Last value: " + array[array.length - 1]);

    // Call all methods
    System.out.println("Max of 5 and 9: " + lab.max(5, 9));
    System.out.println("Min of 5 and 9: " + lab.min(5, 9));
    System.out.println("Sum of array: " + lab.sum(array));
    System.out.println("Average of array: " + lab.average(array));
    System.out.println("Max value in array: " + lab.max(array));
    System.out.println("Min value in array: " + lab.min(array)); 
  }
}

// Define the Lab1 class and add all the methods here
class Lab1 {

  // Increment method
  public int increment(int num) {
    return ++num;
  }

  // Method to find the maximum of two integers
  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  // Method to find the minimum of two integers
  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  // Method to find the sum of all values in the array
  public int sum(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return total;
  }

  // Method to find the average of values in the array
  public double average(int[] nums) {
    int total = sum(nums); // Use the sum method
    return (double) total / nums.length;
  }

  // Method to find the maximum value in an array
  public int max(int[] nums) {
    int maxValue = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maxValue) {
        maxValue = nums[i];
      }
    }
    return maxValue;
  }

  // Method to find the minimum value in an array
  public int min(int[] nums) {
    int minValue = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < minValue) {
        minValue = nums[i];
      }
    }
    return minValue;
  }
}