package ru.netology.domain;

public class Ticket implements Comparable<ru.netology.domain.Ticket> {
    private int id;
    private int price;
    private String airportOfDeparture;
    private String airportOfArrival;
    private int time;

    public Ticket() {

    }

    public Ticket(int id, int price, String airportOfDeparture, String airportOfArrival, int time) {
        this.id = id;
        this.price = price;
        this.airportOfDeparture = airportOfDeparture;
        this.airportOfArrival = airportOfArrival;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAirportOfDeparture() {
        return airportOfDeparture;
    }

    public void setAirportOfDeparture(String airportOfDeparture) {
        this.airportOfDeparture = airportOfDeparture;
    }

    public String getAirportOfArrival() {
        return airportOfArrival;
    }

    public void setAirportOfArrival(String airportOfArrival) {
        this.airportOfArrival = airportOfArrival;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(ru.netology.domain.Ticket o) {
        // -1
        // 0
        // 1
        return this.price - o.price; /// TODO check the price
    }
}
