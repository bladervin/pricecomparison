package vinay.website.pricecomparison;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GameScraper{
        
    //constructor
    GameScraper(){
        try{
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    void scrapeGame() throws Exception{    
    //scrape data from the simplygames website     
    String itemName = "fifa";
           
    //download html document from the website
    Document doc = Jsoup.connect("https://www.simplygames.com/search?keywords=" + itemName).get();

    //Get all products on the page
    Elements products = doc.select(".list_item");
    System.out.println("------- GameScraper for Fifa -------");
    
    //call hibernate method
    HibernateWork runhibernate = new HibernateWork();
    runhibernate.init();
   
   //WORK THROUGH PRODUCTS
    for(int i = 0; i<products.size(); ++i){
                
        //get the product description
        Elements description = products.get(i).select(".product_name");
            
        System.out.println("DESCRIPTION " + description.text());
                        
        //Get price
        Elements priceElements = products.get(i).select("span");
        for(Element price: priceElements){
            System.out.println("PRICE: " + price.text());
            
            //use float to replace £ in db with just number value
            float value = Float.parseFloat(price.text().replaceAll("£", ""));
            
            //create id variable and run hibernate method with Price
            int id = runhibernate.Price(value);
            runhibernate.addgame(description.text(), id);
        }        
    }
}
    
     void scrapeGame2() throws Exception{    
    //scrape data from the simplygames website     
    String itemName = "far+cry";
           
    //download html document from the website
    Document doc = Jsoup.connect("https://www.simplygames.com/search?keywords=" + itemName).get();
   // System.out.println(doc.html());

    //Get all products on the page
    Elements products = doc.select(".list_item");
    System.out.println("------- GameScraper for Far cry-------");
    HibernateWork runhibernate = new HibernateWork();
    runhibernate.init();
    
   //WORK THROUGH PRODUCTS
    for(int i = 0; i<products.size(); ++i){
                
        //get the product description
        Elements description = products.get(i).select(".product_name");
            
        System.out.println("DESCRIPTION " + description.text());
                        
        //Get price
        Elements priceElements = products.get(i).select("span");
        for(Element price: priceElements){
            System.out.println("PRICE: " + price.text());
            
            //use float to replace £ in db with just number value
            float value = Float.parseFloat(price.text().replaceAll("£", ""));
            int id = runhibernate.Price(value);
            runhibernate.addgame(description.text(), id);
        }        
    }
}
     
     void scrapeGame3() throws Exception{    
    //scrape data from the simplygames website     
    String itemName = "dragon";
           
    //download html document from the website
    Document doc = Jsoup.connect("https://www.simplygames.com/search?keywords=" + itemName).get();

    //Get all products on the page
    Elements products = doc.select(".list_item");
    System.out.println("------- GameScraper for Dragon-------");
    
   //WORK THROUGH PRODUCTS
    for(int i = 0; i<products.size(); ++i){
                
        //get the product description
        Elements description = products.get(i).select(".product_name");
    
        //get the products name
        for(Element desc: description){                         
            //Ouput web scraped data
            System.out.println("DESCRIPTION: " + desc.text());
        }
                        
        //Get price
        Elements priceElements = products.get(i).select("span");
        for(Element price: priceElements){
            System.out.println("PRICE: " + price.text());
        }
    }
}
     
     void scrapeGame4() throws Exception{    
    //scrape data from the simplygames website     
    String itemName = "star+wars";
           
    //download html document from the website
    Document doc = Jsoup.connect("https://www.simplygames.com/search?keywords=" + itemName).get();

    //Get all products on the page
    Elements products = doc.select(".list_item");
    System.out.println("-------GameScraper for Star wars-------");
    
   //WORK THROUGH PRODUCTS
    for(int i = 0; i<products.size(); ++i){
                
        //get the product description
        Elements description = products.get(i).select(".product_name");
    
        //get the products name
        for(Element desc: description){                         
            //Ouput web scraped data
            System.out.println("DESCRIPTION: " + desc.text());
        }
                        
        //Get price
        Elements priceElements = products.get(i).select("span");
        for(Element price: priceElements){
            System.out.println("PRICE: " + price.text());
        }
    }
}
    
      void scrapeGame5() throws Exception{    
    //scrape data from the simplygames website     
    String itemName = "mortal";
           
    //download html document from the website
    Document doc = Jsoup.connect("https://www.simplygames.com/search?keywords=" + itemName).get();

    //Get all products on the page
    Elements products = doc.select(".list_item");
    System.out.println("-------GameScraper for Mortal-------");
    
   //WORK THROUGH PRODUCTS
    for(int i = 0; i<products.size(); ++i){
                
        //get the product description
        Elements description = products.get(i).select(".product_name");
    
        //get the products name
        for(Element desc: description){                         
            //Ouput web scraped data
            System.out.println("DESCRIPTION: " + desc.text());
        }
                        
        //Get price
        Elements priceElements = products.get(i).select("span");
        for(Element price: priceElements){
            System.out.println("PRICE: " + price.text());
        }
    }
}  
}