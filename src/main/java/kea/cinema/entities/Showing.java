package kea.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Showing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate date;

    private LocalTime time;

    //Mange showings til en Movie
    @ManyToOne
    private Movie movie;

    //Mange showings til en hall
    @ManyToOne
    private Hall hall;

    private int ticketsLeft = 10 * 20; //let's pretend there's 10 rows with 20 seats each

    public Showing(int id, LocalDate date, LocalTime time, Movie movie) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.movie = movie;
        this.ticketsLeft = getTicketsLeft();
    }
}
