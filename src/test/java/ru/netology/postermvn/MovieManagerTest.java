package ru.netology.postermvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void shouldRememberMovies() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film first"); //добавление 1 фильма
        String[] actual = manager.findAll();
        String[] expected = {"Film first"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film first");
        manager.addMovie("Film second");
        manager.addMovie("Film third");

        String[] actual = manager.findAll();
        String[] expected = {"Film first", "Film second", "Film third"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outputInReverseOrder() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film first");
        manager.addMovie("Film second");
        manager.addMovie("Film third");

        String[] actual = manager.findLast();
        String[] expected = {"Film third", "Film second", "Film first",};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovies2() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie("Film first");
        manager.addMovie("Film second");
        manager.addMovie("Film third");
        manager.addMovie("Film fourth");
        manager.addMovie("Film fifth");
        manager.addMovie("Film sixth");
        manager.addMovie("Film seventh");

        String[] actual = manager.findAll();
        String[] expected = {"Film first", "Film second", "Film third", "Film fourth", "Film fifth", "Film sixth", "Film seventh"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddMovies3() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film first");
        manager.addMovie("Film second");
        manager.addMovie("Film third");
        manager.addMovie("Film fourth");
        manager.addMovie("Film fifth");

        String[] actual = manager.findAll();
        String[] expected = {"Film first", "Film second", "Film third", "Film fourth", "Film fifth"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outputInReverseOrder2() {
        MovieManager manager = new MovieManager(6);
        manager.addMovie("Film first");
        manager.addMovie("Film second");
        manager.addMovie("Film third");
        manager.addMovie("Film fourth");
        manager.addMovie("Film fifth");
        manager.addMovie("Film sixth");


        String[] actual = manager.findLast();
        String[] expected = {"Film sixth","Film fifth", "Film fourth", "Film third", "Film second", "Film first"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputInReverseOrder3() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film first");
        manager.addMovie("Film second");
        manager.addMovie("Film third");
        manager.addMovie("Film fourth");



        String[] actual = manager.findLast();
        String[] expected = {"Film fourth", "Film third", "Film second", "Film first"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputInReverseOrder4() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film first");
        manager.addMovie("Film second");
        manager.addMovie("Film third");
        manager.addMovie("Film fourth");
        manager.addMovie("Film fifth");
        manager.addMovie("Film sixth");



        String[] actual = manager.findLast();
        String[] expected = {"Film sixth","Film fifth","Film fourth", "Film third", "Film second"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputInReverseOrder5() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film first");
        manager.addMovie("Film second");
        manager.addMovie("Film third");
        manager.addMovie("Film fourth");
        manager.addMovie("Film fifth");



        String[] actual = manager.findLast();
        String[] expected = {"Film fifth","Film fourth", "Film third", "Film second", "Film first"};
        Assertions.assertArrayEquals(expected, actual);
    }


}
