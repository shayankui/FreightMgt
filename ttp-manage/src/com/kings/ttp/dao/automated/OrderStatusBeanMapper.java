package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.OrderStatusBean;
import com.kings.ttp.pojo.OrderStatusBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStatusBeanMapper {
    int countByExample(OrderStatusBeanExample example);

    int deleteByExample(OrderStatusBeanExample example);

    int deleteByPrimaryKey(String statusNum);

    int insert(OrderStatusBean record);

    int insertSelective(OrderStatusBean record);

    List<OrderStatusBean> selectByExample(OrderStatusBeanExample example);

    OrderStatusBean selectByPrimaryKey(String statusNum);

    int updateByExampleSelective(@Param("record") OrderStatusBean record, @Param("example") OrderStatusBeanExample example);

    int updateByExample(@Param("record") OrderStatusBean record, @Param("example") OrderStatusBeanExample example);

    int updateByPrimaryKeySelective(OrderStatusBean record);

    int updateByPrimaryKey(OrderStatusBean record);
}