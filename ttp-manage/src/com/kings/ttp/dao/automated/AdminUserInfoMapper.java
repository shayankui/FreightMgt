package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.AdminUserInfo;
import com.kings.ttp.pojo.AdminUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserInfoMapper {
    int countByExample(AdminUserInfoExample example);

    int deleteByExample(AdminUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminUserInfo record);

    int insertSelective(AdminUserInfo record);

    List<AdminUserInfo> selectByExample(AdminUserInfoExample example);

    AdminUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminUserInfo record, @Param("example") AdminUserInfoExample example);

    int updateByExample(@Param("record") AdminUserInfo record, @Param("example") AdminUserInfoExample example);

    int updateByPrimaryKeySelective(AdminUserInfo record);

    int updateByPrimaryKey(AdminUserInfo record);
    
    AdminUserInfo selectByUsername(String username);
    
}