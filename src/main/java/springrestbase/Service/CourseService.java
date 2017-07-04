package springrestbase.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springrestbase.Entity.Course;
import springrestbase.Entity.Topic;
import springrestbase.Repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valerio on 26/06/2017.
 * tipicamente in Spring un service è un singleton che mette a disposizione dei metodi/servizi ad un controller
 */

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(Integer id){
        List<Course> course = new ArrayList<>();
        courseRepository.findAll().forEach(course::add);
        return course;
    }

    public Course getCourse(Integer id){
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(Integer id) {
        courseRepository.delete(id);
    }
}
