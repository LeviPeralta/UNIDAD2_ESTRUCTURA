public class Playlist {
    private SongNode head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String name, int duration) {
        SongNode newSong = new SongNode(name, duration);
        if (head == null) {
            head = newSong;
        } else {
            SongNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    public void removeSong(String name) {
        if (head == null) return;

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        SongNode current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void printPlaylist() {
        System.out.println("Lista actual:");
        SongNode current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". " + current.name + " (" + current.duration + " s)");
            current = current.next;
            index++;
        }
        System.out.println("Duración total: " + getTotalDuration() + " s");
    }

    public int getTotalDuration() {
        int total = 0;
        SongNode current = head;
        while (current != null) {
            total += current.duration;
            current = current.next;
        }
        return total;
    }
}
