package manyToManyWithData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: L
 *
 */
@Entity

public class L implements Serializable {

	
	private int idL;
	private static final long serialVersionUID = 1L;

	private List<M>ms;
	
	public L() {
		super();
	}   
	@Id    
	public int getIdL() {
		return this.idL;
	}

	public void setIdL(int idL) {
		this.idL = idL;
	}
	@OneToMany(mappedBy="l")
	public List<M> getMs() {
		return ms;
	}
	public void setMs(List<M> ms) {
		this.ms = ms;
	}
   
}
