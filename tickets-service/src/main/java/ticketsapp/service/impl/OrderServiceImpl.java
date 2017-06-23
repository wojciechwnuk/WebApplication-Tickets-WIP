package ticketsapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticketsapp.service.OrderService;
import ticketsapp.domain.Event;
import ticketsapp.repository.EventRepository;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class OrderServiceImpl implements OrderService {


    private EventRepository eventRepository;
    @Autowired
    public OrderServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void sendConfirmationEmail() {
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
            generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("wojciechwnuk.lublin@gmail.com"));

        generateMailMessage.setSubject("Uwaga!");
        String emailBody = "Konczy sie miejsce w schronisku - pozostalo wolnych miejsc!";
        generateMailMessage.setContent(emailBody, "text/html");
        System.out.println("Session configuration - ok!");

        Transport transport = getMailSession.getTransport("smtp");
        transport.connect("smtp.gmail.com", "wojciechwnuk.lublin@gmail.com ", "S4nd3ydrive!");
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        System.out.println("Email send correctly.");

    }
}



