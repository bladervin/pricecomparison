package vinay.website.pricecomparison;

public class WebScraper2 extends Thread {
    //interval between http request to the server in seconds
    private int crawlDelay = 2;
    private boolean runThread = false;    
    GameScraper3 game3 = new GameScraper3();
    
    @Override
    public void run(){
      runThread = true;
        
        //while loop runs until runthread is false
        //while(runThread){
            System.out.println("WebScraper2 thread is scraping data.");
            
            //Web scraping code     
            //call the method 
            try {
                game3.scrapeGame();
                game3.scrapeGame2();
                game3.scrapeGame3();
                game3.scrapeGame4();
                game3.scrapeGame5();
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
