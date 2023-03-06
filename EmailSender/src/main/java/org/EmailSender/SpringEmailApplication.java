package org.EmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.mail.MessagingException;
import java.util.Properties;

@SpringBootApplication
public class SpringEmailApplication {
    @Autowired
    private EmailSenderService senderService;
    public static void main(String[] args) {
        SpringApplication.run(SpringEmailApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() throws MessagingException {
        senderService.sendSimpleEmail("yuoturellepikie@gmail.com", "Test email", "Hello there..."); //заменить на нужную почту!!!
    }
}
