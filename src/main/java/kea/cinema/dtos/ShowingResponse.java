package kea.cinema.dtos;

import kea.cinema.entities.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class ShowingResponse {
    private int id;
    private LocalDate date;
    private LocalTime time;
    private String movieTitle;
    private int ticketsLeft;

    public ShowingResponse (Showing showing, boolean includeAll){
        this.id = showing.getId();
        this.date = showing.getDate();
        this.time = showing.getTime();
        this.movieTitle = showing.getMovie().getName();
        this.ticketsLeft = showing.getTicketsLeft();
    }

    public static List<ShowingResponse> ShowingFromEntity(Set<Showing> showings){
        return showings.stream().map(showing -> new ShowingResponse(showing,false)).collect(Collectors.toList());
    }
}

