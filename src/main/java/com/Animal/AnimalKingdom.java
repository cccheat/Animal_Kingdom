package com.Animal;

import com.vertebrates.Vertebrate;

public class AnimalKingdom implements Comparable<AnimalKingdom> {

	public AnimalKingdom(int weight, String name, boolean eadable, boolean vegeterian, boolean vertebrate) {
		this.weight = weight;
		this.name = name;
		this.eadable = eadable;
		this.vegeterian = vegeterian;
		this.vertebrate = vertebrate;
	}

	public AnimalKingdom() {
		this.name = "anonomous animal";
	}

	public int weight;
	public String name;
	public boolean eadable, vegeterian, vertebrate;

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * animals eats
	 * 
	 * @param food
	 */
	public void eat(int food) {
		this.weight += food;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vegeterian
	 */
	public boolean isVegeterian() {
		return vegeterian;
	}

	/**
	 * @return the vertebrate
	 */
	public boolean isVertebrate() {
		return vertebrate;
	}

	/**
	 * @param vertebrate
	 *            the vertebrate to set
	 */
	public void setVertebrate(boolean vertebrate) {
		this.vertebrate = vertebrate;
	}

	@Override
	public int compareTo(AnimalKingdom otheranimal) {
		if (this.vertebrate == otheranimal.isVertebrate()) {
			return 0;
		} else if (this.vertebrate == true && otheranimal.isVertebrate() == false) {
			return -1;
		} else {
			return 1;
		}
	}

	public int compareTo(Vertebrate otherver) {
		if (this.weight == otherver.getWeight())
			return 0;
		else if (this.weight < otherver.getWeight())
			return -1;
		else
			return 1;
	}
}