package kodlamaio.hrms.entities.concretes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="work_experiences")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="work_experience_id",referencedColumnName = "id")
public class WorkExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@JoinColumn(name = "resume_id", insertable = false, updatable = false)
	@ManyToOne(targetEntity = Resume.class, fetch = FetchType.EAGER)
	@JsonIgnore
	private Resume resume;
	
	@Column(name = "resume_id")
	private int resumeId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "work_position")
	private String workPosition;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date startDate ;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "finish_date", nullable=true)
	private Date finishDate ;

	
	
	
}
