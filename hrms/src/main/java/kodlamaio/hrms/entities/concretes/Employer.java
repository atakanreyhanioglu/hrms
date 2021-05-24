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
@EqualsAndHashCode(callSuper = false)
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {
	@Column(name="web_adress",nullable=false)
	private String webAdress;
	
	@Column(name="phone_number",nullable=false)
	private String phoneNumber;
	
	@Column(name="company_name",nullable=false)
	private String companyName;
}
