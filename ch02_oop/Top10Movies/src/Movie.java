public class Movie
{
        int movieRank;
        String title;
        String director;
        int score;
  
  
     public Movie(int movieRank, String title, String director, int score)
     {
        this.movieRank = movieRank;
        this.title = title;
        this.director = director;
        this.score = score;
     }//constructor
  
     public int getMovieRank()
     {
        return movieRank;
     }
  
     public void setMovieRank(int movieRank)
     {
        this.movieRank = movieRank;
     }
  
     public String getTitle()
     {
        return title;
     }
  
     public void setTitle(String title)
     {
        this.title = title;
     }
  
     public String getDirector()
     {
        return director;
     }
  
     public void setDirector(String director)
     {
        this.director = director;
     }
  
     public int getScore()
     {
        return score;
     }
  
     public void setScore(int score)
     {
        this.score = score;
     }
  
     @Override
     public String toString()
     {
        return "\nMovie:\n" +
                "Rank = " + movieRank +
                ", \ntitle = " + title +
                ", \ndirector = " + director +
                ", \nscore=" + score;
  
     }//toString

}//class