package campo.it2a;

public class Product {
    
    int pid;
    String pname,category,status;
    int stock;
    double price;
    int i;
    int products;
    
    
    public void addProduct( int pid, String pname, String category, int stock, double price){
        
        this.pid = pid;
        this.pname = pname;
        this.category = category;
        this.stock = stock;
        this.price = price;
    
    }
    
    public void viewProduct(){
        String status = (this.stock)
        System.out.printf("\n%-10d, %-10s, %-10s, %-10d,%-10.2f,%-10s ", this.pid,this.pname,this.category,this.stock,this.price,this.status);
        

    }
}
