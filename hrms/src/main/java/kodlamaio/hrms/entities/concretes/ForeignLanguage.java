package kodlamaio.hrms.entities.concretes;


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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="foreign_languages")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="foreign_languages_id",referencedColumnName = "id")
public class ForeignLanguage {
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
	
	@Column(name = "language_name")
	private String languageName;
	
	@Max(5)
	@Min(1)
	@Column(name = "language_level")
	private int languageLevel;
}
