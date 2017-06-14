package ticketsapp.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticketsapp.account.OrderService;
import ticketsapp.domain.Event;
import ticketsapp.repository.EventRepository;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    public OrderServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    private EventRepository eventRepository;

    @Override
    public Event getIdOfEvent(Long id) {
        return eventRepository.getOne(id);
    }

    public void sendEmail(String recipientEmail) {
        Properties mailServerProperties;
        Session getMailSession;
        MimeMessage generateMailMessage;

        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        System.out.println("Email server configuration - ok!");

        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        generateMailMessage = new MimeMessage(getMailSession);
        try {
            generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));

            generateMailMessage.setSubject("Uwaga!");
            String emailBody = "Your ticket is ready. Its number is: "+ orderNrGenerator()+ "! Print it or put to your mobile device and show at the entrace.";
            generateMailMessage.setContent(emailBody, "text/html");
            System.out.println("Session configuration - ok!");

            Transport transport = getMailSession.getTransport("smtp");
            transport.connect("smtp.gmail.com", "animalshelterjava@gmail.com", "Qwerty1234");
            transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
            transport.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        System.out.println("Email send correctly.");
    }

    Integer orderNrGenerator() {
        Random random = new Random();
        Integer numberOfOrder = random.nextInt(1000) + 100000;
        return numberOfOrder;
    }
}

