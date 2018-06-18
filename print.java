//  Print nos. from 1 to 5
package recursion;

public class print {
    public static void main(String[] args) {
        print(5);
    }
    
    public static void print(int n)
    {
        if(n==0)
            return;
        else
        {
            System.out.println(n);
            print(n-1);
        }      
    }
}


