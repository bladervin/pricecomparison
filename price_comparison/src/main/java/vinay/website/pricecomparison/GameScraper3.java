package vinay.website.pricecomparison;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GameScraper3 {

    public GameScraper3() {
        try{
            //scrapeGame(); 
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    void scrapeGame() throws Exception{
        
        String itemName = "fifa";
        
        //download html document from the website
        Document doc = Jsoup.connect("https://www.instant-gaming.com/en/search/?q=" + itemName).get();
        Elements products = doc.select(".item");
        System.out.println("------- GameScraper3 for Fifa -------");

        //work through the products
        for(int i = 0; i<products.size(); ++i){
            
            Elements name = products.get(i).select(".name");
            
            //get products name
            for(Element elem: name){
                System.out.println("Name: " + elem.text());               
            }
            
            //get price
            Elements priceElements = products.get(i).select(".price");
            for(Element priceElement: priceElements){
                System.out.println("Price: " + priceElement.text());
                 System.out.println();
            }   
        }   
    }
    
    void scrapeGame2() throws Exception{
        
        String itemName = "far+cry";
        
        //download html document from the website
        Document doc = Jsoup.connect("https://www.instant-gaming.com/en/search/?q=" + itemName).get();
        Elements products = doc.select(".item");
        System.out.println("------- GameScraper3 for Far cry -------");

        //work through the products
        for(int i = 0; i<products.size(); ++i){
            
            Elements name = products.get(i).select(".name");
            
            //get products name
            for(Element elem: name){
                System.out.println("Name: " + elem.text());               
            }
            
            //get price
            Elements priceElements = products.get(i).select(".price");
            for(Element priceElement: priceElements){
                System.out.println("Price: " + priceElement.text());
                 System.out.println();
            }   
        }   
    }   
    
    void scrapeGame3() throws Exception{
        
        String itemName = "dragon";
        
        //download html document from the website
        Document doc = Jsoup.connect("https://www.instant-gaming.com/en/search/?q=" + itemName).get();
        Elements products = doc.select(".item");
        System.out.println("------- GameScraper3 for Dragon -------");

        //work through the products
        for(int i = 0; i<products.size(); ++i){
            
            Elements name = products.get(i).select(".name");
            
            //get products name
            for(Element elem: name){
                System.out.println("Name: " + elem.text());               
            }
            
            //get price
            Elements priceElements = products.get(i).select(".price");
            for(Element priceElement: priceElements){
                System.out.println("Price: " + priceElement.text());
                 System.out.println();
            }   
        }   
    }   
    
    void scrapeGame4() throws Exception{
        
        String itemName = "star+wars";
        
        //download html document from the website
        Document doc = Jsoup.connect("https://www.instant-gaming.com/en/search/?q=" + itemName).get();
        Elements products = doc.select(".item");
        System.out.println("------- GameScraper3 for Star wars games -------");

        //work through the products
        for(int i = 0; i<products.size(); ++i){
            
            Elements name = products.get(i).select(".name");
            
            //get products name
            for(Element elem: name){
                System.out.println("Name: " + elem.text());               
            }
            
            //get price
            Elements priceElements = products.get(i).select(".price");
            for(Element priceElement: priceElements){
                System.out.println("Price: " + priceElement.text());
                 System.out.println();
            }   
        }   
    }   
    
    void scrapeGame5() throws Exception{
        
        String itemName = "mortal";
        
        //download html document from the website
        Document doc = Jsoup.connect("https://www.instant-gaming.com/en/search/?q=" + itemName).get();
        Elements products = doc.select(".item");
        System.out.println("------- GameScraper3 for Mortal games -------");

        //work through the products
        for(int i = 0; i<products.size(); ++i){
            
            Elements name = products.get(i).select(".name");
            
            //get products name
            for(Element elem: name){
                System.out.println("Name: " + elem.text());               
            }
            
            //get price
            Elements priceElements = products.get(i).select(".price");
            for(Element priceElement: priceElements){
                System.out.println("Price: " + priceElement.text());
                 System.out.println();
            }   
        }   
    } 
}