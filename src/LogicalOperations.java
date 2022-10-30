public class LogicalOperations {

    public void printFrom1to100(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void printFrom1tominus100(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void printOddNumbers(int number) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                ;
            }
        }
    }

    public void printEvenNumbers(int number) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    int sum = 0;
    public void printSum (int sum){
        for (int i =1; i<=100; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
    public float  printAverage () {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum / 100f;
    }
    String tipar = "*";

    public String printTipar (){
        for(int i=1;i<=7;i++){

            for (int j=1;j<i;j++){
            System.out.print(tipar);
        }
    } System.out.println();
        return (tipar);
}


}