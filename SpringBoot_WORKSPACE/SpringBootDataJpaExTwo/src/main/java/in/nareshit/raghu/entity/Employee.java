package in.nareshit.raghu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="edob")
	private Date dob; //Date only
	
	@Temporal(TemporalType.TIME)
	@Column(name="eslot")
	private Date slotTime; // Time only
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ejoindte")
	private Date joinDateTime; // Both Date and Time
	
	@Lob
	@Column(name="eimg")
	private byte[] empImg;

	@Lob
	@Column(name="edesc")
	private char[] empDesc;
		
}
