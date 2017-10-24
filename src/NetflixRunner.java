
public class NetflixRunner {

	public static void main(String[] args) {

		// 1. Instantiate some Movie objects (at least 5).
		Movie hi = new Movie("hi", 1);
		Movie ha = new Movie("ha", 9);
		Movie he = new Movie("he", 4);
		Movie ho = new Movie("ho", 5);
		Movie hy = new Movie("hy", 8);
		// 2. Use the Movie class to get the ticket price of one of your movies.
		String x = hi.getTicketPrice();
		System.out.println(x);

		// 3. Instantiate a NetflixQueue.
		NetflixQueue q = new NetflixQueue();

		// 4. Add your movies to the Netflix queue.
		q.addMovie(hi);
		q.addMovie(ha);
		q.addMovie(he);
		q.addMovie(ho);
		q.addMovie(hy);

		// 5. Print all the movies in your queue.
		System.out.println(hi);
		System.out.println(ha);
		System.out.println(he);
		System.out.println(ho);
		System.out.println(hy);

		// 6. Use your NetflixQueue object to finish the sentence "the best movie
		// is...."
		Movie best = q.getBestMovie();
		String t = best.getTitle();
		System.out.println("the best movie is " + t);

		// 7. Use your NetflixQueue to finish the sentence "the second best movie
		// is...."
		q.sortMoviesByRating();
		Movie second = q.getMovie(1);
		String l = second.getTitle();
		System.out.println("The second best movie is " + l);
	}

}
