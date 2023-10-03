package cmt.software.cine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cmt.software.cine.model.Film;
import cmt.software.cine.service.FilmService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api" + "/films")
public class FilmController {
    private static final Logger logger = LoggerFactory.getLogger(FilmController.class);
    @Autowired
    private transient FilmService filmService;

    @GetMapping
    public List<Film> getFilms() {
        logger.info("> getFilms");

        final List<Film> films = filmService.findAll();

        logger.info("< getFilms");
        return films;
    }

    @GetMapping("/{id}")
    public Film getFilmsById(@PathVariable Long id) {
        logger.info("> getFilmsById");

        final Optional<Film> films = filmService.findById(id);

        logger.info("< getFilmsById");
        return films.get();
    }
}
