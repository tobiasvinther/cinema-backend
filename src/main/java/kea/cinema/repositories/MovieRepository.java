package kea.cinema.repositories;

import kea.cinema.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MovieRepository extends JpaRepository<Movie,Integer> {
    List<Movie> findMovieByName(String name);
}
