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

## TDD
This project adopted TDD partway through, where unit tests were written before classes were implemented. Following Red-Green-Refactor, tests were written and failed before any 
code was written, and only the bare minimum amount of code was written to pass the tests.

Tests were written for the sorting algorithms and binary tree class. Some basic performance testing was done additionally.

The testing was used in conjunction with the SortFactory, which allowed the test cases to be reused for each sort algorithm implementation.

## Binary Tree
The binary tree sort uses a binary tree structure that was implemented following a given interface contract. A separate Node class was implemented for use within the binary tree class, to adhere to SOLID principles.

## Maven
The project was converted to Maven from a standard Java project part-way through, with dependencies for JUnit 5 and log4j added for testing and logging.

