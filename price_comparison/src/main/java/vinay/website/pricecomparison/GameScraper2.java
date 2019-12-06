package vinay.website.pricecomparison;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GameScraper2 {
    //constructor
    GameScraper2(){
        try{
            scrapeGame2();            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    void scrapeGame2() throws Exception{    
    //scrape data from the simplygames website     
    String itemName = "far%20cry";
           
    //download html document from the website
    Document doc = Jsoup.connect("https://www.shopto.net/en/search/?input_search=" + itemName).get();
   //System.out.println(doc.html());

    //Get all products on the page
    Elements products = doc.select(".itemlist2");
        
   //WORK THROUGH PRODUCTS
    for(int i = 0; i<products.size(); ++i){   
                
        //get the product description
        Elements description = products.get(i).select(".itemlist__description");
        
        System.out.println("DESCRIPTION: \n" + description.text()); 

        //Elements finalPrice = elementprice.select(".base_price");
          
        Elements priceElem = products.get(i).select(".itemlist__prices");
                
        Element imageElement = priceElem.select("img").first();
        String realhref = imageElement.attr("src");
            
        //Ouput web scraped data
        System.out.println("PRICE : " + realhref);
        }
    }
}


