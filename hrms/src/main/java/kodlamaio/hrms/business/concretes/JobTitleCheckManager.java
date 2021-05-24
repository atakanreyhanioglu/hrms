package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleCheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleCheckManager implements JobTitleCheckService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleCheckManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	@Override
	public DataResult<List<JobTitle>> findByTitleIs(String title) {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findByTitleIs(title));	
	}
	@Override
	public boolean checkIfTitleExist(JobTitle jobTitle) {
		if(this.findByTitleIs(jobTitle.getTitle()).getData().size()!=0) {
			return false;

		}else {
			return true;
		}
	}

}
