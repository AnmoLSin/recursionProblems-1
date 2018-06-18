/*
Send an integer to a function and return the sum of all digits of that
digit.
 */
package recursion;

public class sum {
    public static void main(String[] args) {
        int s=sum(471998);
        System.out.println("Sum : "+s);
    }
    public static int sum(int n)
    {
        if(n==0)
            return 0;
        else
            return sum(n/10)+n%10;
    }
}
