import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int score;
        
        System.out.println("Enter test score (0 - 100) : ");
        score = sc.nextInt();
        if(score >= 0 && score <= 100){
             if (score >= 90 && score <= 100){
                 System.out.println("Score A, EXCLLENT!");
             } else if (score >= 80 && score <= 89){
                System.out.println("Score B, keep your achievements!");
             } else if (score >= 60 && score <= 79){
                 System.out.println("Score C, keep your achievements!");
             } else if (score >= 50 && score <= 59){
                 System.out.println("Score D, keep your achievements!");
             } else {
                 System.out.println("Score E, do not pass!");
             }
        } else {
            if(score <0 && score> 100){
                System.out.println("The value you entered less than 0");
            }else{
                System.out.println("The value you entered more than 100");
            }
        }
    }
}