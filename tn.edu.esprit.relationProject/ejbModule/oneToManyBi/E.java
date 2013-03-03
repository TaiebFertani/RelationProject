package oneToManyBi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: E
 * 
 */
@Entity
public class E implements Serializable {

	private int idE;
	private static final long serialVersionUID = 1L;

	private F f;

	public E() {
		super();
	}

	@Id
	public int getIdE() {
		return this.idE;
	}

	public void setIdE(int idE) {
		this.idE = idE;
	}

	@ManyToOne
	public F getF() {
		return f;
	}

	public void setF(F f) {
		this.f = f;
	}

}
