package com.rd.mapper;

import java.util.List;

import com.rd.common.TutorDynaSqlProvider;
import com.rd.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;


public interface UserMapper {
	@Select("select * from user")
	List<User> selAll();

	@UpdateProvider(type=TutorDynaSqlProvider.class,
			method="updateTutor")
	int updateTutor(User tutor);
}
