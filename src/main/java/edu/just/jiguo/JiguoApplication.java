package edu.just.jiguo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("edu.just.jiguo.dao")
public class JiguoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiguoApplication.class, args);
    }
}
