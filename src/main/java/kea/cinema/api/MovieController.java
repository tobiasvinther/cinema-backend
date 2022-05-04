package kea.cinema.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/movies") //change this to something relevant
public class MovieController {

    /*
    private MovieService movieService;
    private ShowingService showingService;

    //get all movies
    @GetMapping()
    public List<Movie> getMovies() {
        return movieService.getMovies();
    }

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
