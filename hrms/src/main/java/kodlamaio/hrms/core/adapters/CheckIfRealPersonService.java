package kodlamaio.hrms.core.adapters;

import kodlamaio.hrms.entities.concretes.Candidate;


public interface CheckIfRealPersonService {
	 boolean checkIfReal(Candidate candidate);
}
