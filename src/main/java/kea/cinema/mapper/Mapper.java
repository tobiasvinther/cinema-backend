package kea.cinema.mapper;

import kea.cinema.dtos.MovieResponse;
import kea.cinema.dtos.ShowingResponse;
import kea.cinema.entities.Movie;
import kea.cinema.entities.Showing;

public class Mapper {

    public MovieResponse toMovieResponse(Movie movie){
        MovieResponse movieResponse = new MovieResponse();
        movieResponse.setName(movie.getName());
        movieResponse.setPosterLink(movie.getPosterLink());
        return movieResponse;
    }

    public ShowingResponse toShowingResponse(Showing showing){
        ShowingResponse showingResponse = new ShowingResponse();
        showingResponse.setDate(showing.getDate());
        showingResponse.setTime(showing.getTime());
        return showingResponse;
    }

    /* Will make if needed
    public Movie toEntity(){
    }
     */

}
