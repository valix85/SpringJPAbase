package springrestbase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springrestbase.Entity.Course;
import springrestbase.Entity.Topic;
import springrestbase.Service.CourseService;

import java.util.List;

/**
 * Created by Valerio on 26/06/2017.
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable Integer id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topic_id}/courses/{id}")
    public Course getCourse(@PathVariable Integer topic_id,@PathVariable Integer id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics/{topic_id}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable Integer topic_id){
        course.setTopic(new Topic(topic_id, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{topic_id}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable Integer id, @PathVariable Integer topic_id){
        course.setTopic(new Topic(topic_id, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{topic_id}/courses/{id}")
    public void deletetopic(@PathVariable Integer id){
        courseService.deleteCourse(id);
    }

}
