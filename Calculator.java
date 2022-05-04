package start;
import java.util.Scanner;
public class Calculator {
    
    static void showStart(){
        System.out.println("0 - Start");
        System.out.println("1 - Quit");
        showStart(choose());
    } 
    static void showStart(int x){
        if(x==0 && x!=1){
            System.out.println("Starting the program ...");
            System.out.println("");
            loop();  
        }
        else if(x==1){
            System.out.println("Closing the program ...");
            System.exit(0);
        }
        else{
            System.out.println("Error showStart(x).");
        }
    }
    static int choose(){ 
        Scanner choose = new Scanner(System.in);
        while(true){
            int opt = choose.nextInt();
            int[] opts = {0,1};
            for(int i=0; i < opts.length; i++){     
                if(opt<opts.length){
                    switch (opt){
                        case 0 -> {
                            System.out.println("You choose the option 0");
                            return 0;
                        }
                        case 1 -> {
                            System.out.println("You choose the option 1");
                            return 1;
                        }
                        default -> System.out.println("Try again ...");
                    }
                }
                else if(opts[i]!=opt && opts[i] <= opts.length){
                    System.out.println("Try again ...");
                    break;
                }
            }
        }  
    }      
    static double numbDoubleScanner(){
        Scanner numb = new Scanner(System.in);
        double number = numb.nextDouble();
        return number;
    }
    static int numbIntScanner(){
        Scanner numb = new Scanner(System.in);
        int number = numb.nextInt();
        return number;
    }
    static void showMath(){
        System.out.println("How many numbers you want for later (+),(-),(*) or (/):");
    }
    static double[] listNumber(int amoutsNumb){
        double[] listNumber = new double[amoutsNumb];
        System.out.println(amoutsNumb);
        for(int i=0;i<amoutsNumb;i++){
            System.out.printf("Insert the %d number:",i+1);
            System.out.println("");
            listNumber[i] = numbDoubleScanner();    
            System.out.println(listNumber);
        }
        System.out.println(listNumber);
        return listNumber;        
    }
    static void showMathOperation(){
        System.out.println("0 - addition");
        System.out.println("1 - subtraction");
        System.out.println("2 - multiplication");
        System.out.println("3 - division");
    }
    static double operation(double[][] list){  
        Scanner choose = new Scanner(System.in);
        double result = 0;
        while(true){
            int opt = choose.nextInt(); 
            switch (opt){
            case 0 -> {
                for(int i=0;i<list[0].length;i++){
                    result += list[0][i]; 
                }
                return result;
            }
            case 1 -> {
                for(int i=0;i<list[0].length;i++){
                    result -= list[0][i]; 
                }
                return result;
            }
            case 2 -> {
                result = 1;
                for(int i=0;i<list[0].length;i++){
                    result *= list[0][i]; 
                }
                return result;
            }
            case 3 -> {
                result = list[0][0];
                for(int i=1;i<list[0].length;i++){
                    result /= list[0][i]; 
                }
                return result;
            }
            default -> System.out.println("Try again...");
            } 
        }                
    }
    
   
    
    static void loop(){
        double result = 0;
        double[][] list = new double[100][0];
        showMath();
        list[0]=listNumber(numbIntScanner());
        showMathOperation();
        result = operation(list);
  
        System.out.printf("Result = %.2f",result);
        System.out.println("");
        System.out.println("Finished!");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator 1.2");
        showStart();

    }
}
