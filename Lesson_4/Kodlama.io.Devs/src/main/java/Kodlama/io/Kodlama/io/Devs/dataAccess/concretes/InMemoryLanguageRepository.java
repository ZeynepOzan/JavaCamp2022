package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();

		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
		languages.add(new Language(4, "JavaScript"));
		languages.add(new Language(5, "Sql"));
	}

	@Override
	public void add(Language language) {
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		languages.remove(getById(id));
	}

	@Override
	public void update(Language language) {
		Language language1 = getById(language.getId());
		language1.setName(language.getName());
	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		return null;
	}

}
