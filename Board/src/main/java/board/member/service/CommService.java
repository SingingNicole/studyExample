package board.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.member.dao.CommDao;
import board.member.dto.CommDto;

@Service
public class CommService {
	@Autowired
	CommDao dao;
	
	public List<CommDto> selectComm(int no) {
		return dao.selectComm(no);
	}
	
	public int insertComm(CommDto dto) {
		return dao.insertComm(dto);
	}
	
	public int deleteComm(int cno) {
		return dao.deleteComm(cno);
	}

}
