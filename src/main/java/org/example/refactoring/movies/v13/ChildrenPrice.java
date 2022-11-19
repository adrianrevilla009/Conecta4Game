package org.example.refactoring.movies.v13;

public class ChildrenPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

}
