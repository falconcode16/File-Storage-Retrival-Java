package OOPS;
import java.util.Scanner;
import java.io.Serializable;

public class boxes implements Serializable  {
    
    int length;
    int breadth;
    String supply;
    

    static void area(){
       System.out.println("Enter the length and bredth");
       Scanner in = new Scanner(System.in);
       int length= in.nextInt();
       int breadth= in.nextInt();
       float area = length*breadth;
       System.out.println("The area of the box is:"+area );

    }

    static void parimeter(){

        System.out.println("Enter the length and bredth");
        Scanner in = new Scanner(System.in);
        int length= in.nextInt();
        int breadth= in.nextInt();
        float parimeter = 2*(length+breadth);
        System.out.println("The parimeter of the box is:"+parimeter );


    }

    static String supply(){

        String res = "boxes were supplied";
        System.out.println(res);
        return res;
    }

    public boxes(int length, int breadth, String supply)
    {
        this.length = length;
        this.breadth = breadth;
        this.supply = supply;
        
    }
    public int getLength() {
        return length;
       }
    public void setLength(int length) {
        this.length = length;
       }

       public int getBreadth() {
        return breadth;
       }

       public void setbreadth(int breadth) {
        this.breadth = breadth;
       }
       public String getSupply() {
        return supply;
       }
       
       public void setSupply(String supply) {
        this.supply = supply;
       }

       
       
    @Override
	public String toString() {
		return "Name:" + length + "\nAge: " + breadth + "\nGender: " + supply;
	}

    public static void main(String[] args){

        boxes box1 = new boxes(22,44, "supplied");
        boxes box2 = new boxes(22,44, "supplied");
        System.out.println(box1.supply);
        System.out.println(box1.length);
        System.out.println(box1.breadth);


        parimeter();
        area();
        supply();
        
    }



    }
