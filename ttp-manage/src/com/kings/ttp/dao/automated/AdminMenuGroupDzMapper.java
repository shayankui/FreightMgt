package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.AdminMenuGroupDz;
import com.kings.ttp.pojo.AdminMenuGroupDzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMenuGroupDzMapper {
	
    int countByExample(AdminMenuGroupDzExample example);

    int deleteByExample(AdminMenuGroupDzExample example);

    int insert(AdminMenuGroupDz record);

    int insertSelective(AdminMenuGroupDz record);

    List<AdminMenuGroupDz> selectByExample(AdminMenuGroupDzExample example);

    int updateByExampleSelective(@Param("record") AdminMenuGroupDz record, @Param("example") AdminMenuGroupDzExample example);

    int updateByExample(@Param("record") AdminMenuGroupDz record, @Param("example") AdminMenuGroupDzExample example);
}