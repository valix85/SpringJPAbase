package springrestbase.Repository;

import org.springframework.data.repository.CrudRepository;
import springrestbase.Entity.Course;

import java.util.List;

/**
 * Created by Valerio on 03/07/2017.
 */

public interface CourseRepository extends CrudRepository<Course, Integer> {

    //è possibile creare dichiarare dei metodi che inizino per findBy<NomeDellaProprietàJPA>
    //e spring automaticmanete implementerà il metodo per noi, dobbiamo solo dichiararlo
    //si creano dei filtri molto velocemente, sono come delle select con la where
    //Stessa cosa anche per il get

    public List<Course> getCoursesByTopic(Integer id);
    public List<Course> findByTopic(Integer topic);
    public List<Course> findByTopicId(Integer topic);




}
