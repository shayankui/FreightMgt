package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.UserAccountBean;
import com.kings.ttp.pojo.UserAccountBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountBeanMapper {
    int countByExample(UserAccountBeanExample example);

    int deleteByExample(UserAccountBeanExample example);

    int deleteByPrimaryKey(String accountId);

    int insert(UserAccountBean record);

    int insertSelective(UserAccountBean record);

    List<UserAccountBean> selectByExample(UserAccountBeanExample example);

    UserAccountBean selectByPrimaryKey(String accountId);

    int updateByExampleSelective(@Param("record") UserAccountBean record, @Param("example") UserAccountBeanExample example);

    int updateByExample(@Param("record") UserAccountBean record, @Param("example") UserAccountBeanExample example);

    int updateByPrimaryKeySelective(UserAccountBean record);

    int updateByPrimaryKey(UserAccountBean record);
}