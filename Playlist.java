import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();
        playlist.add("Test1");
        playlist.add("Test2");
        playlist.add("Test3");
        playlist.add("Test4");
        playlist.add("Test5");
        playlist.add("Test6");
        System.out.println(playlist);
        System.out.println(shufflePlaylist(playlist));
        System.out.println(playlist);
        // testing if original Playlist remained the same
        System.out.println(swapPlaylist(playlist));
    }

    public static ArrayList<String> shufflePlaylist (ArrayList<String> playlist) {
        ArrayList<String> shuffledPlaylist = new ArrayList<>();
        // creates the newly shuffled Playlist
        ArrayList<String> copiedPlaylist = new ArrayList<>(playlist);
        // creates new List with the Elements of submitted playlist
        while (!copiedPlaylist.isEmpty()){
            int a = (int)(Math.random() * copiedPlaylist.size());
            // should give random Number between 0 and max_Size of Songs in Playlist
            shuffledPlaylist.add(copiedPlaylist.get(a));
            // stores random Song from given Playlist in shuffledPlaylist
            copiedPlaylist.remove(a);
            //removes Song out of random-Number index in order to prevent doubled assignments;
        }
        return shuffledPlaylist;
    }

    public static ArrayList<String> swapPlaylist(ArrayList<String> playlist) {
        ArrayList<String> copiedPlaylist = new ArrayList<>(playlist);

        for (int i = 0; i < copiedPlaylist.size() / 2; i++) {
            String temp = copiedPlaylist.get(i);
            playlist.set(i, playlist.get(playlist.size() - (i + 1)));
            playlist.set(playlist.size() - (i + 1), temp);
        }
        return playlist;
    }

}