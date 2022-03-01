package OOPS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File; 
import java.util.Scanner;
import java.io.FileNotFoundException;





public class Retrivefromobject {

   
   
        public static void main(String[] args) {
            try {
              File myObj = new File("r.txt");
              Scanner myReader = new Scanner(myObj);
              while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
              }
              myReader.close();
            } catch (FileNotFoundException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }
          }
   
   }