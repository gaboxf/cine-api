package cmt.software.cine.service.implement;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmt.software.cine.service.FilmService;
import cmt.software.cine.repository.FilmRepository;
import cmt.software.cine.model.Film;

@Service
public class FilmServiceBean implements FilmService {
    private static final Logger logger = LoggerFactory.getLogger(FilmServiceBean.class);
    private final transient FilmRepository filmRepository;
    @Autowired
    public FilmServiceBean(final FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    @Override
    public List<Film> findAll() {
        logger.info("> findAll");

        final List<Film> films = filmRepository.findAll();

        logger.info("< findAll");
        return films;
    }

    @Override
    public Optional<Film> findById(final Long id) {
        logger.info("> findById");

        final Optional<Film> optionalFilm = filmRepository.findById(id);
        if(optionalFilm.get().getId() != null) logger.info("--> " + optionalFilm.get().toString());

        logger.info("< findById");
        return optionalFilm;
    }
}
