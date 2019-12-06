package vinay.website.pricecomparison;

public class WebScraper extends Thread{
    //interval between http request to the server in seconds
    private int crawlDelay = 2;
    private boolean runThread = false;    
    GameScraper game1 = new GameScraper();
     
    @Override
    public void run(){
        runThread = true;
        
        //while loop runs until runthread is false
        //while(runThread){
            System.out.println("WebScraper1 thread is scraping data.");
            
            //Web scraping code     
            //call the method 
            try {
                game1.scrapeGame();
                game1.scrapeGame2();
                game1.scrapeGame3();
                game1.scrapeGame4();
                game1.scrapeGame5();
                }
                catch (Exception exp){
                    exp.printStackTrace();
                    }
            
            try{
                sleep(1000 * crawlDelay);
            }catch(InterruptedException ex){
                System.err.println(ex.getMessage());
            }
        }
    
    public void stopThread(){
        runThread = false;
    }
    
    }
