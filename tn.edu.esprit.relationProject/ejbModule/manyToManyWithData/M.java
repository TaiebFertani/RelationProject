package manyToManyWithData;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: M
 *
 */
@Entity

public class M implements Serializable {

	private MPk mPk;
	private String dataM;
	private static final long serialVersionUID = 1L;

	private K k;
	private L l;
	
	public M() {
		super();
	}   
	public String getDataM() {
		return this.dataM;
	}

	public void setDataM(String dataM) {
		this.dataM = dataM;
	}
	@EmbeddedId
	public MPk getmPk() {
		return mPk;
	}
	public void setmPk(MPk mPk) {
		this.mPk = mPk;
	}
	@ManyToOne
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	@ManyToOne
	public L getL() {
		return l;
	}
	public void setL(L l) {
		this.l = l;
	}
   
}
