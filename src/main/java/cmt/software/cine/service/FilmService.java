package cmt.software.cine.service;
import cmt.software.cine.model.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<Film> findAll();
    Optional<Film> findById(Long id);
}
