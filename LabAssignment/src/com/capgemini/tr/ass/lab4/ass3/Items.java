package com.capgemini.tr.ass.lab4.ass3;

public abstract class Items {
	private Integer uin;
	private String title;
	private Integer noc;
	static private Integer counter;
	static {
		counter=1;
	}
	public Items()
	{
	counter++;	
	}
	public Items( String title, Integer noc) {
		super();
		this.uin = counter;
		this.title = title;
		this.noc = noc;
	}
	@Override
	public String toString() {
		return "Items [uin=" + uin + ", title=" + title + ", noc=" + noc + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((noc == null) ? 0 : noc.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((uin == null) ? 0 : uin.hashCode());
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
		Items other = (Items) obj;
		if (noc == null) {
			if (other.noc != null)
				return false;
		} else if (!noc.equals(other.noc))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uin == null) {
			if (other.uin != null)
				return false;
		} else if (!uin.equals(other.uin))
			return false;
		return true;
	}
	public Integer getUin() {
		return uin;
	}
	public void setUin(Integer uin) {
		this.uin = uin;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getNoc() {
		return noc;
	}
	public void setNoc(Integer noc) {
		this.noc = noc;
	}
	public void checkIn() {
		noc = noc + 1;
	}
	
	public void checkOut() {
		noc = noc - 1;
	}
	

	public void addItem(int idNum, String str, int n) {
		setUin(idNum);
		setTitle(str);
		setNoc(n);
	}
	
	
	
	
	
	

}
