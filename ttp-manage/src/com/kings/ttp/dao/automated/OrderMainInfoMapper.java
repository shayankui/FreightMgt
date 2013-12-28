package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.OrderMainInfo;
import com.kings.ttp.pojo.OrderMainInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMainInfoMapper {
    int countByExample(OrderMainInfoExample example);

    int deleteByExample(OrderMainInfoExample example);

    int deleteByPrimaryKey(String orderNum);

    int insert(OrderMainInfo record);

    int insertSelective(OrderMainInfo record);

    List<OrderMainInfo> selectByExample(OrderMainInfoExample example);

    OrderMainInfo selectByPrimaryKey(String orderNum);

    int updateByExampleSelective(@Param("record") OrderMainInfo record, @Param("example") OrderMainInfoExample example);

    int updateByExample(@Param("record") OrderMainInfo record, @Param("example") OrderMainInfoExample example);

    int updateByPrimaryKeySelective(OrderMainInfo record);

    int updateByPrimaryKey(OrderMainInfo record);
}