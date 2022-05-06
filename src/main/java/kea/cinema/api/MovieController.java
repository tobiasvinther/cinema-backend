package kea.cinema.api;

import kea.cinema.dtos.MovieResponse;
import kea.cinema.entities.Movie;
import kea.cinema.repositories.MovieRepository;
import kea.cinema.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
//@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
@RequestMapping("api/movies") //change this to something relevant
public class MovieController {

    MovieService movieService;
    //MovieRepository movieRepository;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    //get all movies
    @GetMapping()
    public List<MovieResponse> getMovies() {
        return movieService.getAllMovies();
    }

    /*
    //get a specific movie by id
    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable int id) {
        return movieService.getMovie(id);
    }

    //get all showings
    @GetMapping("/showings")
    public List<Showing> getShowings() {
        return showingService.getShowings();
    }
     */

}
