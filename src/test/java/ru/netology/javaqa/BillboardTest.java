package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BillboardTest {

    @Test
    public void shouldAddNewMovie() {
        BillboardMovie board = new BillboardMovie();

        board.addNewMovie("Film 1");
        board.addNewMovie("Film 2");
        board.addNewMovie("Film 3");
        board.addNewMovie("Film 4");
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = board.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmTest() {
        BillboardMovie board = new BillboardMovie(3);
        board.addNewMovie("Film I");
        board.addNewMovie("Film II");
        board.addNewMovie("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, board.findLast());
    }

    @Test
    public void findLastFilmWhenLessLimit() {
        BillboardMovie board = new BillboardMovie(4);
        board.addNewMovie("Film I");
        board.addNewMovie("Film II");
        board.addNewMovie("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};

        Assertions.assertArrayEquals(expected, board.findLast());
    }

    @Test
    public void findLastFilmWhenMoreLimit() {
        BillboardMovie board = new BillboardMovie(2);
        board.addNewMovie("Film I");
        board.addNewMovie("Film II");
        board.addNewMovie("Film III");

        String[] expected = {"Film III", "Film II"};

        Assertions.assertArrayEquals(expected, board.findLast());
    }
}