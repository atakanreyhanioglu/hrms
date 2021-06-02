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
@Table(name="educations")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="education_id",referencedColumnName = "id")
public class Education {
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
	
	@Column(name = "university_name", nullable=false)
	private String universityName;
	
	@Column(name = "major_name", nullable=false)
	private String majorName;
			
	@Temporal(TemporalType.DATE)
	@Column(name = "university_start_date", nullable=false)
	private Date universtyStartDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "university_finish_date")
	private Date universtyFinishDate;
	
}
