package com.lao.pojo.construct;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub
		
		SuperHeroMovieAndTVSeries heroMovieAndTVSeries = new SuperHeroMovieAndTVSeries();
		heroMovieAndTVSeries.setCategory("Super Hero Moves & TV Series");
		
		List<String>  acceptedFranchises =new ArrayList<String>();
		acceptedFranchises.add("DC");
		acceptedFranchises.add("Marvel");
		
		heroMovieAndTVSeries.setAcceptedFranchise(acceptedFranchises);
		

		List<String>  genres =new ArrayList<String>();
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Heroic");
		genres.add("Dark");
		genres.add("Funny");
		
		heroMovieAndTVSeries.setGenres(genres);
		
		List<Movies> allMovies= new  ArrayList<>();
		
	 Movies batman =new Movies();
	 batman.setTitle("Batman : The Dark Knight");
	 batman.setYear(2008);
	 
	 List <String> batmanCast= new ArrayList<String>();
	batmanCast.add("Chrstain Bale");
	batmanCast.add("Heath Ledger");
	batman.setCast(batmanCast);
	
	allMovies.add(batman);
	
	
	Movies justiceLeague = new Movies();
	justiceLeague.setTitle("Jutice League : Snyder Cut");
	justiceLeague.setYear(2021);
	 
	List <String>justiceLeagueCast = new ArrayList<String>();
	
	justiceLeagueCast.add("Henry Cavill");
	justiceLeagueCast.add("Gal Gadot");
	justiceLeague.setCast(justiceLeagueCast);
	
	allMovies.add(justiceLeague);
	
	
	Movies averagers = new Movies();
	averagers.setTitle("Averagers : age of Ultron");
	averagers.setYear(2015);
	 
	List <String>averagersCast = new ArrayList<String>();
	
	averagersCast.add("Robert Downey");
	averagersCast.add("Chris Evans");
	averagers.setCast(averagersCast);
	
	allMovies.add(averagers);
	
	Movies theAveragers = new Movies();
	theAveragers.setTitle("The Averagers");
	theAveragers.setYear(2012);
	 
	List <String>theaveragersCast = new ArrayList<String>();
	
	theaveragersCast.add("Chris Evans");
	theaveragersCast.add("Chris Hemsworth");
	theAveragers.setCast(theaveragersCast);
	
	allMovies.add(theAveragers);
	
	
	List<TVSeries> allTVSeries= new  ArrayList<>();
	
	TVSeries flash = new TVSeries();
	flash.setTitle("Flash");
	flash.setYear(2014);
	
	allTVSeries.add(flash);
	
	TVSeries gotham = new TVSeries();
	gotham.setTitle("Gotham");
	gotham.setYear(2013);
	allTVSeries.add(gotham);
	
	TVSeries superGirl = new TVSeries();
	superGirl.setTitle("Super Girl");
	superGirl.setYear(2015);
	
	allTVSeries.add(superGirl);
	
	
	OtherDetails otherDetails = new OtherDetails();
	
	otherDetails.setCountry("only USA");
	otherDetails.setLanguage("alien");
	
	
		heroMovieAndTVSeries.setOtherDetails(otherDetails);
		heroMovieAndTVSeries.setMovies(allMovies);
		heroMovieAndTVSeries.setTvSeries(allTVSeries);
		
		ObjectMapper mapper = new ObjectMapper();
		
		File superJson= new  File("complex.json");
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(superJson,heroMovieAndTVSeries);
		

	}

}
