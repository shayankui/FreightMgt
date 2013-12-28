package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.SystemParamBean;
import com.kings.ttp.pojo.SystemParamBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemParamBeanMapper {
    int countByExample(SystemParamBeanExample example);

    int deleteByExample(SystemParamBeanExample example);

    int deleteByPrimaryKey(String csbm);

    int insert(SystemParamBean record);

    int insertSelective(SystemParamBean record);

    List<SystemParamBean> selectByExample(SystemParamBeanExample example);

    SystemParamBean selectByPrimaryKey(String csbm);

    int updateByExampleSelective(@Param("record") SystemParamBean record, @Param("example") SystemParamBeanExample example);

    int updateByExample(@Param("record") SystemParamBean record, @Param("example") SystemParamBeanExample example);

    int updateByPrimaryKeySelective(SystemParamBean record);

    int updateByPrimaryKey(SystemParamBean record);
}