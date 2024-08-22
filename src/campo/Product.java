package campo;

public class Product {
    
    String pname;
    int stocks, id;
    double price;
    
      public void addProduct(int id, String pname, int stocks, double price){
          
           this.pname = pname;
           this.price = price;
           this.stocks = stocks;
           this.id = id;
    }
      
      public void viewProduct() {
          
          double tep = this.price * this.stocks;
          String status = ( this.stocks > 0) ? "Avilable" : "Out-of-stock";
                 
                System.out.printf ("%-10d %-10s %-10d %-10.2f %-10.2f %-10s\n",
                        this.id, this.pname, this.stocks, this.price, tep, status);
    }
}
