import tr.com.workintech.model.productForSale.Bread;
import tr.com.workintech.model.productForSale.Chocolate;
import tr.com.workintech.model.productForSale.Coke;
import tr.com.workintech.model.productForSale.ProductForSale;

public class Store {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("bitter",5,"sağlıklı",30);
        Coke coke =new Coke("Şekersiz",35,"yeni lezzet",1);
        Bread bread=new Bread("Tam buğday",10,"afiyet olsun",250);

        ProductForSale[]prods = {chocolate,coke,bread};

        listProducts(prods);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product:products){
            product.showDetails();
        }

    }
}