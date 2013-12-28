package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.TrainBean;
import com.kings.ttp.pojo.TrainBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainBeanMapper {
    int countByExample(TrainBeanExample example);

    int deleteByExample(TrainBeanExample example);

    int deleteByPrimaryKey(String trainId);

    int insert(TrainBean record);

    int insertSelective(TrainBean record);

    List<TrainBean> selectByExample(TrainBeanExample example);

    TrainBean selectByPrimaryKey(String trainId);

    int updateByExampleSelective(@Param("record") TrainBean record, @Param("example") TrainBeanExample example);

    int updateByExample(@Param("record") TrainBean record, @Param("example") TrainBeanExample example);

    int updateByPrimaryKeySelective(TrainBean record);

    int updateByPrimaryKey(TrainBean record);
}