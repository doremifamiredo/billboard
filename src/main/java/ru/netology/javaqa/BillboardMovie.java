package ru.netology.javaqa;

public class BillboardMovie {

    private String[] movies = new String[0];
    private int limit;

    public BillboardMovie() {
        this.limit = 5;
    }

    public BillboardMovie(int limit) {
        this.limit = limit;
    }

    public void addNewMovie(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;

    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLenth;
        if (movies.length < limit) {
            resultLenth = movies.length;
        } else {
            resultLenth = limit;
        }
        String[] ans = new String[resultLenth];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - 1 - i];
        }
        return ans;
    }
}

