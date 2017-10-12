
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    // instance variables - replace the example below with your own
    public static void main(){
        String[] sharingFriends = {new String("July"),
                   new String("Lemuel"),
                   new String("Jessica"),
                   new String("Jack"),
                   new String("Carlton")};
                  
        Song[] topTenSongs = {new Song("The Twist"),
                   new Song("Smooth"),
                   new Song("Mack the Knife"),
                   new Song("How Do I Live") ,            
                   new Song("Party Rock Anthem"),
                   new Song("I Gotta a Feeling"),
                   new Song("Macarena"),
                   new Song("Physical"),
                   new Song("You Light Up My Life"),
                   new Song("Hey Jude")};
                    
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total=0;
        for (int i = 0; i < sharingFriends.length; i++)
        {
            System.out.println(sharingFriends[i]);
        }
        for (int val : daysBtwnPurchase)
        {
            total  = total + val;
        }
        System.out.println("average purchase time in days: " + total / daysBtwnPurchase.length);
        int i = 1;
        for (Song s: topTenSongs){
            if(i % 3 == 0) {
                s.setPrice(.99);
            }
            else {
                s.setPrice(1.29);
            }
            System.out.println(s.getTitle() + ": $" + s.getPrice());
            i++;
        }
        
        // change the array
        /*System.out.println("-BEFORE--");
        for (Song changeSong : topTenSongs) {
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
        // show the array
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        }*/
    }
 
}
