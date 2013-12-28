package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.GoodsEvaluateInfo;
import com.kings.ttp.pojo.GoodsEvaluateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsEvaluateInfoMapper {
    int countByExample(GoodsEvaluateInfoExample example);

    int deleteByExample(GoodsEvaluateInfoExample example);

    int deleteByPrimaryKey(String evaluateNum);

    int insert(GoodsEvaluateInfo record);

    int insertSelective(GoodsEvaluateInfo record);

    List<GoodsEvaluateInfo> selectByExample(GoodsEvaluateInfoExample example);

    GoodsEvaluateInfo selectByPrimaryKey(String evaluateNum);

    int updateByExampleSelective(@Param("record") GoodsEvaluateInfo record, @Param("example") GoodsEvaluateInfoExample example);

    int updateByExample(@Param("record") GoodsEvaluateInfo record, @Param("example") GoodsEvaluateInfoExample example);

    int updateByPrimaryKeySelective(GoodsEvaluateInfo record);

    int updateByPrimaryKey(GoodsEvaluateInfo record);
}