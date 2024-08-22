package campo;

public class Campo {
    
    public static void main(String[] args) {
        
        Product pr = new Product ();
        pr.addProduct(1011, "Milk", 10, 100);
        pr.viewProduct ();
        
        Product pr1 = new Product ();
        pr1.addProduct (1012, "Soap", 10, 20);
        pr1.viewProduct();
    }
}
