package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.example.dto.FileinfoDto;

@Mapper
public interface FileinfoDao {
	
	@Insert("insert into fileinfo (name, path, filesize, description )"
			+ " values (#{name}, #{path}, #{filesize},#{description})")
	@Options(useGeneratedKeys = true, keyProperty = "fileid")
	int insertFile(FileinfoDto file);
	
	List<FileinfoDto> fileList();
	
	FileinfoDto fileOne(int fileid);
	
	@Delete("delete from fileinfo where fileid = #{fileid}")
	int deleteFile(int fileid);
}
