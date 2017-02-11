package com.vertebrates;

import com.Animal.AnimalKingdom;

public class Vertebrate extends AnimalKingdom {

	public Vertebrate(int weight, String name, boolean eadable, boolean vegeterian) {
		super(weight, name, eadable, vegeterian, true);
	}

	public Vertebrate() {
		super.name = "anonomys vertabrate";
		super.eadable = true;
		super.vegeterian = false;
		super.vertebrate = true;
	}
	
	public void hunting(Object otherver){
		
	}
}