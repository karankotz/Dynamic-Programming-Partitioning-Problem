//Name :Karan Kotabagi
//University ID: 2000217137
//Question 1:
//Solution: The problem is solved on the basis of the below points :---
/*-> 1)This is solved using the bottom up approach.
     2)At the first the table is built with the intially by assigning all the element to the zero.
     3)At next the base case has been initailized, i,e.. for the table T[0] = 1 is taken as the base case.
     4) After the initalization of the base the DP table is built, this is explained in the report.
       
*/

package partition;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Partition {

    //Declare the array containing the integers 1, 3 and 4 these are the integers that the n should be partitioned with.
     public static int arr[] = {1,3,4};
     public static BigInteger no_of_partition(int N)
        {
            
            //initialize the arraysize to be eqaul to the total + 1
            //Sinc we need the very long integer in java I am using the Big integer.
            BigInteger part[] = new BigInteger[N+1];
            
            //initialize all the elements of the array to be 0 at the start
          
             Arrays.fill(part, BigInteger.ZERO);
            //Set the base case 
            part[0] = BigInteger.ONE;
            
            //Now run the outer for loop untill N 
            for(int k =1;k<=N;k++)
            {
              //run the inner loop untill the length of the arr with the z pointing to this array.
            for(int z=0;z<arr.length;z++)
            {
                //The array element at z is compared with the k value as we are evaluating the k as the sum and storing 
                // the no of ways in the table, the sum should be greater than the partition, if it is no then we break the 
                //inner loop.
                if(k >= arr[z])
                {
                    BigInteger bi = new BigInteger(""+part[k]+"");
                    BigInteger bi2 =  new BigInteger(""+part[k-arr[z]]+"");
                    //assign the sum value of the bi and bi2 with the values that are assigned above.
                    part[k] = bi.add(bi2);
                    
                }
                else
                {
                    //break the loop
                    break;
                }
                    
            } 
            }
            return part[N];
        }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number which has to be divided into the partitions using 1,3,and 4 ?");
        Scanner reader = new Scanner(System.in); 
        int n = reader.nextInt();
        BigInteger result = no_of_partition(n);
        //Declare the number to do the mod operation in case of the very large operations.
        BigInteger ji = new BigInteger("100000");
        //Number declared to check if the number length is more
        BigInteger ki = new BigInteger("100000000000");
        //if the number is greater than the 100000000000 then we will do the mod to print the last digits. 
        if(result.compareTo(ki)>0)
        {
        result = result.mod(ji);
        }
        System.out.println(result);
 
    }
    
}
