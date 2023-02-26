package moviebuddy.domain;

import moviebuddy.MovieBuddyApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JaxbMovieReaderTest {

	@Test
	void NotEmpty_LoadedMovies(){

		JaxMovieReader movieReader = new JaxMovieReader();

		List<Movie> movies = movieReader.loadMovies();
		Assertions.assertEquals(1375, movies.size());

	}

}
