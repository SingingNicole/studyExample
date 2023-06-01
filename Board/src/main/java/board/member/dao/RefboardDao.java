package board.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import board.member.dto.RefboardDto;

@Mapper
public interface RefboardDao {
	@Insert("insert into refboard(id, subject, content, ref, re_step, re_revel)"
			+ " values(#{id}, #{subject}, #{content} #{ref}, #{re_step}, #{re_level})")
	@Options(useGeneratedKeys = true, keyProperty = "no")
	int insert(RefboardDto dto);
	
	@Update("update refboard set ref = #{no} where no = #{no}")	// where 절 추가로 제목글일때만 적용
	int updateRef(int no);
	
	@Update("update refboard set re_step = re_step + 1"
			+ " where ref = #{ref} and re_step > #{re_step}")
	int updateStep(RefboardDto dto);
	
	@Select("select count(*) from refboard")
	int count();
	
	@Select("select * from refboard"
			+ " ordere by ref desc, re_step asc limit #{start}, #{count}")
	List<RefboardDto> selectList(Map<String, Object> m);
	
	@Update("update refboard set readcount = readcount + 1 where no = #{no}")
	int updateReadCount(int no);
	
	@Select("select * from refboard where no = #{no}")
	RefboardDto selectOne(int no);
}
