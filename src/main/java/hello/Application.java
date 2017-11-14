package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Esta é a classe principal do nosso serviço
 * Nela o serviço será iniciado
 * A anotação @SpringBootApplication é usada para diversas outras anotações
 * de uma só vez.
 *
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
