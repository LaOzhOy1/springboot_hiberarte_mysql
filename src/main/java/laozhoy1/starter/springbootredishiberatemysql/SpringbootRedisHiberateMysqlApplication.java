package laozhoy1.starter.springbootredishiberatemysql;

import laozhoy1.starter.springbootredishiberatemysql.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRedisHiberateMysqlApplication {

    @Autowired
    MailService mailService;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisHiberateMysqlApplication.class, args);
    }

}
