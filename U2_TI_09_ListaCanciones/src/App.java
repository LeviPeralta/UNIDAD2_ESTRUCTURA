public class App {
    public static void main(String[] args) throws Exception {
        Playlist myPlaylist = new Playlist();

        myPlaylist.addSong("Yesterday", 150);
        myPlaylist.addSong("Imagine", 180);
        myPlaylist.printPlaylist();
    }
}
