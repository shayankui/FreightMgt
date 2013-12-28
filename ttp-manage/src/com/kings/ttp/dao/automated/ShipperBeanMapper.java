package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.ShipperBean;
import com.kings.ttp.pojo.ShipperBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperBeanMapper {
    int countByExample(ShipperBeanExample example);

    int deleteByExample(ShipperBeanExample example);

    int deleteByPrimaryKey(String userId);

    int insert(ShipperBean record);

    int insertSelective(ShipperBean record);

    List<ShipperBean> selectByExample(ShipperBeanExample example);

    ShipperBean selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") ShipperBean record, @Param("example") ShipperBeanExample example);

    int updateByExample(@Param("record") ShipperBean record, @Param("example") ShipperBeanExample example);

    int updateByPrimaryKeySelective(ShipperBean record);

    int updateByPrimaryKey(ShipperBean record);
}