

package com.example.springbootlearn.service;

        import com.example.springbootlearn.mapper.StudentMapper;
        import com.example.springbootlearn.pojo.Student;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

/**
 */
@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student getStudent(Integer id) {
        return studentMapper.findById(id);
    }
}
