package ncs.test0223;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Actor {
	private String actorName;
	private String movieName1;
	private String movieName2;
	private String movieName3;

	public Actor(String actorName, String movieName1, String movieName2, String movieName3) {
		this.actorName = actorName;
		this.movieName1 = movieName1;
		this.movieName2 = movieName2;
		this.movieName3 = movieName3;
	}

	public String getActorName() {
		return actorName;
	}

	public String getMovieName1() {
		return movieName1;
	}

	public String getMovieName2() {
		return movieName2;
	}

	public String getMovieName3() {
		return movieName3;
	}

	public String[] movieList = { getMovieName1(), getMovieName2(), getMovieName3() };

	public void print() {
		System.out.println("[" + getActorName() + "]");
		for (String m : movieList) {
			System.out.println(m);
		}

	}

}

public class MovieTest {

	public static void main(String[] args) {
		Actor actorSong = new Actor("송강호", "기생충", "괴물", "관상");
		Actor actorKim = new Actor("김수현", "도둑들", "수상한 그녀", "은밀하게 위대하게");
		Actor actorLee = new Actor("이병헌", "지아이조", "레드", "광해");

		List<Actor> actorList = new ArrayList();
		actorList.add(actorSong);
		actorList.add(actorKim);
		actorList.add(actorLee);

		System.out.print("검색할 배우: ");
		Scanner sc = new Scanner(System.in);
		String target = sc.next();

		actorList.stream().filter(a -> a.getActorName().equals(target)).forEach(a -> a.print());

	}

}
