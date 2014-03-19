About the program:
This program computes the Ackermann function that grows incredibly fast with large number of recursive calls.
This program uses dynamic programming approach to compute value of the function.
The values of smaller solutions are stored in a HashMap and are used to compute the solution of a bigger problem.
As Ackermann function has too many computations, to save memory the values that are used once(not needed anymore) are removed from the HashMap.
BigInteger data type is used to handle huge numbers. 
This program computes values of Ackermann function for any input value pairs as long as the solution can be contained within BigInteger data type.

Compiling:
The program is compiled and run in NetBeans