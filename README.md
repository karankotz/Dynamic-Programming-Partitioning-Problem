• Given a number n, find the number of di↵erent ways to write n as
a sum of 1, 3 and 4. You only have to output the number of di↵erent
partitions - not the actual partitions itself. Run your program
on 5 integer inputs of sizes
105. Provide the inputs on which
you ran the program and the corresponding number of partitions for
each input. Be careful with the initial conditions. Following is a toy
example.
Input: 5
Output: 6 partitions
1. 1 + 1 + 1 + 1 + 1
2. 1 + 1 + 3
3. 1 + 3 + 1
4. 3 + 1 + 1
5. 4 + 1
6. 1 + 4


Solution: The problem is solved on the basis of the below points :---

1)This is solved using the bottom up approach.
     
2)At the first the table is built with the intially by assigning all the element to the zero.

3)At next the base case has been initailized, i,e.. for the table T[0] = 1 is taken as the base case.
     
4) After the initalization of the base the DP table is built, this is explained in the report.
