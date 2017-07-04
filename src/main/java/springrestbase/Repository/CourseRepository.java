package springrestbase.Repository;

import org.springframework.data.repository.CrudRepository;
import springrestbase.Entity.Course;

/**
 * Created by Valerio on 03/07/2017.
 */

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
