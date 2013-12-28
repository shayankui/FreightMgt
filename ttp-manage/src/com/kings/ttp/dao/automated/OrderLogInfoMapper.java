package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.OrderLogInfo;
import com.kings.ttp.pojo.OrderLogInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLogInfoMapper {
    int countByExample(OrderLogInfoExample example);

    int deleteByExample(OrderLogInfoExample example);

    int deleteByPrimaryKey(String logId);

    int insert(OrderLogInfo record);

    int insertSelective(OrderLogInfo record);

    List<OrderLogInfo> selectByExample(OrderLogInfoExample example);

    OrderLogInfo selectByPrimaryKey(String logId);

    int updateByExampleSelective(@Param("record") OrderLogInfo record, @Param("example") OrderLogInfoExample example);

    int updateByExample(@Param("record") OrderLogInfo record, @Param("example") OrderLogInfoExample example);

    int updateByPrimaryKeySelective(OrderLogInfo record);

    int updateByPrimaryKey(OrderLogInfo record);
}