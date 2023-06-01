package com.test.song;

public class Song {

	String title;
	String artist;
	int year;
	String counrty;

	Song() {
	}

	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.counrty = country;
	}

	public void show() {
		System.out.println(counrty + ", " + year + "년 " + artist + " [" + title + "]");
	}

	public static void main(String[] args) {
		Song test = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		test.show();
	}

}
