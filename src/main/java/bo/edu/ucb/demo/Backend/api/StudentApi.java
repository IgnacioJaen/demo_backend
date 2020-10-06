package bo.edu.ucb.demo.Backend.api;

import bo.edu.ucb.demo.Backend.Student;
import bo.edu.ucb.demo.Backend.bl.AgendaBl;
import bo.edu.ucb.demo.Backend.bl.StudentBI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1/student")
public class StudentApi {
    private StudentBI studentBl;

    @Autowired
    public StudentApi(AgendaBl agendaBl) {
        this.studentBl = studentBl;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student create(@RequestBody Student student) {
        return studentBl.createStudent(student);
    }

}
