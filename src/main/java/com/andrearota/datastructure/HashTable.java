package com.andrearota.datastructure;

public interface HashTable {

	public void put(int k, String v);

	public String get(int k);

	public int size();

	boolean delete(int k);

}
