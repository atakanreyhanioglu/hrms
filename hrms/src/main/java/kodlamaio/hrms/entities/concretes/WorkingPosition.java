package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="working_positions")
@Data
public class WorkingPosition {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;
	
}
