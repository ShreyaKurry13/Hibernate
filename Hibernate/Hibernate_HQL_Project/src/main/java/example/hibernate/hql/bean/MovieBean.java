package example.hibernate.hql.bean;

public class MovieBean {
	
	private String movieTitle;
	private int movieYear;
	
	public MovieBean() {
		// TODO Auto-generated constructor stub
	}

	public MovieBean(String movieTitle, int movieYear) {
		super();
		this.movieTitle = movieTitle;
		this.movieYear = movieYear;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}

	@Override
	public String toString() {
		return "MovieBean [movieTitle=" + movieTitle + ", movieYear=" + movieYear + "]";
	}
	
}
