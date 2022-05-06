package kea.cinema.dtos;

import kea.cinema.entities.Movie;
import kea.cinema.entities.Showing;
import kea.cinema.mapper.Mapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class MovieResponse {
    Mapper mapper;
    private String name;
    private String posterLink;
    private List<ShowingResponse> showings;

    public MovieResponse(Movie movie, boolean includeAll){
        this.name = movie.getName();
        this.posterLink = movie.getPosterLink();
        this.showings = ShowingResponse.ShowingFromEntity(movie.getShowings());
    }

    public static List<MovieResponse> MovieFromEntity(List<Movie> movies){
        return movies.stream().map(movie -> new MovieResponse(movie,false)).collect(Collectors.toList());
    }
}
