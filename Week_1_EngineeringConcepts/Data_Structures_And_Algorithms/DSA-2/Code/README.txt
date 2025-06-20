Exercise 2: E-commerce Platform Search Function

Understand Asymptotic Notation

- Big O Notation:
  Big O notation describes the upper bound of an algorithm’s time complexity as the input size grows. 
  It helps evaluate and compare the efficiency of algorithms regardless of hardware or implementation.

- Best, Average, and Worst-Case Scenarios:
  • Linear Search:
    - Best Case: O(1) – Target is the first element.
    - Average Case: O(n/2) ≈ O(n) – Target is in the middle.
    - Worst Case: O(n) – Target is the last or not present.
  
  • Binary Search:
    - Best Case: O(1) – Target is the middle element.
    - Average/Worst Case: O(log n) – Repeatedly halves the array.

Analysis

- Time Complexity:
  • Linear Search: O(n)
  • Binary Search: O(log n) – Only valid for sorted arrays

- Suitability:
  Binary search is faster and more scalable for large, sorted product datasets. 
  However, linear search is simpler and suitable when the data isn’t sorted or the dataset is small.

Choosing binary search enhances performance in an e-commerce platform where quick results are crucial for user satisfaction.
