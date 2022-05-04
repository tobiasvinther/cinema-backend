package kea.cinema.api;

import kea.cinema.entities.Movie;
import kea.cinema.repositories.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
//@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
@RequestMapping("api/movies") //change this to something relevant
public class MovieController {

    //private MovieService movieService;
    //private ShowingService showingService;
    MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    //get all movies
    @GetMapping()
    public List<Movie> getMovies() {
        List<Movie> movieList = movieRepository.findAll();
        System.out.println("Liste: " + movieList);
        return movieList;
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
