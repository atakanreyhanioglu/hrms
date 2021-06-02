package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.WorkExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkExperienceDao;
import kodlamaio.hrms.entities.concretes.WorkExperience;

@Service
public class WorkExperienceManager implements WorkExperienceService{
		
	
	private WorkExperienceDao workingExperienceDao;
	
	@Autowired
	public WorkExperienceManager(WorkExperienceDao workingExperienceDao) {
		super();
		this.workingExperienceDao = workingExperienceDao;
	}

	@Override
	public DataResult<List<WorkExperience>> getAll() {
		return new SuccessDataResult<List<WorkExperience>>(this.workingExperienceDao.findAll(),"All Work Experiences Listed!");
	}

	@Override
	public Result add(WorkExperience workExperience) {
		this.workingExperienceDao.save(workExperience);
		return new SuccessResult("Work Experience added!");
	}

}
