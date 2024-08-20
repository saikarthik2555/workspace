package com.functional_interface;

@FunctionalInterface
public interface Predicate<String>{
	public abstract boolean test(String x);
}