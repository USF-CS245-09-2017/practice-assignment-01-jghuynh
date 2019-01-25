/**
 * Calculates the factorial of a number n with 2 different methods: iteration and recursion
 */
public class Factorial {

    /**
     * Calculates the factorial of a number n and determining which method to use: iteration or recursion
     * @param n the number to factorialize
     * @param type the type method to calculate n factorial: iteration or recursion
     * @return the answer of n factorial
     */
    public int factorial(int n, String type)
    {
        /* type.toLowerCase.equals("iterative")
        type.toLowerCase.isEqualTo("recursive")
         */
        if (type.toLowerCase().equals("iterative"))
            return factorial_iterative(n);
        else if (type.toLowerCase().equals("recursive"))
        {
            return factorial_recursive(n);
        }
        // if type is not iterative or recursive
        return -1;
    }

    /**
     * Calculates the factorial of the number n using iteration
     * @param n the number to factorialize
     * @return the answer
     */

    public int factorial_iterative(int n)
    {
        // check for errors/illegal parameters
        if (n < 0)
        {
            System.out.println("Sorry! No negative numbers to factorialize!");
            return -1;
        }
        int answer = 1;
        for (int j = n; j > 0; j--)
        {
            answer = j*answer;
        }
        return answer;
    }

    /**
     * Calculates the factorial of the number n using recursion
     * @param n the number to factorialize
     * @return the answer
     */
    public int factorial_recursive(int n)
    {
        // Check for illegal errors/illegal parameters
        if (n < 0)
        {
            System.out.println("Sorry! No negative numbers to factorialize!");
            return -1;
        }
        // Base Case
        else if (n == 0 || n == 1)
        {
            return 1;
        }

        return n*factorial_recursive(n - 1);

    }
}
