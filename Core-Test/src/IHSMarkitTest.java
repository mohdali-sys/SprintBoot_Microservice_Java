import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IHSMarkitTest {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"abc");
		Employee e2=new Employee(2,"xyz");
		Employee e3=new Employee(3,"hi");
		Employee e4=new Employee(4,"hello");
		List<Employee> empSet=new ArrayList<>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.stream().sorted(Comparator.comparingLong(Employee::getId).thenComparing(Comparator.comparing(Employee::getName))).collect(Collectors.toList()).forEach(System.out::println); 
		
		empSet.stream().sorted(Comparator.comparing(Employee::getName).reversed());	
		
	//System.out.println(empSet.stream().filter(emp->emp.getId()==9).findFirst().ifPresent(e5-> e5.getName()));	
		
	}

}


final class Employee
{
	private long id;
	private String name;
	private List<String> dept;
	
	
	Employee(long id,String name)
	{ 
		this.name=name;
		this.id=id;
	
	}
	
	
	
	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
