package recursion.leetcode;

public class NumberOfSteps {
    public static void main(String[] args) {
        int num = 14;
        int steps = numberOfSteps(num);
        System.out.println(steps);
    }
    public static int numberOfStepsRecursion(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int steps) {
        if(num == 0) return steps;

        if(num % 2 == 0)
            num = num/2;
        else
            num -= 1;

        steps += 1;

        return helper(num, steps);
    }

    static int numberOfSteps(int num) {

        int steps = 0;

        while( num != 0) {

            if(num % 2 == 0)
                num/=2;
            else
                num-=1;

            steps++;
        }
        return steps;
    }
}
