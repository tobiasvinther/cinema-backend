package kea.cinema.services;

import kea.cinema.dtos.MovieResponse;
import kea.cinema.entities.Movie;
import kea.cinema.mapper.Mapper;
import kea.cinema.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    MovieRepository movieRepository;
    Mapper mapper;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<MovieResponse> getAllMovies(){
        List<Movie> movieEntities = movieRepository.findAll();
        return MovieResponse.MovieFromEntity(movieEntities);
    }

    public MovieResponse getMovie(String name){
        Movie movieToFind = (Movie) movieRepository.findMovieByName(name);
        return mapper.toMovieResponse(movieToFind);
    }

}
