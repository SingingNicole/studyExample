package board.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.member.dao.RefboardDao;

@Service
public class RefboardService {
	@Autowired
	RefboardDao dao;
}
