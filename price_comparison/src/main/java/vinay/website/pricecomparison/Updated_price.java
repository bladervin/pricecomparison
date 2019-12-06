package vinay.website.pricecomparison;

import javax.persistence.*;

@Entity
@Table(name="updated_price")
public class Updated_price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name="price_id", nullable=false)
    Price price_id;
    
    @Override
    public String toString(){
        String tmpStr = " Updated price: " + id + "; price_id: " + price_id;
        tmpStr += price_id.toString();
        return tmpStr;
    }
    
}
