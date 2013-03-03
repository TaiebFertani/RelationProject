package manyToManyWithData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: K
 *
 */
@Entity

public class K implements Serializable {

	
	private int idK;
	private static final long serialVersionUID = 1L;

	private List<M>ms;
	
	public K() {
		super();
	}   
	@Id    
	public int getIdK() {
		return this.idK;
	}

	public void setIdK(int idK) {
		this.idK = idK;
	}
	@OneToMany(mappedBy="k")
	public List<M> getMs() {
		return ms;
	}
	public void setMs(List<M> ms) {
		this.ms = ms;
	}
   
}
