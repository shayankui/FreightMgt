package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.GoodsBean;
import com.kings.ttp.pojo.GoodsBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBeanMapper {
    int countByExample(GoodsBeanExample example);

    int deleteByExample(GoodsBeanExample example);

    int deleteByPrimaryKey(String goodsId);

    int insert(GoodsBean record);

    int insertSelective(GoodsBean record);

    List<GoodsBean> selectByExample(GoodsBeanExample example);

    GoodsBean selectByPrimaryKey(String goodsId);

    int updateByExampleSelective(@Param("record") GoodsBean record, @Param("example") GoodsBeanExample example);

    int updateByExample(@Param("record") GoodsBean record, @Param("example") GoodsBeanExample example);

    int updateByPrimaryKeySelective(GoodsBean record);

    int updateByPrimaryKey(GoodsBean record);
}