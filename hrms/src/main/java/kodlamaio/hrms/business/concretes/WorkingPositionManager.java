package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.WorkingPositionService;
import kodlamaio.hrms.dataAccess.abstracts.WorkingPositionDao;
import kodlamaio.hrms.entities.concretes.WorkingPosition;

@Service
public class WorkingPositionManager implements WorkingPositionService {

	private WorkingPositionDao workingPositionDao;

	@Autowired
	public WorkingPositionManager(WorkingPositionDao workingPositionDao) {
		super();
		this.workingPositionDao = workingPositionDao;
	}


	@Override
	public List<WorkingPosition> getAll() {
		return this.workingPositionDao.findAll();
	}
	

}
