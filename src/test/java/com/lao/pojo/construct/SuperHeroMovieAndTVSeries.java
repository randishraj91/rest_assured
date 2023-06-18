package com.lao.pojo.construct;

import java.util.List;

import lombok.Data;
@Data
public class SuperHeroMovieAndTVSeries {
	
	private String category;
	private List<String> acceptedFranchise;
	private List<String> genres;
	private List<Movies> movies;
	private List<TVSeries> TvSeries;
	private OtherDetails OtherDetails;
	
	
	
	
	

}
