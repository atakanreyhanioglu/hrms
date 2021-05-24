package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerCheckService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	private EmployerCheckService employerCheckService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao,EmployerCheckService employerCheckService) {
		super();
		this.employerDao=employerDao;
		this.employerCheckService = employerCheckService;
	}
	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"All Employers Listed!");
		
	}
	@Override
	public Result add(Employer employer) {
		if(!this.employerCheckService.checkIfMailExist(employer)) {
			
			return new ErrorResult("Email Already Exist!");
			
			}else if(!this.employerCheckService.checkMailActivation()) {
				return new ErrorResult("Unactivated Mail! Please Check Your Mail Box.");
				
			}else if(!this.employerCheckService.checkRegisterActivationByEmployee()) {
				return new ErrorResult("Unactivated Register Please Wait For Validation.");

			}else if(!this.employerCheckService.checkIfMailDomain(employer)) {
				return new ErrorResult("Mail Required With Web Adress Domain.");

			}
			else {
			this.employerDao.save(employer);
			return new SuccessResult(employer.getCompanyName()+" Added!");
		}
		
		
	}
	

}
