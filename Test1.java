package start;
import java.util.Scanner;

public class Test1 {
    static void menu(double v){
        System.out.println("-> Welcome to test1!");
        System.out.printf("-> Version - %.1f",v);
        System.out.println("");
    } //View menu
    
    static double output(){
        Scanner reader = new Scanner(System.in);
        System.out.println("-> Insert number:");
        double numb = reader.nextInt();
        return numb;
    } // Output numb
    
    static double sum(double a,double b){
        return a+b;
    } //Sum
    
    static void show(double c){
        System.out.printf("-> Sum = %.1f",c);
        System.out.println("");
    } //Result
    
    static void jump(){
        System.out.println("");
    } //Next line
    
    public static void main(String[] args) {
        double versionTest = 1.1;
        menu(versionTest);
        double x = output();
        System.out.printf("-> %.1f + ",x);
        double y = output();
        System.out.printf("-> Your numb are %.1f and %.1f",x,y);
        jump();
        show(sum(x,y));       
        System.out.println("-> Thanks for testing!");
    }
}
