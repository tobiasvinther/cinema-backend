package kea.exam.repositories;

import kea.exam.entities.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//change this to use a "real" entity
public interface ExampleRepository extends JpaRepository<ExampleEntity,Integer> {

}
