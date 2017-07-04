package springrestbase.Repository;

import org.springframework.data.repository.CrudRepository;
import springrestbase.Entity.Topic;

/**
 * Created by Valerio on 03/07/2017.
 */

//Il repository è generico ed estende l'interfaccia di CrudRepository,
//specificando la classe di cui si deve creare il Crud e il tipo del suo id

public interface CourseRepository extends CrudRepository<Topic, Integer> {

    // il repository implementa l'interazione tra il service e l'entity
    // per esempio i metodi ottieni tutti e ottieni con id
    // getAllTopic()
    // getTopic(Integer id)
    // updateTopic(Topic t)
    // deleteTopic(Integer id)
    //
    //
    //... in realtà le classiche operazioni CRUD dell'interfacciao CrudRepository


}
