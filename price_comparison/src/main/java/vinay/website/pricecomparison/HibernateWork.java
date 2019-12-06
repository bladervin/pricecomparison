package vinay.website.pricecomparison;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateWork {
    //create new session to interact with the database
    private SessionFactory sessionFactory;
    
    //set up the session factory - call this method first
    public void init(){
        try {
            //Create a builder for the standard service registry
            StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();

            //Load configuration from hibernate configuration file.
            standardServiceRegistryBuilder.configure("hibernate-annotations.cfg.xml");  //using annotations

            //Create the registry that will be used to build the session factory
            StandardServiceRegistry registry = standardServiceRegistryBuilder.build();
            try {
                //Create the session factory - this is the goal of the init method.
                sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
            }
            catch (Exception e) {
                    /* The registry would be destroyed by the SessionFactory,
                        but we had trouble building the SessionFactory, so destroy it manually */
                System.err.println("Session Factory build failed.");
                e.printStackTrace();
                StandardServiceRegistryBuilder.destroy( registry );
            }

            //Ouput result
            System.out.println("Session factory built.");
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("SessionFactory creation failed." + ex);
        }
    }
    
    //adds a new game name to the database
    public void addgame(String name, int id){
        GameAnnotation game;
        //instance of a game class
        try(
            //get a new session instance    
            Session session = sessionFactory.getCurrentSession()) {
            //instance of a game class
            game = new GameAnnotation();
            //set values of game class I want to add
            game.setName(name);
            game.setUpdatePriceid(id);
            //start transaction
            session.beginTransaction();
            //add gamename to database
            session.save(game);
            //commit transaction to save it to database
            session.getTransaction().commit();
            
            //finally close the session and release db connection
        }
        System.out.println("Game data added to database with ID: " + game.getId());   
    }
    
    //add price from foreign key relationships
    public int Price(float price){
        Price pricefinal;
        try ( //Get a new Session instance from the session factory and start transaction
                Session session = sessionFactory.getCurrentSession()) {
            pricefinal = new Price();
            pricefinal.setPrice(price);
            //start transaction
            session.beginTransaction();
            //add gamename to database
            session.save(pricefinal);
            //commit transaction to save it to database
            session.getTransaction().commit();
            
            //finally close the session and release db connection
        }
        System.out.println("Game data added to database with ID: " + pricefinal.getId());   
         int id = pricefinal.getId();
        return id;
    }
    
    //add price with foreign key relationship with updated_price
    //public int addGames 
 
}