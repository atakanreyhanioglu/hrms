package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.WorkExperience;

public interface WorkExperienceService {
	DataResult<List<WorkExperience>> getAll();
	Result add(WorkExperience workExperience);
}
