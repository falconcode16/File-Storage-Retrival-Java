package OOPS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File; 
import java.util.Scanner;





public class StoreAObject {

    public static void main(String[] args) {
   
     try {
   
      
   
      FileOutputStream fos = new FileOutputStream("r.txt");
   
      
      ObjectOutputStream oos = new ObjectOutputStream(fos);
   
      boxes box1 = new boxes(22,544, "supplied");
      boxes box2 = new boxes(223,446, "supplid");
      boxes box3 = new boxes(224,448, "suplied");
       
    
      oos.writeObject(box1);
   
   
      oos.flush();
      oos.close();
   
      
      box1 = null;
   
    
   
      FileInputStream fis = new FileInputStream("r.txt");
   
   
      ObjectInputStream ois = new ObjectInputStream(fis);
   
      
     box1 = (boxes) ois.readObject();
   
     
      System.out.println("length : " + box1.getLength());
      System.out.println("breadth : " + box1.getBreadth());
      System.out.println("supply : " + box1.getSupply());
      System.out.println("length : " + box2.getLength());
      System.out.println("breadth : " + box2.getBreadth());
      System.out.println("supply : " + box2.getSupply());
    
      System.out.println("length : " + box3.getLength());
      System.out.println("breadth : " + box3.getBreadth());
      System.out.println("supply : " + box3.getSupply());
    
    
   
      // closing the critical resources
      ois.close();
     
        File myObj = new File("r.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
      }
     catch (IOException e) {
      e.printStackTrace();
     } catch (ClassNotFoundException e) {
      e.printStackTrace();
     }
    }
   
   }