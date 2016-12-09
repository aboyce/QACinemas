package qa.persistence.repositories.offline;

import qa.persistence.entities.Film;
import qa.persistence.entities.Viewing;
import qa.persistence.repositories.ViewingRepository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Default
public class ViewingRepositoryOffline implements ViewingRepository {

    @Inject
    private DatabaseOffline db;

    @Override
    public Viewing getViewingById(Integer id) {
        for (Viewing viewing : db.getViewings()) {
            if (viewing.getId().equals(id)) {
                return viewing;
            }
        }
        return null;
    }

    @Override
    public List<Viewing> getViewingsForFilm(Film film) {
        List<Viewing> viewings = new ArrayList<Viewing>();
        for (Viewing viewing : db.getViewings()) {
            if (viewing.getId().equals(film.getId())) {
                viewings.add(viewing);
            }
        }
        return viewings;
    }
}