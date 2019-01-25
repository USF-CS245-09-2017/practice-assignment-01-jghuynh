/**
 * Creating and finding fibonacci numbers
 * @author Justine Huynh
 * 01/25/2019
 */
public class Fibonacci {

    /**
     * Calculates the term at index = n in the Fibonacci Sequence and determining which method to use: iteration or recursion
     * @param n the index
     * @param type the type of method to use: iteration or recursion
     * @return the term at index = n
     */
    public int fibonacci (int n, String type)
    {
        /* type.toLowerCase.equals("iterative")
        type.toLowerCase.isEqualTo("recursive")
         */
        if (type.toLowerCase().equals("iterative"))
            return fibonacci_iterative(n);
        else if (type.toLowerCase().equals("recursive"))
        {
            return fibonacci_recursive(n);
        }
        // if type is not iterative or recursive
        return -1;
    }

    /**
     * Calculates the term in the Fibonacci Sequence at index = n using iteration
     * @param n the index
     * @return the term at index = n
     */
    public int fibonacci_iterative(int n)
    {
        if (n<0)
        {
            System.out.println("Sorry! Cannot find a negative index in Fibonacci sequence!");
            return -1;
        }
        // 0 and 1 are the first 2 terms on Fibonacci Sequence
        int num1; // num1 = 0, automatically
        int num2 = 1;
        int term = 1;

        // Base Case
        if (n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        for (int j = 2; j < n; j++)
        {
            num1 = num2;
            num2 = term;
            term = num1 + num2;

        }
        return term;
    }

    /**
     * Calculates the term in the Fibonacci sequence at index = n
     * @param n the index number
     * @return the term in the Fibonacci sequence at index = n
     */
    public int fibonacci_recursive(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        return fibonacci_recursive(n-1) + fibonacci_recursive(n - 2);
    }
}
