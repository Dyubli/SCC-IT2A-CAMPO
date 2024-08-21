package campo;

public class product {
    
    String pname;
    double price, stocks, id;

      public void addProduct(String pname, double price, double stocks, double id ) {
           this.pname = pname;
           this.price = price;
           this.stocks = stocks;
           this.id = id;
    }
      
      public void viewProduct() {
          double tep = this.price * this.stocks;
          String status = ( this.stocks <= 0) ? " Available" : " Out-of-stock";
                
      }
}
