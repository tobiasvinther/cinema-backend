package kea.cinema.services;

import kea.cinema.dtos.ShowingResponse;
import kea.cinema.entities.Showing;
import kea.cinema.repositories.ShowingRepository;
import org.springframework.stereotype.Service;

@Service
public class ShowingService {

    ShowingRepository showingRepository;

    public ShowingService(ShowingRepository showingRepository) {
        this.showingRepository = showingRepository;
    }

    public void subtractTickets(int id, int ticketAmount) throws Exception {
       Showing showing = showingRepository.findById(id).orElseThrow(()-> new Exception("No showing with provided ID found"));;
        if(showing.getTicketsLeft() >= ticketAmount) {
            showing.setTicketsLeft(showing.getTicketsLeft() - ticketAmount);
            showingRepository.save(showing);
        } else {
            System.out.println("Not enough tickets left");
        }

    }

    public ShowingResponse getShowingById(int id) throws Exception {
        Showing showing = showingRepository.findById(id).orElseThrow(()-> new Exception("No showing with provided ID found"));
        return new ShowingResponse(showing, false);
    }

}
