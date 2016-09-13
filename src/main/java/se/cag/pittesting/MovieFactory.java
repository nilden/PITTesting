package se.cag.pittesting;

import java.util.UUID;

public class MovieFactory {
    private static final int MIN_LENGTH = 3;

    public Movie create(final String title, final String director) {
        if (title == null) {
            throw new IllegalArgumentException("title must be set");
        }
        if (title.length() <= MIN_LENGTH) {
            throw new IllegalArgumentException("title must have a minimal length of " + MIN_LENGTH);
        }
        if (director == null) {
            throw new IllegalArgumentException("director must be set");
        }

        return new Movie(UUID.randomUUID().toString().toUpperCase(), title, director);
    }
}