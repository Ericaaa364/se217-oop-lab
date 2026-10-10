package week02;


    
public class WhileLoopSum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}

