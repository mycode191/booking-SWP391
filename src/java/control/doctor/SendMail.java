package control.doctor;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *
 * @author anhdt
 */
public class SendMail {

    private final String MAIL = "benhviennongnghiepdemo@gmail.com";
    private final String PASSWORD = "benhviennongnghiep123";

    public void sentEmail(String toEmail, String subject, String text) {
       
        String subject_x = subject;
        String text_x = text;
        
        
        // Config
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");

        // Authenticator
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MAIL, PASSWORD);
            }
        });

        // Mail info
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(MAIL));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(text);

            Transport.send(message);
            System.out.println("Message sent successfully...");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String code = "SDASD232";
        String toEmail = "c9nguyenquanghieu@gmail.com";
        String subject = "Bệnh viện!";
        String text = "Thank you for using our service.\nThe medical code is: cảm ơn bạn " + code + subject;
        new SendMail().sentEmail(toEmail, subject, text);
    }
}
