package kea.cinema.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//change everything to test a real class

@DataJpaTest
class ExampleServiceTest {

    ExampleService cut;

    @BeforeEach
    void setUp() {
        cut = new ExampleService();
    }

    @AfterEach
    void tearDown() {
    }
}