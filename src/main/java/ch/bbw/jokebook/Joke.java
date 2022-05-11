package ch.bbw.jokebook;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity // JPA Java Persistance SQL
@Getter // lombok library
@Setter // lombok library
public class Joke { //tabellename = klassenname - gleich bei feldern
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String text;
    private int rating;
    private Date date;
}
