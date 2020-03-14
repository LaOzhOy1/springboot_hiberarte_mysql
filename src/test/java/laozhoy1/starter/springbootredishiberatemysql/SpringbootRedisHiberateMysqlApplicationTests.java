package laozhoy1.starter.springbootredishiberatemysql;

import laozhoy1.starter.springbootredishiberatemysql.Service.MailService;
import laozhoy1.starter.springbootredishiberatemysql.Service.MailServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRedisHiberateMysqlApplicationTests {
    @Autowired
    private MailService mailService;
    @Test
    void contextLoads() {
    }
    @Test
    void    testMail()
    {
        mailService.sendMail("921752635@qq.com","","123");
    }
}
