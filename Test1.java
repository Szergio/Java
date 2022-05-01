package start;

import java.util.Scanner;

public class Test1 {
    
    static int output(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert number:");
        int numb = reader.nextInt();
        return numb;
    }
    
    static int soma(int a,int b){
        return a+b;
    }
    
    static void show(int c){
        System.out.printf("Sum = %d",c);
    }
    
    static void jump(){
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int x = output();
        int y = output();
        System.out.printf("Your numb are %d and %d.",x,y);
        jump();
        show(soma(x,y));          
    }
}
