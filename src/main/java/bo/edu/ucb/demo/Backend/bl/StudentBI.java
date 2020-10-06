package bo.edu.ucb.demo.Backend.bl;


import bo.edu.ucb.demo.Backend.Student;
import bo.edu.ucb.demo.Backend.dao.StudentRepository;
import bo.edu.ucb.demo.Backend.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

public class StudentBI {

    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        Student result = this.studentRepository.save(student);
        return result;
    }

    public Student findStudent(Integer studentId) {
        Optional<Student> result = this.studentRepository.findById(studentId);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("No existe el estudiante " + studentId);
        }
    }

    public void deleteStudent(Student student) {
        this.studentRepository.delete(student);
    }

}
