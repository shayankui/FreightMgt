package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.GpsRecInfo;
import com.kings.ttp.pojo.GpsRecInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GpsRecInfoMapper {
    int countByExample(GpsRecInfoExample example);

    int deleteByExample(GpsRecInfoExample example);

    int deleteByPrimaryKey(String recId);

    int insert(GpsRecInfo record);

    int insertSelective(GpsRecInfo record);

    List<GpsRecInfo> selectByExample(GpsRecInfoExample example);

    GpsRecInfo selectByPrimaryKey(String recId);

    int updateByExampleSelective(@Param("record") GpsRecInfo record, @Param("example") GpsRecInfoExample example);

    int updateByExample(@Param("record") GpsRecInfo record, @Param("example") GpsRecInfoExample example);

    int updateByPrimaryKeySelective(GpsRecInfo record);

    int updateByPrimaryKey(GpsRecInfo record);
}