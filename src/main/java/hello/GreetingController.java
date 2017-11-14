package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    /**
     * Esta é a classe de controle(Controller)
     */

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();//É um contador que se incrementa sempre que for requisitado o serviço


    /**
     * Método criado para poder fazer requisições ao serviço
     * @RequestMapping é uma anotação usada para garantir que a
     * requisição HTTP seja mapeada para este método.
     *
     * Poderá então ser feita requisições do tipo GET vs PUT, POST
     * Por exemplo se for feito um GET será mapeado da seguinte forma
     * @RequestMapping(method=GET)
     *
     * @RequestParam liga o valor name ao parametro name do método greeting
     * essa string é um parametro opcional e caso não seja especificada será
     * usado o valor padrão "World".
     **/


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name){

        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
