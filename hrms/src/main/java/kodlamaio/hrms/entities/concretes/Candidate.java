package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name="candidates")
@AllArgsConstructor
@NoArgsConstructor
public class Candidate extends User{
		
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="identity_number",nullable=false)
	private String identityNumber;
	
	@Column(name="birth_year",nullable=false)
	private int birthYear;

	
	
}
