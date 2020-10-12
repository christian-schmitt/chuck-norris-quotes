package guru.springframework.chucknorrisquotes.controllers;

import guru.springframework.chucknorrisquotes.services.ChuckNorrisJokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cs on 12.10.20.
 */
@Controller
public class JokeController {

    private final ChuckNorrisJokesService chuckNorrisJokesService;

    public JokeController(ChuckNorrisJokesService chuckNorrisJokesService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", chuckNorrisJokesService.getJoke());
        return "joke";
    }
}
