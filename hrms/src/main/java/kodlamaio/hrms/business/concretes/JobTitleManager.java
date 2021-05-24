package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleCheckService;
import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService  {

	private JobTitleDao jobTitleDao;
	private JobTitleCheckService jobTitleCheckService;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao,JobTitleCheckService jobTitleCheckService) {
		super();
		this.jobTitleDao = jobTitleDao;
		this.jobTitleCheckService=jobTitleCheckService;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"All JobTitles Listed!");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if(!this.jobTitleCheckService.checkIfTitleExist(jobTitle)) {
			return new ErrorResult("Title Already Exist!");

		}else {
			this.jobTitleDao.save(jobTitle);
			return new SuccessResult(jobTitle.getTitle()+" Added!");
		}
		
	}

	

}
