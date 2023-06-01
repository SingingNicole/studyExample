package day0215.lang;

public class StringEx12 {

	public static void main(String[] args) {
		String str = "abcdefg/hijklmn/opqrstu/vwxyz";
		
		String[] arr = str.split("/");
		for(String s : arr) {
			System.out.println(s.substring(0,1).toUpperCase() + s.substring(1));
		}

//		예상 결과
//		Abcdefg
//		Hijklmn
//		Opqrstu
//		Vwxyz

	}

}
