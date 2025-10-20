class SongNode {
    String name;
    int duration;
    SongNode next;

    public SongNode(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.next = null;
    }
}
