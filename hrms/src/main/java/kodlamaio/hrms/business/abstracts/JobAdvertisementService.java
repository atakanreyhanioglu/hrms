package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();
	Result add(JobAdvertisement jobAdvertisement);
	Result delete(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
	DataResult<List<JobAdvertisement>> getByEmployer_EmployerId(int employerId);

}
