package laozhoy1.starter.springbootredishiberatemysql.Service;

import org.springframework.stereotype.Service;


public interface MailService  {
    public void sendMail(String to ,String subject,String veryCode);
}
