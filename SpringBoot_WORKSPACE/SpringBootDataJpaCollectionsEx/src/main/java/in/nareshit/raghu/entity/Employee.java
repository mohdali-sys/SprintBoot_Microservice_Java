package in.nareshit.raghu.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

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
	
	@ElementCollection
	@CollectionTable(
			name="emp_versions", // child table name
			joinColumns = @JoinColumn(name="eid") //FK/Joins column name
			)
	@OrderColumn(name="epos") // index column
	@Column(name="eversion") // element column
	private List<String> versions;
	
	@ElementCollection
	@CollectionTable(
			name="emp_projs",
			joinColumns = @JoinColumn(name="eid")//FK column
			)
	@Column(name="proj")
	private Set<String> projects;
	
	@ElementCollection
	@CollectionTable(
			name="emp_clients",
			joinColumns = @JoinColumn(name="eid")//FK column
			)
	@MapKeyColumn(name="ckey") //Index column
	@Column(name="cname") //element
	private Map<String,String> client;
	
	
	
}
