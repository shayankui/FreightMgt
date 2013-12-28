package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.ReceivePlaceBean;
import com.kings.ttp.pojo.ReceivePlaceBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivePlaceBeanMapper {
    int countByExample(ReceivePlaceBeanExample example);

    int deleteByExample(ReceivePlaceBeanExample example);

    int deleteByPrimaryKey(String placeId);

    int insert(ReceivePlaceBean record);

    int insertSelective(ReceivePlaceBean record);

    List<ReceivePlaceBean> selectByExample(ReceivePlaceBeanExample example);

    ReceivePlaceBean selectByPrimaryKey(String placeId);

    int updateByExampleSelective(@Param("record") ReceivePlaceBean record, @Param("example") ReceivePlaceBeanExample example);

    int updateByExample(@Param("record") ReceivePlaceBean record, @Param("example") ReceivePlaceBeanExample example);

    int updateByPrimaryKeySelective(ReceivePlaceBean record);

    int updateByPrimaryKey(ReceivePlaceBean record);
}