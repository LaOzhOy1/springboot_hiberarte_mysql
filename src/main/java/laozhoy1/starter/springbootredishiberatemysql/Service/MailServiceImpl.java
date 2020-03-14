package laozhoy1.starter.springbootredishiberatemysql.Service;

import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;

import java.util.logging.Logger;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private TemplateEngine templateEngine;

    @Value("${mail.fromMail.addr}")
    private String from;
    @Override
    public void sendMail(String to, String subject, String verifyCode) {

        Context context = new Context();
        context.setVariable("verifyCode",verifyCode);
        String emailContext = templateEngine.process("emailTemplate",context);
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(emailContext);
        try {
            javaMailSender.send(simpleMailMessage);
            System.out.println("简单邮件已经发送。");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("发送简单邮件时发生异常！");
        }
//        return;
    }
}
