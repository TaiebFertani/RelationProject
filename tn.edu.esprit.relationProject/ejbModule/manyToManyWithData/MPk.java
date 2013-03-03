package manyToManyWithData;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idK;
	private int idL;

	public MPk() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idK;
		result = prime * result + idL;
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
		MPk other = (MPk) obj;
		if (idK != other.idK)
			return false;
		if (idL != other.idL)
			return false;
		return true;
	}

	public MPk(int idK, int idL) {
		super();
		this.idK = idK;
		this.idL = idL;
	}

}
