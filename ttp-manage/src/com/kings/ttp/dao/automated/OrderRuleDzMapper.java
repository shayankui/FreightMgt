package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.OrderRuleDz;
import com.kings.ttp.pojo.OrderRuleDzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRuleDzMapper {
    int countByExample(OrderRuleDzExample example);

    int deleteByExample(OrderRuleDzExample example);

    int insert(OrderRuleDz record);

    int insertSelective(OrderRuleDz record);

    List<OrderRuleDz> selectByExample(OrderRuleDzExample example);

    int updateByExampleSelective(@Param("record") OrderRuleDz record, @Param("example") OrderRuleDzExample example);

    int updateByExample(@Param("record") OrderRuleDz record, @Param("example") OrderRuleDzExample example);
}