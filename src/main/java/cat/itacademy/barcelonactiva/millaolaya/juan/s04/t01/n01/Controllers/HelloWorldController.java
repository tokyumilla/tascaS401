package cat.itacademy.barcelonactiva.millaolaya.juan.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda (@RequestParam(value ="nom", defaultValue = "UNKNOWN",required = false) String nom){
        return "Hola" + nom + " estàs executant un projecte Maven";
    }

    public String saluda2 (String nom) {
        return "Hola" + nom + " estàs executant un projecte Maven";
    }


}
