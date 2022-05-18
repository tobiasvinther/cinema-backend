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
        Movie movie3 = new Movie(3, "The Northman", "https://media-cache.cinematerial.com/p/500x/xdjtp2kt/the-northman-movie-poster.jpg?v=1648567125");
        Movie movie4 = new Movie(4, "Top Gun: Maverick", "https://media-cache.cinematerial.com/p/500x/nza9lluu/top-gun-maverick-movie-poster.jpg?v=1648561333");
        Movie movie5 = new Movie(5, "Everything Everywhere All at Once", "https://media-cache.cinematerial.com/p/500x/ckamivwa/everything-everywhere-all-at-once-movie-poster.jpg?v=1646776812");
        movieRepository.save(movie1);
        movieRepository.save(movie2);
        movieRepository.save(movie3);
        movieRepository.save(movie4);
        movieRepository.save(movie5);

        Showing showing1 = new Showing(1, LocalDate.of(2022, 5, 16), LocalTime.of(10, 0), movie1);
        Showing showing9 = new Showing(9, LocalDate.of(2022, 5, 18), LocalTime.of(10, 0), movie1);
        Showing showing10 = new Showing(10, LocalDate.of(2022, 5, 21), LocalTime.of(10, 0), movie1);
        Showing showing2 = new Showing(2, LocalDate.of(2022, 5, 21), LocalTime.of(12, 45), movie1);
        showingRepository.save(showing1);
        showingRepository.save(showing2);

        Showing showing3 = new Showing(3, LocalDate.of(2022, 5, 16), LocalTime.of(10, 0), movie2);
        Showing showing4 = new Showing(4, LocalDate.of(2022, 5, 16), LocalTime.of(12, 45), movie2);
        Showing showing5 = new Showing(5, LocalDate.of(2022, 5, 16), LocalTime.of(14, 30), movie2);
        Showing showing6 = new Showing(6, LocalDate.of(2022, 5, 17), LocalTime.of(14, 30), movie2);
        Showing showing7 = new Showing(7, LocalDate.of(2022, 5, 18), LocalTime.of(17, 15), movie2);
        Showing showing8 = new Showing(8, LocalDate.of(2022, 5, 18), LocalTime.of(20, 0), movie2);
        showingRepository.save(showing3);
        showingRepository.save(showing4);
        showingRepository.save(showing5);
        showingRepository.save(showing6);
        showingRepository.save(showing7);
        showingRepository.save(showing8);
        showingRepository.save(showing9);
        showingRepository.save(showing10);

        Showing showing11 = new Showing(LocalDate.of(2022, 5, 18), LocalTime.of(10, 0), movie3);
        Showing showing12 = new Showing(LocalDate.of(2022, 5, 18), LocalTime.of(12, 45), movie3);
        Showing showing13 = new Showing(LocalDate.of(2022, 5, 19), LocalTime.of(14, 30), movie3);
        Showing showing14 = new Showing(LocalDate.of(2022, 5, 19), LocalTime.of(17, 15), movie3);
        Showing showing15 = new Showing(LocalDate.of(2022, 5, 19), LocalTime.of(20, 0), movie3);
        Showing showing16 = new Showing(LocalDate.of(2022, 5, 20), LocalTime.of(20, 0), movie3);
        showingRepository.save(showing11);
        showingRepository.save(showing12);
        showingRepository.save(showing13);
        showingRepository.save(showing14);
        showingRepository.save(showing15);
        showingRepository.save(showing16);

        Showing showing17 = new Showing(LocalDate.of(2022, 5, 18), LocalTime.of(10, 0), movie4);
        Showing showing18 = new Showing(LocalDate.of(2022, 5, 18), LocalTime.of(12, 45), movie4);
        Showing showing19 = new Showing(LocalDate.of(2022, 5, 19), LocalTime.of(10, 0), movie4);
        Showing showing20 = new Showing(LocalDate.of(2022, 5, 19), LocalTime.of(17, 15), movie4);
        Showing showing21 = new Showing(LocalDate.of(2022, 5, 19), LocalTime.of(17, 15), movie4);
        Showing showing22 = new Showing(LocalDate.of(2022, 5, 20), LocalTime.of(20, 0), movie4);
        showingRepository.save(showing17);
        showingRepository.save(showing18);
        showingRepository.save(showing19);
        showingRepository.save(showing20);
        showingRepository.save(showing21);
        showingRepository.save(showing22);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        movieRepository.deleteAll();
        showingRepository.deleteAll();

        createMoviesAndShowings();
    }


}
