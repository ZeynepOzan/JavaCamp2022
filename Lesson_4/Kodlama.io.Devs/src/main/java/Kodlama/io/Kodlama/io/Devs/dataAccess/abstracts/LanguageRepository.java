package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	void add(Language language);

	void delete(int id);

	void update(Language language);

	List<Language> getAll();

	Language getById(int id);

}
