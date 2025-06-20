Exercise 7: Financial Forecasting

Understanding Recursive Algorithms

    Recursion is a method where a function calls itself to solve smaller instances of the same problem. 
    It is especially useful for problems that can be divided into similar subproblems, like factorials, Fibonacci sequences, 
    and financial growth prediction.

Analysis of Recursive Forecasting

    Time Complexity: O(n), where n is the number of years, because each call processes one year.

Optimization: This algorithm can be optimized using memoization to store and reuse previously computed results. 
However, since each year's value depends only on the previous year, iteration could be a more memory-efficient approach for large inputs.
