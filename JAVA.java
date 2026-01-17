import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void printJAVA(){
        System.out.println("Print JAVA");
    }
    
    public static void nameAge(String name, int age){
        System.out.println("Name :"+name+" Age :"+age);
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        
        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Hey " + x);
        sc.close();*/
        
        //Learning
        
        /*string
        String name = "Manish";
        System.out.println("Message "+name+" "+name.length());
        
        //substring
        String name = "Manish and Sumeet Biswas";
        System.out.println("Message "+name+" "+name.substring(18,24));
        
        
       // Arrays
       // int [] marks = new int [4];
        //marks[0] = 69;
        //marks[1] = 99;
        //marks[2] = 96;
        //marks[3] = 66;
        
        int[] marks = {69,99,96,66};
        int [][] final_marks = {{69,99,96,66},{6,1,9,0}};
        
        for (int i=0; i<4; i++){
            System.out.println("Marks "+marks[i]);
        } 
        System.out.println("Length "+marks.length);
        
        Arrays.sort(marks);
        System.out.println("Sorted "+marks[0]);
        
        for (int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println("Final Marks "+final_marks[i][j]);
            }
            System.out.println("\n");
        }
        
        
        // casting - to convert one type to other (implicit / Explicit) eg Glass to Bucket only (int to double)
        
        double price = 100.100;
        double finalPrice = price + 18;
        System.out.println(finalPrice);
        
        int p = 100;
        int fp = p + (int)18.99;
        System.out.println(fp);
        
        
        final float pi = 3.147f; // Define Constants
        
        //Operators
        int a= 10;
        int b= 3;
        int mod = a%b;
        System.out.println("Modulo "+mod); 
        
        int k =5;
        System.out.println("i++ " + k++); // Post-inc (k++). Use the current value of k. Then inc k
        System.out.println("Next Value "+k);
        System.out.println("i-- " + k--); // Post-dec (k--). Use the current value of k. Then dec k
        System.out.println("Next Value "+k);
        System.out.println("++i " + ++k); // Pre-inc (++k). Inc k first. Then use the new value
        System.out.println("Next Value "+k);
        System.out.println("--i " + --k); // Pre-dec (--k). Dec k first. Then use the new value
        System.out.println("Next Value "+k);
        
        // Math package
        System.out.println("MAX "+Math.max(6,9));
        System.out.println("Random "+(int)(Math.random()*100));
        
        //Taking Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Full Name & Age");
        String n = sc.nextLine();
        int a = sc.nextInt();
        System.out.println("Full Name: "+n+ "\nAge: "+a);
        
        // Comparison Operators
        // a == b 
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b 
        
        // Logical Operators
        // &&
        // ||
        // !
        
        //Conditinal Statements
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            default:
                System.out.println("Others");
                break;
        }

        //while
        int j =10;
        while(j >= 1){
            System.out.println("Message"+j);
            j = j-1;
        }
        
        // Do while
        int k = 10;
        do{
            System.out.println("Message"+k);
            k=k-1;
        }while(k >= 1);       
        
        // Break / continue
        
        int i = 0;
        while(true){
            if(i == 3){
                i= i+1;
                continue;
            }
            System.out.println(i);
            i = i +1;
            if(i > 5){
                break;
            }
        } 
        
        //Exception Handling
        
        int[] marks = {9,8,7};
        try{
            System.out.println(marks[4]);
        }catch(Exception exception){
            System.out.println("Error Exception");
        }
        System.out.println("MBiswas");*/
        
        //Methods
        
        printJAVA();
        nameAge("Sumeet",25);
        System.out.println("Sum: "+sum(10,12));
       
        
    }
}
