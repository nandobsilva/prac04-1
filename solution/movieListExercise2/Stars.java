package movieListExercise2;

/**
 * A class for rating movies from one to five stars.
 * 
 *
 *
 */
public class Stars implements Rating {

	private String stars; // store the rating as a printable string

	public Stars(int rating) throws MovieListException {
		if (rating < 1 || rating > 5)
			throw new MovieListException("Illegal number of stars: " + rating);
		else {
			stars = "";
			for (int star = 0; star < rating; star++) stars += "*";;
		}
	}

	public String getRating() {
		return stars;
	}

}
