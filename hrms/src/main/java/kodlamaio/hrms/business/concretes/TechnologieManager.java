package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.TechnologieService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.TechnologieDao;
import kodlamaio.hrms.entities.concretes.Technologie;

@Service
public class TechnologieManager implements TechnologieService{

		private TechnologieDao technologieDao;
		@Autowired
	public TechnologieManager(TechnologieDao technologieDao) {
			super();
			this.technologieDao = technologieDao;
		}

	@Override
	public DataResult<List<Technologie>> getAll() {
		return new SuccessDataResult<List<Technologie>>(this.technologieDao.findAll(),"All Technologies Listed!");
	}

	@Override
	public Result add(Technologie technologie) {
		this.technologieDao.save(technologie);
		return new SuccessResult("Technologie Added!");
	}

}
