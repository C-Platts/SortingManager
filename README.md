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
This project adopted TDD part way through, where unit tests were written before classes were implemented. Following Red-Green-Refactor, tests were written and failed before any 
code was written; and only the bare minimum amount of code was written to pass the tests.

Thes testing was used in conjunction with the SortFactory, which allowed the test cases to be reused fro each sort algorithm implementation.

## Binary Tree
The brinary tree sort uses a binary tree structure which was inplemented in accordance with a given interface contract. A seperate Node class was inplemented, 
to adhere to SOLID principles.

## Maven
The project was converted to Maven part-way through, with dependencies for JUnit 5 and lgo4j added.

