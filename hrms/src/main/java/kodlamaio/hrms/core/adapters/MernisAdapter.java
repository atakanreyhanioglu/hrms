package kodlamaio.hrms.core.adapters;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class MernisAdapter implements CheckIfRealPersonService {

	@Override
	public boolean checkIfReal(Candidate candidate) {
		
		if(candidate.getIdentityNumber().length()!=11) {
			return false;

		}
		return true;
	}


}
