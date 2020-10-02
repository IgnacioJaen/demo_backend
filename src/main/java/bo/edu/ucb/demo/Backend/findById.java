package bo.edu.ucb.demo.Backend;

import org.springframework.jdbc.core.JdbcOperations;

import java.util.List;

public class findById extends Student {
    private JdbcOperations jdbcTemplate;


    public Student findById(int studentId) {
        List result = jdbcTemplate.query("SELECT * FROM student WHERE student_id = 10;",
                new Object[]{}, (resultSet, i) -> {
                    Student student = new Student();
                    student.studentId =  resultSet.getInt(1);
                    student.fullName =  resultSet.getString(2);
                    return student;
                });
        return (Student) result.get(0);
    }
}
