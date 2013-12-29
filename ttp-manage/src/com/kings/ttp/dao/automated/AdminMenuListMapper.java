package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.AdminMenuList;
import com.kings.ttp.pojo.AdminMenuListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMenuListMapper {
    int countByExample(AdminMenuListExample example);

    int deleteByExample(AdminMenuListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminMenuList record);

    int insertSelective(AdminMenuList record);

    List<AdminMenuList> selectByExample(AdminMenuListExample example);

    AdminMenuList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminMenuList record, @Param("example") AdminMenuListExample example);

    int updateByExample(@Param("record") AdminMenuList record, @Param("example") AdminMenuListExample example);

    int updateByPrimaryKeySelective(AdminMenuList record);

    int updateByPrimaryKey(AdminMenuList record);
    
    List<AdminMenuList> selectByGroup(Integer groupId);
}