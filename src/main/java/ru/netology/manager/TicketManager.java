package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

import java.util.Arrays;

public class TicketManager {
    TicketRepository repository = new TicketRepository();

    public TicketManager() {
    }

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public TicketRepository getRepository() {
        return repository;
    }

    public void setRepository(TicketRepository repository) {
        this.repository = repository;
    }

    public void add(Ticket ticket) {
        repository.add(ticket);
    }

    public Ticket[] findAll(String airportOfDeparture, String airportOfArrival) {
        Ticket[] results = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (matches(ticket, airportOfDeparture, airportOfArrival)) {
                Ticket[] tmp = new Ticket[results.length + 1];
                for (int i = 0; i < results.length; i++) {
                    tmp[i] = results[i];
                }
                tmp[tmp.length - 1] = ticket;
                results = tmp;
            }
        }
        Arrays.sort(results);
        return results;
    }

    public boolean matches(Ticket ticket, String airportOfDeparture, String airportOfArrival) {
        if (!ticket.getAirportOfDeparture().equals(airportOfDeparture)) {
            return false;
        }
        if (!ticket.getAirportOfArrival().equals(airportOfArrival)) {
            return false;
        }
        return true;
    }

    public void getPrice() {
    }
}
