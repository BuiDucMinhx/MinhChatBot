package com.minh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.messenger4j.Messenger;

@SpringBootApplication
public class Demo2Application {
	@Bean
    public Messenger messenger(@Value("${messenger4j.pageAccessToken}") String pageAccessToken,
	 @Value("${messenger4j.appSecret}") final String appSecret,
	 @Value("${messenger4j.verifyToken}") final String verifyToken) {
	        return Messenger.create(pageAccessToken, appSecret, verifyToken);
	    }
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
