package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.DischargePlaceBean;
import com.kings.ttp.pojo.DischargePlaceBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DischargePlaceBeanMapper {
    int countByExample(DischargePlaceBeanExample example);

    int deleteByExample(DischargePlaceBeanExample example);

    int deleteByPrimaryKey(String placeId);

    int insert(DischargePlaceBean record);

    int insertSelective(DischargePlaceBean record);

    List<DischargePlaceBean> selectByExample(DischargePlaceBeanExample example);

    DischargePlaceBean selectByPrimaryKey(String placeId);

    int updateByExampleSelective(@Param("record") DischargePlaceBean record, @Param("example") DischargePlaceBeanExample example);

    int updateByExample(@Param("record") DischargePlaceBean record, @Param("example") DischargePlaceBeanExample example);

    int updateByPrimaryKeySelective(DischargePlaceBean record);

    int updateByPrimaryKey(DischargePlaceBean record);
}