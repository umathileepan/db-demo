package com.thinkconstructive.dbdemo;

import com.thinkconstructive.dbdemo.entity.StoreInformation;
import com.thinkconstructive.dbdemo.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner {

	@Autowired
	StoreInformationRepository storeInformationRepository;
	public static void main(String[] args) {

		SpringApplication.run(DbDemoApplication.class, args);
	}

	@Override
	public void run(String... args){
		StoreInformation storeInformationOne = new StoreInformation("Amazon","All types of goods available","23232323");
		storeInformationRepository.save(storeInformationOne);
		storeInformationRepository.findByStoreName("Amazon").forEach(val -> System.out.println(val));
	}

}
