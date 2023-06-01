package com.example.movie.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.movie.command.LocalInfo;
import com.example.movie.command.MovieInfoOne;
import com.example.movie.command.MovieList;

@Controller
public class MovieBoxController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/boxOffice/oneday")
	public String getMovie(Model model) {
		/*
		 * MovieList list = restTemplate.getForObject
		 * ("http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230418"
		 * , MovieList.class); model.addAttribute("boxOfficeList", list); return
		 * "movie/boxOffice";
		 */

		// 파라미터의 개수가 많을 때는 UriComponentsBuilder를 사용한다.
		URI uri = UriComponentsBuilder.fromUriString("http://www.kobis.or.kr")
				.path("/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json")
				.queryParam("key", "f5eef3421c602c6cb7ea224104795888").queryParam("targetDt", "20230418").encode()
				.build().toUri(); // 각 요소를 합쳐 uri를 만듦.

		MovieList list = restTemplate.getForObject(uri, MovieList.class);
		model.addAttribute("boxOfficeList", list);

		return "movie/boxOffice";
	}

	@RequestMapping("/boxOffice/movieinfo")
	public String getMovieInfo(Model model, String movieCd) {
		// System.out.println("movieCd:::" + movieCd);

		MovieInfoOne movie = restTemplate.getForObject(
				"http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=f5eef3421c602c6cb7ea224104795888&movieCd="
						+ movieCd,
				MovieInfoOne.class);
		model.addAttribute("movieInfo", movie);

		return "movie/movieInfo";
	}

	@GetMapping("/naverlocal")
	public String form() {
		return "movie/localform";
	}

	@RequestMapping("/navertest")
	public void naver() {
		URI uri = UriComponentsBuilder.fromUriString("https://openapi.naver.com").path("/v1/search/local.json")
				.queryParam("query", "종로구").queryParam("display", "10").queryParam("start", "1")
				.queryParam("sort", "random").encode().build().toUri();
		RequestEntity<Void> req = RequestEntity.get(uri).header("X-Naver-Client-Id", "Zi3o1uQftp59zuIqEAz4")
				.header("X-Naver-Client-Secret", "iy6YKSWpLM").build();

		ResponseEntity<String> response = restTemplate.exchange(req, new ParameterizedTypeReference<>() {
		});
		// HTTP 헤더를 새로 만들 수 있고 어떤 HTTP 메서드도 사용 가능
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeaders());
		System.out.println(response.getBody());

	}

	@PostMapping("/naverlocal")
	public String naver(Model m, @RequestParam(defaultValue = "갈비집") String query) {

		URI uri = UriComponentsBuilder.fromUriString("https://openapi.naver.com").path("/v1/search/local.json")
				.queryParam("query", query).queryParam("display", "10").queryParam("start", "1")
				.queryParam("sort", "random").encode().build().toUri();

		RequestEntity<Void> req = RequestEntity.get(uri).header("X-Naver-Client-Id", "Zi3o1uQftp59zuIqEAz4")
				.header("X-Naver-Client-Secret", "iy6YKSWpLM").build();

		ResponseEntity<LocalInfo> response = restTemplate.exchange(req, LocalInfo.class);
		// HTTP 헤더를 새로 만들 수 있고 어떤 HTTP 메서드도 사용 가능

		System.out.println(response.getStatusCode());
		System.out.println(response.getHeaders());

		m.addAttribute("localInfo", response.getBody());
		m.addAttribute("query", query);

		return "movie/local";

	}

}
