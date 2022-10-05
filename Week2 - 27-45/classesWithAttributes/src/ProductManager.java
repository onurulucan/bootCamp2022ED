public class ProductManager {
    public void Add(Product product) {
        //JDBS
        System.out.println("Ürün Eklendi " + product.get_name());
        System.out.println(product.get_name().substring(0,1)+ product.get_id());
    }

    public void Add2(int id, String name, String descrption, int stockAmount, double price) {

    }
}
