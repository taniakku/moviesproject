package MovieManager;

public class Manager {
    private Movie[] movies = new Movie[10];

//конструкторы

    public Manager(Movie[] movies) {
        this.movies = movies;
    }

    public Manager() {
    }

//методы

    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] moreMovies = new Movie[length];

        for (int i = 0; i < movies.length; i++) {
            moreMovies[i] = movies[i];
        }
        int newMovie = moreMovies.length - 1;
        moreMovies[newMovie] = movie;

        movies = moreMovies;

    }

    public Movie[] getAll() {

        int resultLength;

        if (movies.length >= 10) {
            resultLength = 10;
        } else {
            resultLength = movies.length;
        }


        Movie[] lastAdded = new Movie[resultLength];

        for (int i = 0; i < lastAdded.length; i++) {
            int index = movies.length - i - 1;
            lastAdded[i] = movies[index];

        }
        return lastAdded;
    }


}
