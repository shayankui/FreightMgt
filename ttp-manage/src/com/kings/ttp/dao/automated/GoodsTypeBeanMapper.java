package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.GoodsTypeBean;
import com.kings.ttp.pojo.GoodsTypeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsTypeBeanMapper {
    int countByExample(GoodsTypeBeanExample example);

    int deleteByExample(GoodsTypeBeanExample example);

    int deleteByPrimaryKey(String typeNum);

    int insert(GoodsTypeBean record);

    int insertSelective(GoodsTypeBean record);

    List<GoodsTypeBean> selectByExample(GoodsTypeBeanExample example);

    GoodsTypeBean selectByPrimaryKey(String typeNum);

    int updateByExampleSelective(@Param("record") GoodsTypeBean record, @Param("example") GoodsTypeBeanExample example);

    int updateByExample(@Param("record") GoodsTypeBean record, @Param("example") GoodsTypeBeanExample example);

    int updateByPrimaryKeySelective(GoodsTypeBean record);

    int updateByPrimaryKey(GoodsTypeBean record);
}