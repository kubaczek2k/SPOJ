import java.util.Scanner;

public class BasicProblems {

    public static void main(String[] arg){
        BasicProblems basic = new BasicProblems();
        basic.lifeMeaning();
        basic.adding();
    }

    private void lifeMeaning(){
        // Link to this problem:
        // https://www.spoj.com/problems/EXPECT/

        Scanner in = new Scanner(System.in);
        int number;

        while(true){
            number = Integer.parseInt(in.nextLine());
            System.out.println(number);
            if(number==42){
                break;
            }
        }

        in.close();
    }

    private void adding(){
        // Problem link:
        // https://www.spoj.com/problems/TESTINT/
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

        string.close();
    }

    private void halfOfHalf(){
        // Problem link:
        // https://www.spoj.com/problems/STRHH/

        int testCases = 0;
        int maxCasesNumber = 100;

        Scanner string = new Scanner(System.in);

        testCases = Integer.parseInt(string.nextLine());

        if(testCases <= maxCasesNumber){
            for(int i=0; i < testCases; i++){

            }
        }

        string.close();
    }
}
