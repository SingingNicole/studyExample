package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController // 화면 생성 없이 json 데이터를 client에게 보낼 때 사용한다.
// RestController 어노테이션은 ResponseBody 어노테이션을 포함하고 있으므로 ResponseBody 어노테이션을 생략 가능하다.
public class getDataController {

	@RequestMapping("/jsondata2")
	public String getData() {
		List<String> list = new ArrayList<>();
		list.add("melon");
		list.add("fig");
		list.add("peach");
		list.add("복숭아");

		Gson gson = new Gson();
		return gson.toJson(list);
	}

}
