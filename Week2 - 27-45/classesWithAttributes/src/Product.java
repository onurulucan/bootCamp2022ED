public class Product {
    public Product(int _id, String _name, String _description, double _price, int _stockAmount) {
        System.out.println("Yapıcı blok çalıştı.");
        this._name = _name;
        this._id = _id;
        this._price = _price;
        this._description = _description;
        this._stockAmount = _stockAmount;
    }

    // attribute | field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;

    // getter
    public int get_id() {
        return _id;
    }

    //setter
    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }
}