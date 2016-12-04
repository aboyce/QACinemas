package qa.persistence.repositories.offline;

import qa.persistence.entities.Film;
import qa.persistence.repositories.FilmRepository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.List;

@Stateless
@Default
public class FilmRepositoryOffline implements FilmRepository {

    @Inject
    private DatabaseOffline db;

    @Override
    public Film getFilmById(Integer id) {
        for (Film film : db.getFilms()) {
            if(film.getId().equals(id)){
                return film;
            }
        }
        return null;
    }

    @Override
    public List<Film> getFilms() {
        return db.getFilms();
    }
}
