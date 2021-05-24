	package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCheckService;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.adapters.CheckIfRealPersonService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;	
	private CheckIfRealPersonService checkIfRealPersonService;
	private CandidateCheckService candidateCheckService;

	
	@Autowired
	public CandidateManager(CandidateDao candidateDao,CheckIfRealPersonService checkIfRealPersonService,CandidateCheckService candidateCheckService) {
		super();
		this.candidateDao = candidateDao;
		this.checkIfRealPersonService = checkIfRealPersonService;
		this.candidateCheckService = candidateCheckService;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"All Candidates Listed!");
	}

	@Override
	public Result add(Candidate candidate) {
		
		if(!this.checkIfRealPersonService.checkIfReal(candidate)){
			return new ErrorResult("Not a Real Person!");
			}
			else if(!this.candidateCheckService.checkIfMailExist(candidate)) {
				
				return new ErrorResult("Email Already Exist!");
			}
			else if(!this.candidateCheckService.checkIfIdentityExist(candidate)) {
			    	return new ErrorResult("ID Number Already Exist!");
			    	
			}else if(!this.candidateCheckService.checkMailActivation()){
					return new ErrorResult("Unactivated Mail! Please Check Your Mail Box.");
			}
			else {
			this.candidateDao.save(candidate);
			return new SuccessResult(candidate.getFirstName()+" Added!");
		}
		
	}

	

}
