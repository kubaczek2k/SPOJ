import java.util.Scanner;

public class Life {
    
    // Link to this problem:
    // https://www.spoj.com/problems/EXPECT/

    public static void main(String[] arg){
        Life meaning = new Life();
        meaning.lifeMeaning();
    }
    
    public void lifeMeaning(){
        Scanner in = new Scanner(System.in);
        int number;

        while(true){
            number = Integer.parseInt(in.nextLine());
            System.out.println(number);
            if(number==42){
                break;
            }
        }
    }

}
