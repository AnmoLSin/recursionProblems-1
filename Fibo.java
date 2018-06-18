/*
Fibonacci Series
 */
package recursion;

public class Fibo {
    public static void main(String[] args) {
        for(int i=0;i<6;i++)
            System.out.println("Fibonacci series : "+fab(i));
    }
    public static int fab(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
                return 1;
        else
            return (fab(n-1)+fab(n-2));   
        }
    }

