package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.AdminUserGroup;
import com.kings.ttp.pojo.AdminUserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserGroupMapper {
    int countByExample(AdminUserGroupExample example);

    int deleteByExample(AdminUserGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminUserGroup record);

    int insertSelective(AdminUserGroup record);

    List<AdminUserGroup> selectByExample(AdminUserGroupExample example);

    AdminUserGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminUserGroup record, @Param("example") AdminUserGroupExample example);

    int updateByExample(@Param("record") AdminUserGroup record, @Param("example") AdminUserGroupExample example);

    int updateByPrimaryKeySelective(AdminUserGroup record);

    int updateByPrimaryKey(AdminUserGroup record);
}