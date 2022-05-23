package ru.netology.repository;

import ru.netology.domain.Ticket;

public class TicketRepository {
    Ticket[] tickets = new Ticket[0];

    public TicketRepository() {
    }

    public TicketRepository(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public Ticket[] findAll() {
        return getTickets();
    }
}
