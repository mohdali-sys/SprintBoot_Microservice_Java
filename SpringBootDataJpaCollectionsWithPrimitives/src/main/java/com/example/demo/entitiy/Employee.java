package com.example.demo.entitiy;

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
	@CollectionTable(name="emp_verions", //table name 
	joinColumns = @JoinColumn(name="eid") //FK 
			)
	@OrderColumn(name="pos") //index column
	@Column(name="version") // element column
	private List<String> version;
	
	@ElementCollection
	@CollectionTable(
			name="emp_projs", //child table name
			joinColumns = @JoinColumn(name="eid")//FK column name
			)
	@Column(name="proj") // element column
	private Set<String> projects;
	
	@ElementCollection
	@CollectionTable(name="emp_clients",
	joinColumns = @JoinColumn(name="eid"))
	@MapKeyColumn(name="ckey")
	@Column(name="cname")
	private Map<String,String> client;
	
	
}
