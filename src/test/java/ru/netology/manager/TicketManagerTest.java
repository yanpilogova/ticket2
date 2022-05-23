package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {

    @Test
    void getRepository() {
    }

    @Test
    void setRepository() {
    }

    @Test
    void add() {
    }

    @Test
    void findTicketsNull() {
        TicketRepository repository = new TicketRepository();
        Ticket[] expected = {};
        Ticket[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findOneTicket() {
        TicketManager manager = new TicketManager();
        Ticket ticketOne = new Ticket(1, 10_000, "LED", "IRA", 100);
        Ticket ticketTwo = new Ticket(2, 12_000, "OVB", "DME", 120);
        Ticket ticketThree = new Ticket(3, 100_000, "IKA", "KZS", 180);
        Ticket[] expected = new Ticket[]{ticketTwo};

        manager.add(ticketOne);
        manager.add(ticketTwo);
        manager.add(ticketThree);

        assertArrayEquals(expected, manager.findAll("OVB", "DME"));
    }

    @Test
    void findSeveralTheSameTickets() {
        TicketManager manager = new TicketManager();
        Ticket ticketOne = new Ticket(1, 10_000, "LED", "IRA", 100);
        Ticket ticketTwo = new Ticket(2, 12_000, "LED", "IRA", 120);
        Ticket ticketThree = new Ticket(3, 100_000, "LED", "IRA", 180);
        Ticket[] expected = new Ticket[]{ticketOne, ticketTwo, ticketThree};

        manager.add(ticketOne);
        manager.add(ticketTwo);
        manager.add(ticketThree);

        assertArrayEquals(expected, manager.findAll("LED", "IRA"));
    }

    @Test
    void findUnrealTicket() {
        TicketManager manager = new TicketManager();
        Ticket ticketOne = new Ticket(1, 10_000, "LED", "IRA", 100);
        Ticket ticketTwo = new Ticket(2, 12_000, "LED", "IRA", 120);
        Ticket ticketThree = new Ticket(3, 100_000, "LED", "IRA", 180);

        manager.add(ticketOne);
        manager.add(ticketTwo);
        manager.add(ticketThree);

        Ticket[] expected = new Ticket[0];
        Ticket[] actual = manager.findAll("LED", "OVB");

        assertArrayEquals(expected, actual);
    }


    @Test
    void matches() {
    }
}