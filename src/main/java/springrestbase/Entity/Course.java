package springrestbase.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
    Integer     id;

    @Column
    String      name;

    @Column
    String      description;

    public Course() {} //semplice obbligatorio per JPA/Hibernate e vari ORM

    public Course(Integer id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
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
}
