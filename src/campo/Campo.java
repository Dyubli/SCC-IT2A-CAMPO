package campo;

import java.util.Scanner;

public class Campo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Product[] pr = new Product [100];
        
        int nump, i;
        
        System.out.print("Enter no. of products: ");
        nump = sc.nextInt();
        double ttp = 0, tep = 0;
       
            for ( i = 0; i < nump; i++){
                System.out.println("\nEnter details of Product "+ (i+1)+":");
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Stock: ");
                int st = sc.nextInt();
                System.out.print("Price: ");
                double pri = sc.nextDouble();
                System.out.print("Sold: ");
                int sd = sc.nextInt();
                pr[i] = new Product();
                pr[i].addProduct(id, name, st, pri, sd); 
            }
            
            for (i = 0; i <nump; i++){
                pr[i].viewProduct();
                ttp = ttp + (pr[i].price * pr[i].sold);
                tep = tep + (pr[i].price * pr[i].stocks);
            
            }
            
            System.out.println("\nTotal Profit : " +ttp);
            System.out.println("Total TEP: " +tep);
    }
}
 
