/*******************************************************************************
 * Copyright (c) 2014-2016 Radon Rosborough. All rights reserved.
 *******************************************************************************/
package util;



public final class Enumerate<T> extends Pair<Integer, T> {
	
	public Enumerate(int index, T object) {
		super(index, object, false);
	}
	
	public int getIndex() {
		return getFirst();
	}
	public T getObject() {
		return getSecond();
	}
	
}
