import java.io.*;
import java.util.Scanner;

public class Instances_Ex1_IO {

    public static void main(String[] args)throws IOException
    {

        String fileName = "Input.txt";
        String line = "";
        Scanner scanner = new Scanner(new FileReader(fileName));
        try {

          while (scanner.hasNextLine()){
            line = scanner.nextLine();
            int counter = 0;

            for( int i=0; i<line.length(); i++ ) {
                if(line.charAt(i)=='a') {
                    counter++; 

                } 


            }

             System.out.println(counter);   
          }
        }
        finally {

          scanner.close();


    }}}