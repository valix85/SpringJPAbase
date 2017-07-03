package springrestbase.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springrestbase.Entity.Topic;
import springrestbase.Repository.TopicRepository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Valerio on 26/06/2017.
 * tipicamente in Spring un service è un singleton che mette a disposizione dei metodi/servizi ad un controller
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1,"APIconf","Turin 15/06/2017"),
            new Topic(2,"NetConference","Milan 23/07/2017"),
            new Topic(3,"RaveParty","Secret place")
    ));

    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        //return all data from instance of topicRepository
        topicRepository
                .findAll()
                .forEach(topics::add);
        return topics;

    }

    public Topic getTopic(Integer id){
        /*
        return topics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .get();
                */
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Integer id, Topic topic) {
        for(int i = 0; i<topics.size();i++){
            Topic t = topics.get(i);
            if (t.getId()==id){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(Integer id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
