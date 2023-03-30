<%@ page contentType="application/json; charset=UTF-8" %>
<%@ page import="java.util.*, com.google.gson.Gson" %>

<% 
	List<String> list1 = new ArrayList<>();
	list1.add("apple");
	list1.add("banana");
	list1.add("calamansi");
	
	List<String> list2 = new ArrayList<>();
	list2.add("durian");
	list2.add("eggplant");
	list2.add("fig");
	
	List<List<String>> list3 = new ArrayList<>();
	list3.add(list1);
	list3.add(list2);
	
	// javaObject - JSON으로 변경
	Gson gson = new Gson();
	String json = gson.toJson(list3); // list이기 때문에 배열로 저장
	
	out.print(json); // 현재 문서에 json 데이터 출력
%>