public class App {
    public static void main(String[] args) throws Exception {
        int sumSquares = 0;
        for (int i = 0; i <= 11; i++) {
            sumSquares = sumSquares + i*i;

            System.out.println("Iteration: " + sumSquares);
        }
        System.out.println("Sum of squares: " + sumSquares);
    }
}
