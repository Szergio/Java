package start;
import java.util.Scanner;
public class Calculator {
    static int choose(){ 
        Scanner choose = new Scanner(System.in);
        while(true){
            int opt = choose.nextInt();
            switch (opt){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                System.out.println("Try again...");            
            }
        }  
    }                

    static void showStart(){
        System.out.println("0 - Start");
        System.out.println("1 - Quit");
    } 
    static void showStart(int x){
        if(x==0){
          showMath();  
        }
        else if(x==1){
            System.out.println("Bye!");
            System.exit(0);
        }
        else{
            System.out.println("Error 101.");}
    }
    
    static double numb(){
        Scanner numb = new Scanner(System.in);
        double number = numb.nextDouble();
        return number;
    }
    
    static void showMath(){
        System.out.println("Choose your number:");
    }
    static void showMath1(){
        System.out.println("0 - addition");
        System.out.println("1 - subtraction");
        System.out.println("2 - multiplication");
        System.out.println("3 - division");
    }
    static double operation(double a,double b){  
        Scanner choose = new Scanner(System.in);
        while(true){
            int opt = choose.nextInt(); 
            switch (opt){
            case 0:
                return a+b;
            case 1:
                return a-b;
            case 2:
                return a*b;
            case 3:
                return a/b;
            default:
                System.out.println("Try again...");
            } 
        }                
    }
    static void result(double c){
        System.out.printf("result = %f",c);

    }
    static void numb(double x){
        System.out.println("-> "+x);
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator 1.0");
        showStart();
        showStart(choose());
        double a,b,c=0;
        a = numb();
        showMath();
        b = numb();
        showMath1();
        c = operation(a,b);
        numb(a);
        numb(b);
        result(c);
    }   
}
