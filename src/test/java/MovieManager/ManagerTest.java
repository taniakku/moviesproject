package MovieManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {


    @Test
    void shouldAddOneMovie() {
        Manager movieManager = new Manager();
        Movie first = new Movie(1, "Фильм", "жанр", 1990);

        movieManager.addMovie(first);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldAddZero() {
        Manager movieManager = new Manager(0);
        Movie first = new Movie(1, "Фильм", "жанр", 1990);

        movieManager.addMovie(first);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldAddMoviesToTheEmptyList() {
        Manager movieManager = new Manager(3);
        Movie first = new Movie(1, "Фильм", "жанр", 1990);
        Movie second = new Movie(2, "Бладшот", "боевик", 2020);

        movieManager.addMovie(first);
        movieManager.addMovie(second);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{second, first};

        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldAddMoviesToTheListWithSetLimit() {
        Manager movieManager = new Manager(5);
        Movie first = new Movie(1, "Фильм", "жанр", 1990);
        Movie second = new Movie(2, "Бладшот", "боевик", 2020);
        Movie third = new Movie(3, "Фильм2", "жанр2", 1990);
        Movie fourth = new Movie(4, "Фильм3", "жанр", 1990);
        Movie fifth = new Movie(5, "Фильм4", "жанр", 1990);
        Movie sixth = new Movie(6, "Фильм5", "жанр", 1990);

        movieManager.addMovie(first);
        movieManager.addMovie(second);
        movieManager.addMovie(third);
        movieManager.addMovie(fourth);
        movieManager.addMovie(fifth);
        movieManager.addMovie(sixth);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldAddMoreThanDefaultLimit() {
        Manager movieManager = new Manager();
        Movie first = new Movie(1, "Фильм", "жанр", 1990);
        Movie second = new Movie(2, "Бладшот", "боевик", 2020);
        Movie third = new Movie(3, "Фильм2", "жанр2", 1990);
        Movie fourth = new Movie(4, "Фильм3", "жанр", 1990);
        Movie fifth = new Movie(5, "Фильм4", "жанр", 1990);
        Movie sixth = new Movie(6, "Фильм5", "жанр", 1990);
        Movie seventh = new Movie(7, "Movie7", "genre", 1990);
        Movie eighth = new Movie(8, "Movie 8", "genre", 1990);
        Movie ninth = new Movie(9, "movie 9", "genre", 1991);
        Movie tenth = new Movie(10, "movie 10", "genre", 1999);
        Movie eleventh = new Movie(11, "Фильм", "жанр", 1990);

        movieManager.addMovie(first);
        movieManager.addMovie(second);
        movieManager.addMovie(third);
        movieManager.addMovie(fourth);
        movieManager.addMovie(fifth);
        movieManager.addMovie(sixth);
        movieManager.addMovie(seventh);
        movieManager.addMovie(eighth);
        movieManager.addMovie(ninth);
        movieManager.addMovie(tenth);
        movieManager.addMovie(eleventh);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);


    }


}