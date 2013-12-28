package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.OrderSubInfo;
import com.kings.ttp.pojo.OrderSubInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSubInfoMapper {
    int countByExample(OrderSubInfoExample example);

    int deleteByExample(OrderSubInfoExample example);

    int deleteByPrimaryKey(String subNum);

    int insert(OrderSubInfo record);

    int insertSelective(OrderSubInfo record);

    List<OrderSubInfo> selectByExample(OrderSubInfoExample example);

    OrderSubInfo selectByPrimaryKey(String subNum);

    int updateByExampleSelective(@Param("record") OrderSubInfo record, @Param("example") OrderSubInfoExample example);

    int updateByExample(@Param("record") OrderSubInfo record, @Param("example") OrderSubInfoExample example);

    int updateByPrimaryKeySelective(OrderSubInfo record);

    int updateByPrimaryKey(OrderSubInfo record);
}