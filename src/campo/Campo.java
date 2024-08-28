package campo;

import java.util.Scanner;

public class Campo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Product[] pr = new Product [100];
        
        int nump, i;
        
        System.out.print("Enter no. of products: ");
        nump = sc.nextInt();
        double ttp = 0;
       
            
            for ( i = 0; i < nump; i++){
                System.out.println("Enter details of Product"+ (i+1)+":");
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double pri = sc.nextDouble();
                System.out.print("Stock: ");
                int st = sc.nextInt();
                System.out.println("");
                
                
            }
    }
        
  
}
