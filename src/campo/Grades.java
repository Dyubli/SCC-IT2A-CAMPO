package campo;

import java.util.Scanner;

public class Grades {
    
    public void getGrade(){
        Scanner input = new Scanner(System.in);
                
        String name;
        int Math,Science,English,Computer;
        int TotalMarks;
        float Average;
        
        System.out.print("Enter Your Full Name: ");
            name = input.nextLine();
        System.out.println("\nEnter Marks In");
        System.out.print("Math: ");
            Math = input.nextInt();
        System.out.print("Science: ");
            Science = input.nextInt();
        System.out.print("English: ");
            English = input.nextInt();
        System.out.print("Computer: ");
            Computer = input.nextInt();
            
        System.out.println("---------------------");
        System.out.println("GRADE DETAIL");
        System.out.println("---------------------");
        
        System.out.println("Name: "+name);
        
        TotalMarks = Math+Science+English+Computer;
        
        System.out.print("Total Marks: "+TotalMarks);
        
        float Ave = TotalMarks/4;
        
        System.out.println(String.format("\nAverage: %.2f", Ave));
    }
    
}
