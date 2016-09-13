package se.cag.pittesting;

import org.junit.Ignore;
import org.junit.Test;
import se.cag.pittesting.MovieFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;


public class MovieFactoryTest {

    private static final String TITLE = "Pulp Fiction";
    private static final String DIRECTOR = "Quentin Tarantino";
    private static final String TITLE_2_CHARACTERS = "Pf";
    private static final String TITLE_3_CHARACTERS = "Pfi";

    private final MovieFactory movieFactory = new MovieFactory();

    @Test
    public void shouldCreateMovie() throws Exception {
        final Movie movie = movieFactory.create(TITLE, DIRECTOR);

        assertThat(movie, notNullValue());
        assertThat(movie.getTitle(), equalTo(TITLE));
        assertThat(movie.getDirector(), equalTo(DIRECTOR));
        assertThat(movie.getId(), not(isEmptyOrNullString()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailCreateMovieWithNoTitleGiven() throws Exception {
        movieFactory.create(null, DIRECTOR);
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldFailCreateMovieWithNoDirectorGiven() throws Exception {
        movieFactory.create(TITLE, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailCreateMovieWithTooShortTitleGiven() throws Exception {
        movieFactory.create(TITLE_2_CHARACTERS, DIRECTOR);
    }

   /* @Test(expected = IllegalArgumentException.class)
    public void shouldWorkCreateMovieWithTitleGiven() throws Exception {
        movieFactory.create(TITLE_3_CHARACTERS, DIRECTOR);
    }*/

    /*
       - light green shows line coverage
       - dark green shows mutation coverage
       - lLight pink show lack of line coverage
       - dDark pink shows lack of mutation coverage

    */
}