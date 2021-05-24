package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateCheckService {
		boolean checkIfMailExist(Candidate candidate);
		boolean checkIfIdentityExist(Candidate candidate);
		boolean checkMailActivation();
		DataResult<List<Candidate>> findByEmailIs(String email);
		DataResult<List<Candidate>> findByIdentityNumberIs(String identityNumber);
		
}
