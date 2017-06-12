package ticketsapp.domain;

import org.springframework.web.multipart.MultipartFile;
import javax.persistence.*;


@Entity
@Table(name = "EVENTS")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long id;
    @Column(name = "date")
    private String date;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Long price;
    @Column(name = "availableTickets")
    private Long availableTickets;

    public MultipartFile getEventImage() {
        MultipartFile eventImage = null;
        return eventImage;
    }

    public Event() {
    }

    public Event(Long id, String date, String name, Long price, Long availableTickets) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.price = price;
        this.availableTickets=availableTickets;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(Long availableTickets) {
        this.availableTickets = availableTickets;
    }
}
