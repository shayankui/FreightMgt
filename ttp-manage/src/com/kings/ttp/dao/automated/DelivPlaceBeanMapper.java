package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.DelivPlaceBean;
import com.kings.ttp.pojo.DelivPlaceBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DelivPlaceBeanMapper {
    int countByExample(DelivPlaceBeanExample example);

    int deleteByExample(DelivPlaceBeanExample example);

    int deleteByPrimaryKey(String placeId);

    int insert(DelivPlaceBean record);

    int insertSelective(DelivPlaceBean record);

    List<DelivPlaceBean> selectByExample(DelivPlaceBeanExample example);

    DelivPlaceBean selectByPrimaryKey(String placeId);

    int updateByExampleSelective(@Param("record") DelivPlaceBean record, @Param("example") DelivPlaceBeanExample example);

    int updateByExample(@Param("record") DelivPlaceBean record, @Param("example") DelivPlaceBeanExample example);

    int updateByPrimaryKeySelective(DelivPlaceBean record);

    int updateByPrimaryKey(DelivPlaceBean record);
}