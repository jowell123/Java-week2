public class Song {

    int chartPosition;
    String title;
    String artist;
    String label;

    public Song(int chartPosition, String title, String artist, String label) {
        this.chartPosition = chartPosition;
        this.title = title;
        this.artist = artist;
        this.label = label;
    }

    public int getChartPosition() {
        return chartPosition;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Song [artist=" + artist + ", chartPosition=" + chartPosition + ", label=" + label + ", title=" + title
                + "]";
    }

    

}// class