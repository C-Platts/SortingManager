# SortingManager
A program that allows the user to generate an array and choose a sorting algorithm to sort this array. The time taken to complete the sort is provided in milliseconds.

## Sorting Algorithms
The program features six sorting algorithms:
 - Merge sort
 - Bubble sort
 - Selection sort
 - Quick Sort
 - Binary Tree sort
 - Insertion sort
 
 Each sort has been added to a SortFactory, following the Factory pattern. 

## How to use
To use the program, clone it into a maven project.

When run, enter 1-6 to select a sorting algorithm at the first prompt. At the second prompt enter a non-zero, positive integer value to select the size of the array to be generated.

The program will generate an array of the specified length and populate it with random integers between 1 and the length of the array. 

The program will then return the generated array, the sorted array and the time in milliseconds it took for the sorting algorithm to sort the array. The program will then terminate and will need to be run again to try a different algorithm.

## Maven
The project was converted to Maven from a standard Java project part-way through, with dependencies for JUnit 5 and log4j added for testing and logging.
