package RETO2_CICLO4;

import RETO2_CICLO4.repositorio.CrudRepository.FootwearCrudRepository;
import RETO2_CICLO4.repositorio.CrudRepository.OrderCrudRepository;
import RETO2_CICLO4.repositorio.CrudRepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


@SpringBootApplication

public class Reto2Application implements CommandLineRunner {

    @Autowired
    private FootwearCrudRepository footRepo;
    @Autowired
    private UserCrudRepository userRepo;
    @Autowired
    private OrderCrudRepository orderRepo;

    public static void main(String[] args) {
        SpringApplication.run(Reto2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        footRepo.deleteAll();
        userRepo.deleteAll();
        orderRepo.deleteAll();
    }
}
