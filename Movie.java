
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;
    private String movieTime;
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
        movieTime = "";
    }
    public Movie(int d)
    {
        this.duration = d;
        System.out.print(Duration(duration));
    }
    public String Duration(int d) {
        int hours = 0;
        int minutes = 0;
        String movieTime = "";
        minutes = d % 60;
        hours = d/60;
        movieTime = hours + "h " + minutes + "min";
        return movieTime;
    }
    public void setDuration(int d) {
        duration = d;
    }
    public int getDuration() {
        return duration;
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

}
