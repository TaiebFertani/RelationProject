package manyToManyWithData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Project
 *
 */
@Entity

public class Project implements Serializable {

	
	private int idProject;
	
	private List<Affectation> affectations;
	private static final long serialVersionUID = 1L;

	public Project() {
		super();
	}   
	@Id    
	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	@OneToMany(mappedBy="project")
	public List<Affectation> getAffectations() {
		return affectations;
	}
	public void setAffectations(List<Affectation> affectations) {
		this.affectations = affectations;
	}
   
}
