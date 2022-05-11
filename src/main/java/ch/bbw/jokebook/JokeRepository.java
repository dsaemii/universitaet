package ch.bbw.jokebook;

import org.springframework.data.repository.CrudRepository; // CRUD - create, read, update, delete
import org.springframework.stereotype.Repository;

@Repository
public interface JokeRepository extends CrudRepository<Joke, Long> {

}
