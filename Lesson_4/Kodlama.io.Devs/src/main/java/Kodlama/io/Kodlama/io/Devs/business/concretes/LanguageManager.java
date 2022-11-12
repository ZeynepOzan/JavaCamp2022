package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language) throws Exception {
		if (isNameExist(language)) {
			throw new Exception("İsim zaten kayıtlı");
		}
		if (isIdExist(language.getId())) {
			throw new Exception("Id zaten kayıtlı");
		}
	}

	@Override
	public void delete(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Geçersiz id");
		}
		languageRepository.delete(id);
	}

	@Override
	public void update(Language language) throws Exception {
		if (isNameExist(language)) {
			throw new Exception("İsim zaten kayıtlı");
		}
		if (!isIdExist(language.getId())) {
			throw new Exception("Geçersiz Id");
		}
		languageRepository.update(language);
	}

	@Override
	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {

		return null;
	}

	public boolean isNameExist(Language language) {
		for (Language language1 : getAll()) {
			if (language1.getName().equals(language.getName())) {
				return true;
			}
		}
		return false;
	}

	public boolean isIdExist(int id) {
		for (Language language2 : getAll()) {
			if (language2.getId() == id) {
				return true;
			}
		}
		return false;
	}
}
