package MovieManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {


    @Test
    void shouldAddOneMovie() {
        Manager movieManager = new Manager(new Movie[0]);
        Movie first = new Movie(1, "Фильм", "жанр", 1990);

        movieManager.addMovie(first);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldAddTwoMoviesToTheEmptyList() {
        Manager movieManager = new Manager(new Movie[0]);
        Movie first = new Movie(1, "Фильм", "жанр", 1990);
        Movie second = new Movie(2, "Бладшот", "боевик", 2020);

        movieManager.addMovie(first);
        movieManager.addMovie(second);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{second, first};

        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldAddTwoMoviesToTheListWithLimit() {
        Manager movieManager = new Manager(new Movie[5]);
        Movie first = new Movie(1, "Фильм", "жанр", 1990);
        Movie second = new Movie(2, "Бладшот", "боевик", 2020);

        movieManager.addMovie(first);
        movieManager.addMovie(second);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{second, first, null, null, null, null, null};

        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldAddMoreThanTen() {
        Manager movieManager = new Manager();

        Movie eleventh = new Movie(1, "Фильм", "жанр", 1990);

        movieManager.addMovie(eleventh);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{eleventh, null, null, null, null, null, null, null, null, null};

        assertArrayEquals(expected, actual);


    }


}