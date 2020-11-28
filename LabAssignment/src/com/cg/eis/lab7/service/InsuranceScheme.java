package com.cg.eis.lab7.service;

public enum InsuranceScheme {
	SCHEME_A("Scheme A"),
	SCHEME_B("Scheme B"),
	SCHEME_C("Scheme C"),
	NO_SCHEME("No Scheme");
	
	private String scheme;
	
	private InsuranceScheme(String scheme) {
		this.scheme=scheme;
	}

	public String getScheme() {
		return scheme;
	}
	
	
	
}
