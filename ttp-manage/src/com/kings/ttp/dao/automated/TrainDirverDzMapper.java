package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.TrainDirverDz;
import com.kings.ttp.pojo.TrainDirverDzExample;
import com.kings.ttp.pojo.TrainDirverDzKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainDirverDzMapper {
    int countByExample(TrainDirverDzExample example);

    int deleteByExample(TrainDirverDzExample example);

    int deleteByPrimaryKey(TrainDirverDzKey key);

    int insert(TrainDirverDz record);

    int insertSelective(TrainDirverDz record);

    List<TrainDirverDz> selectByExample(TrainDirverDzExample example);

    TrainDirverDz selectByPrimaryKey(TrainDirverDzKey key);

    int updateByExampleSelective(@Param("record") TrainDirverDz record, @Param("example") TrainDirverDzExample example);

    int updateByExample(@Param("record") TrainDirverDz record, @Param("example") TrainDirverDzExample example);

    int updateByPrimaryKeySelective(TrainDirverDz record);

    int updateByPrimaryKey(TrainDirverDz record);
}