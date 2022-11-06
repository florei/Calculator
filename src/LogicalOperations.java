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

// Tema 12.2 - bucle While//


    public void from1to100 (int i){
        do{
            System.out.println(i);
            i++;
        } while (i<=100);
    }
    public void from1Tominus100 (int i){
        do{
            System.out.println(i);
            i--;
        } while (i>=-100);
    }

    //exercitiul 3 si 4 nu am reusit sa i dau de capat.. mai jos este incercarea

    /* int [] numbers = {0,6,8,10,20};
    int y = 0;
    public void fromXtoY (int numbers, int y){

        do{
            System.out.println(numbers[y]);
            y++;
        } while (y< numbers);
    }*/

   /* public void fromXtoY (int x, int y){
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int i = min;
        do{
            System.out.println(i);
            y++;
        } while (i = min; i < max; i++);*/


    public void oddNumber (int i){
        do{
            System.out.println(i);
            i=i+2;
        } while (i<=100);
    }


    public void evenNumber (int i){
        i= 2;
        do{
            System.out.println(i);
           i= i+2;
        } while (i<=100);
    }

    public void fibonacci1to20 (int i) {
        int count = 20;
        int num1 = 1;
        int num2 = 0;
        i = 1;
        do {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
            System.out.println(num1 + " ");
        } while (i <= count);
    }

    //Exercitiul 10 imi da eroare... nu stiu unde gresesc..
public void CozaLozaWoza (int i) {

        int minNumber = 1;
    int maxNumber = 110;
    do {
        if (i % 3 == 0 ) {
            System.out.print("Coza");
        }
        if (i % 5 == 0) {
            System.out.print("Loza");
        }
        if (i % 7 == 0) {
            System.out.print("Woza");
        }
        if (i % 3==0 && i % 5==0) {
            System.out.print("CozaLoza");
        }
        if (i % 3==0 && i % 7==0) {
            System.out.print("CozaWoza");
        }
        if (i % 5==0 && i % 7==0) {
            System.out.print("WozaLoza");
        }
        if (i % 3==0 && i % 5==0 && i % 7==0) {
            System.out.println("CozaLozaWoza");
        }


        if (i % 11==0) {
            System.out.println();
        }
        i++;
    } while (i <= maxNumber);
    while (i==minNumber);
}
   

}