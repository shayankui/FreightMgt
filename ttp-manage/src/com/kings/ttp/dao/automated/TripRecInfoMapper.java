package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.TripRecInfo;
import com.kings.ttp.pojo.TripRecInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TripRecInfoMapper {
    int countByExample(TripRecInfoExample example);

    int deleteByExample(TripRecInfoExample example);

    int deleteByPrimaryKey(String recId);

    int insert(TripRecInfo record);

    int insertSelective(TripRecInfo record);

    List<TripRecInfo> selectByExample(TripRecInfoExample example);

    TripRecInfo selectByPrimaryKey(String recId);

    int updateByExampleSelective(@Param("record") TripRecInfo record, @Param("example") TripRecInfoExample example);

    int updateByExample(@Param("record") TripRecInfo record, @Param("example") TripRecInfoExample example);

    int updateByPrimaryKeySelective(TripRecInfo record);

    int updateByPrimaryKey(TripRecInfo record);
}