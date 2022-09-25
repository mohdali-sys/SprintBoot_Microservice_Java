package in.nareshit.raghu.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.nareshit.raghu.entity.Employee;

public class Test {

	public static void main(String[] args) {
		EntityTransaction tx = null;
		try {
			//EMF : Loads Driver class, creates DB connection, Statement
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppDB");
			
			//EM : Perform Operations
			EntityManager em = emf.createEntityManager();
			
			//ET : Commit/rollback
			tx = em.getTransaction();
			tx.begin();
			
			//DO SAVE OPERATION
			Employee emp = new Employee();
			emp.setEmpId(101);
			emp.setEmpName("AJAY");
			emp.setEmpSal(200.0);
			
			em.persist(emp); //INSERT INTO...
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
