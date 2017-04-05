package io.virandry.jsf.beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import io.virandry.model.AudienceScore;
import io.virandry.model.Movie;
import io.virandry.model.TomatoMeter;

@ManagedBean
@SessionScoped
public class ViewMoviesManagedBean {

	ArrayList<Movie> movieList = new ArrayList<Movie>();

	public ViewMoviesManagedBean() {

	}

	@PostConstruct
	public void populateEmployeeList() {
		Movie movie1 = new Movie(1, "KONG: SKULL ISLAND", 2017, "/jerjack/images/kong.jpg",
				new TomatoMeter("6.6/10", "273", "212", "61"), new AudienceScore("3.7/5", "38,245"));
		Movie movie2 = new Movie(2, "Ghost in the Shell", 2017, "/jerjack/images/ghost.jpg",
				new TomatoMeter("5.5/10", "159", "68", "91"), new AudienceScore("3.5/5", "28,203"));
		this.movieList.add(movie1);
		this.movieList.add(movie2);
	}

	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(ArrayList<Movie> movieList) {
		this.movieList = movieList;
	}

}
