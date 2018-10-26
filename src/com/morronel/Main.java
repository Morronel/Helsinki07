package com.morronel;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
		PromissoryNote forbersesNote = new PromissoryNote();
		forbersesNote.setLoan("Morronel", 1);
		System.out.println(forbersesNote.howMuchIsTheDebt("Ignat"));
	}
}
