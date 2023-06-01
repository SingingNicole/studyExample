package com.example.service;

import org.springframework.stereotype.Service;

import com.example.command.SearchCommand;

@Service
public class SearchService {
	public SearchResult search(SearchCommand command) {
		// db 연동:
		// select * from 테이블 where type=command.type&content=command.query
		return new SearchResult();
	}
}
