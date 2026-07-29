package org.hangling.paysystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.hangling.paysystem.mapper")
public class PaysystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaysystemApplication.class, args);
    }

}
