package day0403.el;

import java.util.HashMap;
import java.util.Map;

public class Thermometer {

	private Map<String, Double> locationCelsiusMap = 
			new HashMap<String, Double>(); // 도시의 온도와 이름을 짝지어 저장할 수 있도록 HashMap 객체 생성

	public void setCelsius(String location, Double value) {
		locationCelsiusMap.put(location, value);
	} // 도시의 이름과 섭씨온도 저장/리턴값 없음(void)

	public Double getCelsius(String location) {
		return locationCelsiusMap.get(location);
	} // 해당 도시의 섭씨온도 반환

	public Double getFahrenheit(String location) {
		Double celsius = getCelsius(location);
		if (celsius == null) {
			return null; // 온도 정보가 없으면 null 반환
		}
		return celsius.doubleValue() * 1.8 + 32.0; // 화씨온도 변환 메서드
	}

	public String getInfo() {
		return "온도계 변환기 1.1";
	}

}
