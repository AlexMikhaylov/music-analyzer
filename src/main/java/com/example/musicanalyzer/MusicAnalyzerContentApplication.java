package com.example.musicanalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class MusicAnalyzerContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicAnalyzerContentApplication.class, args);
	}

}
