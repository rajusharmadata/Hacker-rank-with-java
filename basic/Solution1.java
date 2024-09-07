/*Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer
 will be in the inclusive range from 0 to 99.

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input
java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
*/
import java.util.Scanner;

public class Solution1{

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
    for(int i=1; i<=3; i++) {
        String str = sc.next();
        int n = sc.nextInt();
        System.out.print(str);
        for( int j=str.length(); j<15; j++) {
            System.out.print(" ");
        } if(n>=10 && n<100) {
            System.out.println("0" + n);
        } else if(n<10) {
            System.out.println("00" + n);
        } else if(n==0){
            System.out.println("000");
        }
        else {
             System.out.println(n);
        }
    }
    

 System.out.println("================================");
    }
}



