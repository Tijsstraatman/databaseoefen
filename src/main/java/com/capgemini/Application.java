package com.capgemini;


import com.capgemini.model.Truck;
import com.capgemini.repositorys.RepositoryTrucks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);

    }




    @Bean
    public CommandLineRunner demo(RepositoryTrucks repository) {
        return (args) -> {


            // save a couple of trucks
            repository.save(new Truck("Mercedes",100000));
            repository.save(new Truck("Chloe", 200000));
            repository.save(new Truck("Daf", 3000000));
            repository.save(new Truck("Iveco", 2000000));
            repository.save(new Truck("MAN", 200000));

            // fetch all trucks
            log.info("Trucks found with findAll():");
            log.info("-------------------------------");
            for (Truck truck : repository.findAll()) {
                log.info(truck.toString());
            }
            log.info("");

            // fetch an individual truck by ID
            Truck truck = repository.findOne(1L);
            log.info("Truck found with findOne(1L):");
            log.info("--------------------------------");
            log.info(truck.toString());
            log.info("");

            // fetch trucks by brand
            log.info("Trucks found with brand ('Daf'):");
            log.info("--------------------------------------------");
            for (Truck daf : repository.findByBrand("Daf")) {
                log.info(daf.toString());
            }
            log.info("");
        };

    }

    }

