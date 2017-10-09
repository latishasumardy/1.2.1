
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    // instance variables - replace the example below with your own
        // instance variables - replace the example below with your own
        private static double totalCost;
        private static int numSongs;
        private static double averageCost;
        private static int totalRatings;
        private static double aveRating;
        public static void main(){
            totalCost = 0.0;
            numSongs = 0;
            averageCost = 0.0;
            totalRatings = 0;
            aveRating = 0.0;
            System.out.println("Welcome to your Media Library");
            Song song1 = new Song("City of Stars", 1.29, 9);
            numSongs = numSongs + 1;
            totalCost = totalCost + song1.getPrice();
            totalRatings = totalRatings + song1.getRating();
            Song song2 = new Song("Legend", .99, 5);
            numSongs = numSongs + 1;
            totalCost = totalCost + song2.getPrice();
            totalRatings = totalRatings + song2.getRating();
            Song song3 = new Song("Jackie", 1.29, 8);
            numSongs = numSongs + 1;
            totalCost = totalCost + song3.getPrice();
            totalRatings = totalRatings + song2.getRating();
            Song song4 = new Song("Cola", .99, 9);
            numSongs = numSongs + 1;
            totalCost = totalCost + song4.getPrice();
            totalRatings = totalRatings + song4.getRating();
            Song song5 = new Song("Audition Song", 1.29, 10);
            numSongs = numSongs + 1;
            totalCost = totalCost + song5.getPrice();
            totalCost = totalCost;
            totalRatings = totalRatings + song5.getRating();
            System.out.println("number of songs:" + numSongs);
            System.out.println("total cost= " + totalCost);
            averageCost = (double)totalCost / numSongs;
            System.out.println("average cost = " + "$" + ((int)(averageCost*100)/100.0));
            System.out.println("total ratings = " + ((int)(totalRatings*100)/100.0));
            aveRating = (double)(totalRatings)/numSongs;
            System.out.println("average ratings = " + aveRating);
            String a = song1.getTitle();
            String r = Integer.toString(song1.getRating());
            MediaFile.writeString(a + "|" + r);
            String b = song2.getTitle();
            String s = Integer.toString(song2.getRating());
            MediaFile.writeString(b + "|" + s);
            String c = song3.getTitle();
            String t = Integer.toString(song3.getRating());
            MediaFile.writeString(c + "|" + t);
            String d = song4.getTitle();
            String u = Integer.toString(song4.getRating());
            MediaFile.writeString(d + "|" + u);
            String e = song5.getTitle();
            String v = Integer.toString(song5.getRating());
            MediaFile.writeString(e + "|" + v);
            MediaFile.saveAndClose();
    
    }
}
