public class Movie
{
    int movieRank;
    String title;
    String director;
    int score;
    public Movie(int movieRank, String title, String director, int score) {
        this.movieRank = movieRank;
        this.title = title;
        this.director = director;
        this.score = score;
    }
    public int getMovieRank() {
        return movieRank;
    }
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public int getScore() {
        return score;
    }
    @Override
    public String toString() {
        return "Movie [director=" + director + ", movieRank=" + movieRank + ", score=" + score + ", title=" + title
                + "]";

                        String response = scanner.nextLine();
        Integer selectedMovie = Integer.parseInt(response);

        for(Movie movie:movieList){
            if(movie.rank == selectedMovie){
                System.out.println("You selected >>> " + movie.title + " by " + movie.director);
            }
    }
   
    



}//class