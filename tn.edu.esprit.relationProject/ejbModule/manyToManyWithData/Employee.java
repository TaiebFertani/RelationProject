package manyToManyWithData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Employee
 * 
 */
@Entity
public class Employee implements Serializable {

	private int idEmployee;

	private List<Affectation> affectations;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}

	@Id
	public int getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	@OneToMany(mappedBy = "employee")
	public List<Affectation> getAffectations() {
		return affectations;
	}

	public void setAffectations(List<Affectation> affectations) {
		this.affectations = affectations;
	}

}
