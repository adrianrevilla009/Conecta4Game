package org.example.refactoring.movies.v14;

public class ChildrenPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

}
