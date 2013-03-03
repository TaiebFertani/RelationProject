package manyToManyWithData;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Affectation
 * 
 */
@Entity
public class Affectation implements Serializable {

	private AffectationPK affectationPk;
	private String role;

	private Employee employee;
	private Project project;
	private static final long serialVersionUID = 1L;

	public Affectation() {
		super();
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@ManyToOne
	@JoinColumn(name = "idEmp", referencedColumnName = "idEmployee", insertable = false, updatable = false)
	public Employee getEmployee() {
		return employee;
	}

	public Affectation(String role, Employee employee, Project project) {
		super();
		this.role = role;
		this.employee = employee;
		this.project = project;
		this.affectationPk=new AffectationPK(employee.getIdEmployee(), project.getIdProject());
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne
	@JoinColumn(name = "idProj", referencedColumnName = "idProject", insertable = false, updatable = false)
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@EmbeddedId
	public AffectationPK getAffectationPk() {
		return affectationPk;
	}

	public void setAffectationPk(AffectationPK affectationPk) {
		this.affectationPk = affectationPk;
	}

}
