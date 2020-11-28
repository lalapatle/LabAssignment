package com.cap.ass.lab9;

import java.security.Provider;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Exercise4 {
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise4 uu=new Exercise4();
		Consumer<String> op=uu::setId;
		op.accept("Cap");
		Supplier<String> po=uu::getId;
		System.out.println(po.get());
		
		
		
	}

}
