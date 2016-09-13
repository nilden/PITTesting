package se.cag.pittesting;

public class Movie {
    private final String id;
    private final String title;
    private final String director;

    public Movie(String id, String title, String director) {
        this.id = id;
        this.title = title;
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }
}
