package bo.edu.ucb.demo.Backend.dao;
import bo.edu.ucb.demo.Backend.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
