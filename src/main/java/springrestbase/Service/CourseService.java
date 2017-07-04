package springrestbase.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springrestbase.Entity.Topic;
import springrestbase.Repository.TopicRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valerio on 26/06/2017.
 * tipicamente in Spring un service è un singleton che mette a disposizione dei metodi/servizi ad un controller
 */

@Service
public class CourseService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(Integer id){
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Integer id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(Integer id) {
        topicRepository.delete(id);
    }
}
