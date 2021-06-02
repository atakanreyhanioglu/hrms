package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ForeignLanguageDao;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {

	private  ForeignLanguageDao  foreignLanguage;
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguage) {
		super();
		this.foreignLanguage = foreignLanguage;
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {
		return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguage.findAll(),"Foreign Languages Listed!");
	}

	@Override
	public Result add(ForeignLanguage foreignLanguage) {
		this.foreignLanguage.save(foreignLanguage);
		return new SuccessResult("Foreign Language Added!");
	}

}
