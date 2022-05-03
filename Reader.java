package start.TesteReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner; // Imports
public class Reader {
    static void loop(){
        Scanner opts = new Scanner(System.in);
        while(true){
            show();
            int option = opts.nextInt();
            choose(option); 
        }
    } // loop
    static void show(){
        System.out.println("0-create");
        System.out.println("1-write");
        System.out.println("2-read");
        System.out.println("3-delete");
        System.out.println("4-exit");
    } // table
    static void choose(int x){
        switch(x){
            case 0:
                create(outputName());
            case 1:
                write(exists(outputName()),outputText());
            case 2:    
                read(exists(outputName()));
            case 3:  
                delete(exists(outputName()));
            case 4:
                System.out.println("Bye!");
                System.exit(0);
            default:
                System.out.println("Try again");
        }     
    } // choose opt
    static String outputText(){
        System.out.println("Insert text from file:");
        Scanner varText = new Scanner(System.in);
        String Text = varText.nextLine();
        return Text;
    } // Text from file
    static String outputName(){
        System.out.println("Enter the file name:");
        Scanner nameText = new Scanner(System.in);
        String name = nameText.nextLine();
        String a = path(name);
        return a;
    } // File naming 
    static String path(String x){
        String path = ("D:\\Program Files\\NetBeans-12.5\\projects\\project1\\src\\main\\java\\start\\TesteReader\\"+x+".txt");
        return path;
    } // Path for file
    static String exists(String x){
        File existText = new File(x);
        if(existText.exists()){
            return x;
        }
        else{
            System.out.println("exizxts The file doesn't exists!");
            loop();
            return "The file doesn't exists!";   
        }
    } // File already exist?
    static void create(String x){
        File text = new File(x);
        try{
            if(text.createNewFile()){
                System.out.println("Successfully created the file!");
                loop();
            }
            else{
                System.out.println("The file already exists!");
                loop();
            }
        }
        catch(IOException e){
            System.out.println("Error exception!");
            e.printStackTrace(); 
         }
    } // File creation  
    static void write(String x,String y){
        try{
            FileWriter fileWriter = new FileWriter(x);
            fileWriter.write(y);
            fileWriter.close();
            System.out.println("Successfully wrote to the file!");
            loop();
        }
        catch (IOException e){
            System.out.println("Error exception!");
            e.printStackTrace();   
        }    
    } // Wtite file
    static String read(String x){
        String content="";
        try{
            FileReader readFile = new FileReader(x);
            BufferedReader readText = new BufferedReader(readFile);
            String line = "";
            try{
                line = readText.readLine();
                while(line!=null){
                    content += line;
                    line = readText.readLine();
                }
                readFile.close();
                System.out.println(content);
            }
            catch(IOException e){
                content = "Error don't read";
            }   
        }
        catch(FileNotFoundException ex){
            content = "The fileread doesn't exists!";
        }
        loop();
        return content;  
    } // Reader file 
    static void delete(String x){
        File deleteText = new File(x);
        deleteText.delete();
        System.out.println("File deleted successufully!");
        loop();
    } // Delete file
    public static void main(String[] args) {
        loop();
    } // Main
}
