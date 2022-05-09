package kea.cinema.configurations;

import kea.cinema.entities.Movie;
import kea.cinema.entities.Showing;
import kea.cinema.repositories.MovieRepository;
import kea.cinema.repositories.ShowingRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
@Profile("!test")
public class CreateTestData implements ApplicationRunner {

    MovieRepository movieRepository;
    ShowingRepository showingRepository;

    public CreateTestData(MovieRepository movieRepository, ShowingRepository showingRepository) {
        this.movieRepository = movieRepository;
        this.showingRepository = showingRepository;
    }

    public void createMoviesAndShowings() {
        Movie movie1 = new Movie(1, "Fantastic Beasts: The Secrets of Dumbledore", "https://media-cache.cinematerial.com/p/500x/w8fx9gym/fantastic-beasts-the-secrets-of-dumbledore-movie-poster.jpg?v=1649286978");
        Movie movie2 = new Movie(2, "Sonic the Hedgehog 2", "https://media-cache.cinematerial.com/p/500x/wbv80d0r/sonic-the-hedgehog-2-movie-poster.jpg?v=1645121606");
        movieRepository.save(movie1);
        movieRepository.save(movie2);


        Showing showing1 = new Showing(1, LocalDate.of(2022, 5, 4), LocalTime.of(10, 0), movie1);
        Showing showing2 = new Showing(2, LocalDate.of(2022, 5, 4), LocalTime.of(12, 0), movie1);
        showingRepository.save(showing1);
        showingRepository.save(showing2);

        Showing showing3 = new Showing(3, LocalDate.of(2022, 5, 4), LocalTime.of(10, 0), movie2);
        showingRepository.save(showing3);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        movieRepository.deleteAll();
        showingRepository.deleteAll();

        createMoviesAndShowings();
    }


}
