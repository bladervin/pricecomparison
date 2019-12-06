package vinay.website.pricecomparison;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="game")
public class GameAnnotation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //use primary key auto-increment columns 
    @Column(name="id")
    private int id;
  
    @Column(name="name")
    private String name;
    
    @Column(name="genre")
    private String genre;
    
    @Column(name="players")
    private int players;
    
    @Column(name="update_url_id")
    private int updateURLid;
    
    @Column(name="updated_price_id")
    private int updatePriceid;
    
    //constructor
    public GameAnnotation(){
        
    }
    public int getId(){    
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getUpdateURLid() {
        return updateURLid;
    }

    public void setUpdateURLid(int updateURLid) {
        this.updateURLid = updateURLid;
    }

    public int getUpdatePriceid() {
        return updatePriceid;
    }

    //getters and setters
    public void setUpdatePriceid(int updatePriceid) {   
        this.updatePriceid = updatePriceid;
    }

    //gets a string representation of the game
    @Override
    public String toString() {
        String display = "Game.id: " + id + " Game.name: " +   name +  " ; \ngenre: " + genre + "; " +
                "; \nPlayers: " + players + ";  \nupdateURL_id: " + updateURLid + "; \nupdatedpriceid: " + updatePriceid + " ";
        return display;
    }
    
}