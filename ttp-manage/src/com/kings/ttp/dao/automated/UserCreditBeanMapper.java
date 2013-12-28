package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.UserCreditBean;
import com.kings.ttp.pojo.UserCreditBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCreditBeanMapper {
    int countByExample(UserCreditBeanExample example);

    int deleteByExample(UserCreditBeanExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserCreditBean record);

    int insertSelective(UserCreditBean record);

    List<UserCreditBean> selectByExample(UserCreditBeanExample example);

    UserCreditBean selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserCreditBean record, @Param("example") UserCreditBeanExample example);

    int updateByExample(@Param("record") UserCreditBean record, @Param("example") UserCreditBeanExample example);

    int updateByPrimaryKeySelective(UserCreditBean record);

    int updateByPrimaryKey(UserCreditBean record);
}