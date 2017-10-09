
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class LoopingMediaLib
     */
    public static void main() {
        String songInfo = MediaFile.readString();
        while(songInfo != null){
            int parse = songInfo.indexOf("|");
            System.out.println("Title: " + songInfo.substring(0,parse));
            System.out.println("Rating: " + songInfo.substring(parse + 1));
            songInfo = MediaFile.readString();
        }
    }
}
