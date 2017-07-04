package springrestbase.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Valerio on 26/06/2017.
 */

/*
* @Entity permette di creare una tabella sulla persistenza (db) avente come colonne
* le variabile di classe, marcate come column e id
* */

@Entity
public class Course {

    @Id
    Integer id;

    @Column
    String name;

    @Column
    String description;


    //il topic è di tipo molti a uno, sarà una chiave esterna, in JPA si dice una manyToOne
    @ManyToOne
    private Topic topic;

    public Course() {
    } //semplice obbligatorio per JPA/Hibernate e vari ORM

    public Course(Integer id, String name, String description, Integer topid_id) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topid_id, "", "");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
