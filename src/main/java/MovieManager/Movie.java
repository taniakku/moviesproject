package MovieManager;

public class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private int year;

    public Movie(int movieId, String movieName, String genre, int year) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.year = year;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
