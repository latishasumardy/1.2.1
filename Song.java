
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
        // instance variables 
    private int rating;
    private String title;
    /*step 3*/
    private double price;
    /*step 6*/
    private boolean favorite;
    
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
    }
    /*step 8-9*/
    public Song(String title, double price){
        this.title = title;
        this.price = price;
    }
    public Song(String title){
        this.title = title;
    }
    /*step 10*/
    public Song(String title, double price, int rating){
        this.title = title;
        this.price = price;
        this.rating = rating;
       
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
    /*steps 3-4*/
    public double getPrice() {
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
    /*step 7*/
    public void addToFavorites() {
    favorite = true;
    }

}
