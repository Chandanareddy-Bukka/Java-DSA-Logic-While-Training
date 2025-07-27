abstract class Movie {
    String movieId, title;
    int numberOfTickets;
    double ticketPrice;

    abstract double calculatePrice();

    void displayDetails() {
        System.out.println("\nMovie Record");
        System.out.println("ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);

        if (numberOfTickets > 6) {
            System.out.println("Booking Failed: Cannot book more than 6 tickets");
        } else {
            double totalPrice = calculatePrice();
            System.out.println("Total Price: " + totalPrice);
        }
    }
}

class TeluguMovie extends Movie {
    TeluguMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        this.movieId = movieId;
        this.title = title;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculatePrice() {
        double price = ticketPrice * numberOfTickets;
        price+=price*0.05;
        return price;
    }
}

class HindiMovie extends Movie {
    HindiMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        this.movieId = movieId;
        this.title = title;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculatePrice() {
        double price = ticketPrice * numberOfTickets;
        price -= price * 0.10;     
        price += price * 0.05;     
        return price;
    }
}

class EnglishMovie extends Movie {
    EnglishMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        this.movieId = movieId;
        this.title = title;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculatePrice() {
        double price = ticketPrice * numberOfTickets;
        price += (50 * numberOfTickets); 
        price += price * 0.05;           
        return price;
    }
}

public class Project {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new TeluguMovie("M101", "RRR", 150.0, 3);
        movies[1] = new HindiMovie("M102", "Pathaan", 200.0, 2);
        movies[2] = new EnglishMovie("M103", "Avatar", 250.0, 7);

        for (Movie x : movies) {
            x.displayDetails();
        }
    }
}

