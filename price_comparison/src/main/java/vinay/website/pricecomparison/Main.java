package vinay.website.pricecomparison;

public class Main{
    public static void main(String[] args) {
          MultiThreadedWebScraping();
          
    }
    
     public static void MultiThreadedWebScraping(){
         //creating threads for each scraper
        WebScraper scraper1 = new WebScraper();
        WebScraper2 scraper3 = new WebScraper2();
        
        scraper1.start(); //first thread starts
        
        try{
            System.out.println("WebScraped Games: " + Thread.currentThread().getName());
            scraper1.join(3000);
        }catch(Exception ex){
            System.out.println("Exception has been caught");
        }
                
        scraper3.start();  //second thread starts
        
        try{
            System.out.println("\nWebScraped Games: " + Thread.currentThread().getName());
            scraper3.start();
        }catch(Exception ex){
            System.out.println("Exception has been caught");
        }
    }  
     }