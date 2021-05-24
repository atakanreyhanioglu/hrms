package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerCheckService {
boolean checkIfMailExist (Employer employer);
boolean checkMailActivation();
boolean checkRegisterActivationByEmployee();
DataResult<List<Employer>> findByEmailIs(String email);
boolean checkIfMailDomain(Employer employer);


}
