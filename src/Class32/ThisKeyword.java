package Class32;

public class ThisKeyword {
    public static void main(String[] args) {
MusicAlbum mc = new MusicAlbum("If you are reading this - it's too late", "Drake", 2014, false );
System.out.println(mc.isForKids);
System.out.println(mc.title);

MusicAlbum mc2 = new MusicAlbum("Graduation", "Kanye West", 2010, false);
System.out.println(mc2.artist);
    }
}
class MusicAlbum{
    public String title;
    public String artist;
    public int yearReleased;
    public boolean isForKids;

//    public MusicAlbum(String albumTitle, String albumArtist,
//                      int albumYearReleased, boolean albumIsForKids){
//        title = albumTitle;
//        artist = albumArtist;
//        yearReleased = albumYearReleased;
//        isForKids = albumIsForKids;
//
//    }
//   "this" keyword helps you access the instance variables of your current class
//    "This" keyword helps us differentiate between method or constructor params
//    and instance variables.
//    it helps us avoid redundancy in variable naming
    public MusicAlbum(String title, String artist, int yearReleased, boolean isForKids){
        this.title = title;
        this.artist = artist;
        this.yearReleased = yearReleased;
        this.isForKids = isForKids;

    }
}
