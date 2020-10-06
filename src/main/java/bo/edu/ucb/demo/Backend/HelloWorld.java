package bo.edu.ucb.demo.Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * http://localhost:8080/mi_ruta/
 *
 * http://localhost:8080/mi_ruta/dos
 * HOLA MUNDO
 * Esta clase no tiene HighCohesion, porque mezcla lógica de presetación API con Acceso a Datos.
 * Esta clase no tiene Loose Coupling. Por ende esta fuertemente acoplada.
 *
 */

@RestController
@RequestMapping("/mi_ruta")
public class HelloWorld {

    Student student= new Student();

    String a= "Hola mundo";
    String b= "Dos Hola mundo";
    int n=20;
    String m=student.findById(n).toString();


    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        return a;
    }

    @RequestMapping(value = "/dos", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloTwo() {
        return b;
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String findStudent() {
        return m;
    }




}
