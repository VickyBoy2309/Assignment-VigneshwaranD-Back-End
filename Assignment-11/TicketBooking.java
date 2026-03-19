//Task - 3

abstract class Transport {

  abstract void bookTicket();
}

class Bus extends Transport {

  @Override
  void bookTicket() {
    System.out.println("Booking Bus Ticket");
    System.out.println("Seat reserved in Bus");
  }
}

class Train extends Transport {

  @Override
  void bookTicket() {
    System.out.println("Booking Train Ticket");
    System.out.println("Seat reserved in Train");
  }
}

class Flight extends Transport {

  @Override
  void bookTicket() {
    System.out.println("Booking Flight Ticket");
    System.out.println("Seat reserved in Flight");
  }
}

public class TicketBooking {

  public static void main(String[] args) {

    Transport t1 = new Bus();
    Transport t2 = new Train();
    Transport t3 = new Flight();

    System.out.println();
    t1.bookTicket();
    System.out.println();

    t2.bookTicket();
    System.out.println();

    t3.bookTicket();
    System.out.println();
  }
}