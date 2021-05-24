package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitle;
public interface JobTitleCheckService {
	boolean checkIfTitleExist(JobTitle jobTitle);
	DataResult<List<JobTitle>> findByTitleIs(String title);


}
