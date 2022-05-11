package ch.bbw.jokebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
public class MainController {

    @Autowired
    private JokeRepository jokeRepository;

    @GetMapping("") // http://localhost:8080
    public String home(Model model) {
        //umwandlung in normale liste
        List<Joke> jokes = StreamSupport.stream(
                jokeRepository
                .findAll()
                .spliterator(), false)
                .collect(Collectors.toList());
        model.addAttribute("jokes", jokes);
        return "index";
    }
}
