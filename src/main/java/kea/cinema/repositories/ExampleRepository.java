package kea.cinema.repositories;

import kea.cinema.entities.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//change this to use a "real" entity
public interface ExampleRepository extends JpaRepository<ExampleEntity,Integer> {

}
