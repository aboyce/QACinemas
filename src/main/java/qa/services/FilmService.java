package qa.services;

import qa.persistence.repositories.FilmRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class FilmService {

    @Inject
    private FilmRepository filmRepository;

}
