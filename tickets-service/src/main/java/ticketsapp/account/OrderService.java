
package ticketsapp.account;


/**
 * Created by RENT on 2017-06-12.
 */
public interface OrderService {
    void sendEmail(String recipientEmail, Long numberOfTickets);
    Long enterNrOfTickets(Long numberOfTickets);

}