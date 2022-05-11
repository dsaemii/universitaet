package ch.bbw.jokebook;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity // JPA Java Persistance SQL
@Getter // lombok library
@Setter // lombok library
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String text;

    @OneToMany (mappedBy = "id")
    private Set<Joke> = jokes;
}
