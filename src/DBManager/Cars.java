package DBManager;

public class Cars {
    public Cars(Long id, String name, int price, double voulume) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.voulume = voulume;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", voulume=" + voulume +
                '}';
    }

    private Long id;
    private String name;
    private int price;
    private double voulume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVoulume() {
        return voulume;
    }

    public void setVoulume(double voulume) {
        this.voulume = voulume;
    }
}
