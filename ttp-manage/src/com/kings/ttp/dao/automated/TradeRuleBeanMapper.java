package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.TradeRuleBean;
import com.kings.ttp.pojo.TradeRuleBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeRuleBeanMapper {
    int countByExample(TradeRuleBeanExample example);

    int deleteByExample(TradeRuleBeanExample example);

    int deleteByPrimaryKey(String ruleNum);

    int insert(TradeRuleBean record);

    int insertSelective(TradeRuleBean record);

    List<TradeRuleBean> selectByExample(TradeRuleBeanExample example);

    TradeRuleBean selectByPrimaryKey(String ruleNum);

    int updateByExampleSelective(@Param("record") TradeRuleBean record, @Param("example") TradeRuleBeanExample example);

    int updateByExample(@Param("record") TradeRuleBean record, @Param("example") TradeRuleBeanExample example);

    int updateByPrimaryKeySelective(TradeRuleBean record);

    int updateByPrimaryKey(TradeRuleBean record);
}