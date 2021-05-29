package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
		
	@ManyToOne()
	@JoinColumn(name = "job_title_id")
	private JobTitle jobTitle;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
	
	@Column(name = "job_description", nullable=false)
	private String jobDescription;
	
	@Column(name = "salary")
	private String minSalary;
	
	@Column(name = "open_positions" , nullable=false)
	private int numberOfOpenPositions;
	
    @Temporal(TemporalType.DATE)
	@Column(name = "application_deadline", nullable=false )
	private Date applicationDeadline;
	
    @Temporal(TemporalType.DATE)
	@Column(name = "creation_date", nullable=false )
	private Date creationDate;
	
	
		
}
