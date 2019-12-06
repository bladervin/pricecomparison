package vinay.website.pricecomparison;
import javax.persistence.*;

@Entity
@Table(name="price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "game_price")
    float price;
    
    @Override
    public String toString(){
        String tmpStr = " Price id: " + id + "; Game price: " + price;
        return tmpStr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}