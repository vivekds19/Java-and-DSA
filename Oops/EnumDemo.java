
enum Laptops {
    Dell(2000), HP, Apple(3000), Asus(2500), Acer(1800);

    private int price;

    private Laptops() {
        this.price = 500;
    }

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumDemo {

    public static void main(String[] args) {

        for (Laptops l : Laptops.values()) {
            System.out.println(l + " : " + l.getPrice());
        }
    }
}
