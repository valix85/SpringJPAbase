package springrestbase.Repository;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Valerio on 03/07/2017.
 */
public interface TopicRepository extends CrudRepository {

    // il repository implementa l'interazione tra il service e l'entity
    // per esempio i metodi ottieni tutti e ottieni con id
    // getAllTopic()
    // getTopic(Integer id)
    // updateTopic(Topic t)
    // deleteTopic(Integer id)


}
