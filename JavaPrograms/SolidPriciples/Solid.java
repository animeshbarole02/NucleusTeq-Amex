


class  Marker {
    String name;
    String color ;
    int year;
    int price ;

    public  Marker(String name , String color ,int year ,int price) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public  Marker(){

    }
}

class  Invoice {
    private  Marker marker ;
    private  int quantity ;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public  Invoice() {

    }

    public  int calculateTotal() {
        int price = ((marker.price)*this.quantity);
        return  price;
    }
//    If these two Methods are present than there should have one more reason to change
//     Because we need to implement those logic and have to change class

    // 1 . Single Responsibility
//     public  void printInvoice() {
//
//    }
//
//
//    public  void saveToDB(){
//
//    }
//
//
//
//    Solution Create Separate Classes for both the Methods
}


//  We Created Two Different Classes so that class Should have Single Responsibility

class  InvoicePrinter {
    private  Invoice invoice;

    public  InvoicePrinter(Invoice invoice){
        this.invoice =invoice;
    }

    public  void print() {
        //Print Invoice
    }
}


//Overriding this method
//class  InvoiceDao {
//
//    // 2. Open for Extension closed for Modification
//    // Let Say this Method is Live and taking traffic
//    //I want to saveToFile method also in this
//
//    Invoice invoice;
//    public  InvoiceDao(Invoice invoice) {
//        this.invoice =invoice;
//    }
//    public  void saveToDB() {
//        //Save to DB
//    }
//
//    //   We are Modifying it not Following Second Principle
////    public  void saveToFile(String filename) {
////        //Save to file
////    }
//
//
//}



//Instead of it we need to create Interface and extends methods
//So we follow Second Principle
interface  InvoiceDao{
    public  void save(Invoice invoice);
}



class DatabaseInvoiceDao implements  InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        //Save to DB
    }

}

class FileInvoiceDao implements  InvoiceDao {
    @Override
    public void save(Invoice invoice)
    {
        //save file
    }
}




public class Solid {

    public static void main(String[] args) {


        Invoice invoice =  new Invoice();
        Marker marker = new Marker();

    }

}