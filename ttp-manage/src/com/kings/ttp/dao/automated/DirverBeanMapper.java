package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.DirverBean;
import com.kings.ttp.pojo.DirverBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirverBeanMapper {
    int countByExample(DirverBeanExample example);

    int deleteByExample(DirverBeanExample example);

    int deleteByPrimaryKey(String userId);

    int insert(DirverBean record);

    int insertSelective(DirverBean record);

    List<DirverBean> selectByExample(DirverBeanExample example);

    DirverBean selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") DirverBean record, @Param("example") DirverBeanExample example);

    int updateByExample(@Param("record") DirverBean record, @Param("example") DirverBeanExample example);

    int updateByPrimaryKeySelective(DirverBean record);

    int updateByPrimaryKey(DirverBean record);
}