public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LogicalOperations operations = new LogicalOperations();
        System.out.println("Exercitii Laborator 12");
        operations.printFrom1to100(1);
        operations.printFrom1tominus100(-1);
        operations.printOddNumbers(100);
        operations.printEvenNumbers(100);
        operations.printSum(100);
        System.out.println(operations.printAverage());
        System.out.println(operations.printTipar());

    }
}