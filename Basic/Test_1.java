import java.util.Scanner;

public class Test_1 {

    // Problem link:
    // https://www.spoj.com/problems/TESTINT/
    public static void main(String[] args){
        Test_1 test = new Test_1();
        test.adding();
    }

    private void adding(){
        Scanner string = new Scanner(System.in);
        
        int numbersCount = 2;
        int maximumNumber = 200;
        int sum = 0;

        for(int i=0; i < numbersCount; i++){
            int number = Integer.parseInt(string.nextLine());

            if (number < maximumNumber){
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
