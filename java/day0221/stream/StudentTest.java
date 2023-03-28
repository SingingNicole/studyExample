package day0221.stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

class Student3 {
	String name;
	boolean isMale; // 성별
	int hak; // 학년
	int ban; // 반
	int score;

	Student3(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	String getName() {
		return name;
	}

	boolean isMale() {
		return isMale;
	}

	int getHak() {
		return hak;
	}

	int getBan() {
		return ban;
	}

	int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ? "남" : "여", hak, ban, score);
	}

	enum Level {
		HIGH, MID, LOW
	}

}

public class StudentTest {

	public static void main(String[] args) {
		Student3[] stuArr = { new Student3("나자바", true, 1, 1, 300), new Student3("김지미", false, 1, 1, 250),
				new Student3("김자바", true, 1, 1, 200), new Student3("이지미", false, 1, 2, 150),
				new Student3("남자바", true, 1, 2, 100), new Student3("안지미", false, 1, 2, 50),
				new Student3("황지미", false, 1, 3, 100), new Student3("강지미", false, 1, 3, 150),
				new Student3("이자바", true, 1, 3, 200), new Student3("나자바", true, 2, 1, 300),
				new Student3("김지미", false, 2, 1, 250), new Student3("김자바", true, 2, 1, 200),
				new Student3("이지미", false, 2, 2, 150), new Student3("남자바", true, 2, 2, 100),
				new Student3("안지미", false, 2, 2, 50), new Student3("황지미", false, 2, 3, 100),
				new Student3("강지미", false, 2, 3, 150), new Student3("이자바", true, 2, 3, 200) }; // 배열을 String화

		System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
		Map<Integer, List<Student3>> stuByBan = Stream.of(stuArr).collect(groupingBy(Student3::getBan));
		// 그룹의 기준을 반의 값으로 삼아 추출 -> 학년에 상관 없이 같은 반인 학생을 같은 반으로 묶음
		// groupingBy한 값을 collect로 collection 처리

		for (Integer k : stuByBan.keySet()) {
			System.out.println(k + "반");
		} // Integer 타입으로 컬렉팅, Key - Value로 정리

		for (List<Student3> ban : stuByBan.values()) {
			for (Student3 s : ban) {
				System.out.println(s);
			}
		} // 리스트 인덱스에서 각 반에 있는 멤버들을 뽑아 출력

		System.out.printf("%n2. 단순그룹화(성적별로 그룹화)%n");
		Map<Student3.Level, List<Student3>> stuByLevel = Stream.of(stuArr).collect(groupingBy(s -> {
			if (s.getScore() >= 200)
				return Student3.Level.HIGH;
			else if (s.getScore() >= 100)
				return Student3.Level.MID;
			else
				return Student3.Level.LOW;
		})); // 성적에 따라 HIGH, MID, LOW 리턴

		TreeSet<Student3.Level> keySet = new TreeSet<>(stuByLevel.keySet()); // 중복 고려 정렬

		for (Student3.Level key : keySet) {
			System.out.println("[" + key + "]");

			for (Student3 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		} // HIGH / MID / LOW를 리턴하는 객체들을 순서대로 출력

		System.out.printf("3. 단순그룹화 + 통계(성적별 학생수)%n");
		Map<Student3.Level, Long> stuCntByLevel = Stream.of(stuArr).collect(groupingBy(s -> {
			if (s.getScore() >= 200)
				return Student3.Level.HIGH;
			else if (s.getScore() >= 100)
				return Student3.Level.MID;
			else
				return Student3.Level.LOW;
		}, counting())); // counting = 요소의 개수
		for (Student3.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
		System.out.println(); // 해당 키에 맞는 학생들을 정렬
		/*
		 * for(List<Student3> level : stuByLevel.values()) { System.out.println();
		 * for(Student3 s : level) { System.out.println(s); } }
		 */
		System.out.printf("%n4. 다중그룹화(학년별, 반별)");
		Map<Integer, Map<Integer, List<Student3>>> stuByHakAndBan = Stream.of(stuArr)
				.collect(groupingBy(Student3::getHak, groupingBy(Student3::getBan))); // 학년 기준으로 먼저 정렬, 이후 반을 기준으로 정렬

		for (Map<Integer, List<Student3>> hak : stuByHakAndBan.values()) { // 학년과 반으로 묶인 리스트의 value
			for (List<Student3> ban : hak.values()) { // 학년이 가장 먼저 기준이 된다.
				System.out.println();
				for (Student3 s : ban) // 이후 반으로 다시 정렬한다.
					System.out.println(s);
			} // 1학년 1반, 2반, 3반/ 2학년 ...
		}

		System.out.printf("%n5. 다중그룹화 + 통계(학년별, 반별 1등)%n");
		Map<Integer, Map<Integer, Student3>> topStuByHakAndBan = Stream.of(stuArr)
				.collect(groupingBy(Student3::getHak, groupingBy(Student3::getBan,
						collectingAndThen(maxBy(comparingInt(Student3::getScore)), Optional::get))));

		for (Map<Integer, Student3> ban : topStuByHakAndBan.values())
			for (Student3 s : ban.values())
				System.out.println(s);

		System.out.printf("%n6. 다중그룹화 + 통계(학년별, 반별 성적그룹)%n");
		Map<String, Set<Student3.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(groupingBy(s -> s.getHak() + "-" + s.getBan(), mapping(s -> { // 학년과 반을 하나의 문자열로 묶었다
					if (s.getScore() >= 200)
						return Student3.Level.HIGH;
					else if (s.getScore() >= 100)
						return Student3.Level.MID;
					else
						return Student3.Level.LOW;
				}, toSet()))); // 성적의 기준 설정, HIGH/MID/LOW enum Level값 리턴
		// toSet(): 중복값 제거, 각 반이 가지고 있는 값 key mapping

		Set<String> keySet2 = stuByScoreGroup.keySet();

		for (String key : keySet2) {
			System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
		} // 각 반이 어떤 enume Level value를 가지고 있는지 출력할 수 있다.
	}

}