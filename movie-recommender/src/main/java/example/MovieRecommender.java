package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
	private MovieCatalog movieCatalog;
	private CustomerPreferenceDao customerPreferenceDao;
	
	@Autowired
	public void prepare(@Qualifier("main") MovieCatalog movieCatalog, CustomerPreferenceDao customerPreferenceDao) {
		this.movieCatalog = movieCatalog;
		this.customerPreferenceDao = customerPreferenceDao;
	}
	
	public void recommendMovies() {
		movieCatalog.listMovies();
		customerPreferenceDao.showPreferences();
	}
}
