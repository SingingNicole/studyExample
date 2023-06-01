package board.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import board.member.dto.CommDto;

@Mapper
public interface CommDao {
	
	List<CommDto> selectComm(int no);
	
	int insertComm(CommDto dto);
	
	int deleteComm(int cno);

}
