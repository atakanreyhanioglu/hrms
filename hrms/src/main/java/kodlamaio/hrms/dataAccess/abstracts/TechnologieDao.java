package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Technologie;

public interface TechnologieDao extends JpaRepository<Technologie, Integer>{

}
