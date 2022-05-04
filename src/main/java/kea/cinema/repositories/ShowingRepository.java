package kea.cinema.repositories;

import kea.cinema.entities.Showing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowingRepository extends JpaRepository<Showing, Integer> {

}
