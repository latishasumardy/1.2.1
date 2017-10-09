
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main() {
        String songInfo = MediaFile.readString();
        String[] songs = songInfo.split("\\|");
        int t = 0;
        /*while (songs.length > t) {
            System.out.println(songs[t]);
            t += 1;
        }
        for (int i = 0; i<=100; i++) {
            if (i < songs.length) {
                System.out.println(songs[i]);
            }
            else {
                break;
            }
        }*/
        System.out.println("My Favourite Songs");
        System.out.println("------------------");
        while (songs.length > t) {
            if (songs[t].toString().length() <= 2) {
                if (Integer.parseInt(songs[t]) >= 8) {
                    System.out.print(songs[t-1]);
                    System.out.print("("+songs[t]+") \n");
                }
            }
            t+=1;
        }
        
    }
}
