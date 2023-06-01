package com.example.movie.command;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieListResult {
	String boxofficeType;
	String showRange;
	
	ArrayList<Movie> dailyBoxOfficeList = new ArrayList<Movie>();
}
