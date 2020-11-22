package com.capgemini.tr.ass.lab4.ass3;

public class MediaItem extends Items{
	

	private Integer runtime;
	public MediaItem(String title, int noc, int runtime) {
		// TODO Auto-generated constructor stub
		super(title,noc);
		this.runtime=runtime;
	}
	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	@Override
	public String toString() {
		
		return "MediaItem [runtime=" + runtime + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getUin()=" + getUin() + ", getTitle()=" + getTitle() + ", getNoc()=" + getNoc() + ", getClass()="
				+ getClass() + "]";
	}
	
	
	

}
