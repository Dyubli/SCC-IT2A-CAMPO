package campo;

public class Product {
    
    String pname;
    int stocks, id, sold;
    double price;
    
      public void addProduct(int id, String pname, int stocks, double price,int psold ){
          
           this.pname = pname;
           this.price = price;
           this.stocks = stocks;
           this.id = id;
           this.sold = psold;
    }
      
      public void viewProduct() {
          double profit = this.price * this.sold;
          double tep = this.stocks * this.price;
          String status = ( this.stocks > 0) ? "Avilable" : "Out-of-stock";
                 
                System.out.printf ("%-10d %-10s %-10.2f %-10d %-10d %10.2f %10.2f %-10s\n",
                        this.id, this.pname, this.price, this.stocks, this.sold, profit , tep, status);
      }
}
