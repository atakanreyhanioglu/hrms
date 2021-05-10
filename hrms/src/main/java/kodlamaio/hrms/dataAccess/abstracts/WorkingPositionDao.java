package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.WorkingPosition;

public interface WorkingPositionDao extends JpaRepository<WorkingPosition,Integer>{

}
