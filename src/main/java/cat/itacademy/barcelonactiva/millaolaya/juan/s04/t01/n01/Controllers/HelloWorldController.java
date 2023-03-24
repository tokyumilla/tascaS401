package cat.itacademy.barcelonactiva.millaolaya.juan.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda (@RequestParam(value ="nom", defaultValue = "UNKNOWN",required = false) String nom){
        return "Hola " + nom + " estàs executant un projecte Maven";
    }

@RequestMapping(value = {"/HelloWorld2","/HelloWorld2/{nom}"}, method = RequestMethod.GET)
    public String saluda2 (@PathVariable(required = false) String nom) {
        if (nom==null) {
            return "Hola, estàs executant un projecte Maven";
        } else {
            return "Hola " + nom + " estàs executant un projecte Maven";
        }

    }




}
