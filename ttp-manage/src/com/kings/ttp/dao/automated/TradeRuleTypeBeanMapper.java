package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.TradeRuleTypeBean;
import com.kings.ttp.pojo.TradeRuleTypeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeRuleTypeBeanMapper {
    int countByExample(TradeRuleTypeBeanExample example);

    int deleteByExample(TradeRuleTypeBeanExample example);

    int deleteByPrimaryKey(String ruleTypeNum);

    int insert(TradeRuleTypeBean record);

    int insertSelective(TradeRuleTypeBean record);

    List<TradeRuleTypeBean> selectByExample(TradeRuleTypeBeanExample example);

    TradeRuleTypeBean selectByPrimaryKey(String ruleTypeNum);

    int updateByExampleSelective(@Param("record") TradeRuleTypeBean record, @Param("example") TradeRuleTypeBeanExample example);

    int updateByExample(@Param("record") TradeRuleTypeBean record, @Param("example") TradeRuleTypeBeanExample example);

    int updateByPrimaryKeySelective(TradeRuleTypeBean record);

    int updateByPrimaryKey(TradeRuleTypeBean record);
}