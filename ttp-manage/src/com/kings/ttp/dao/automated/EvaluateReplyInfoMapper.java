package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.EvaluateReplyInfo;
import com.kings.ttp.pojo.EvaluateReplyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluateReplyInfoMapper {
    int countByExample(EvaluateReplyInfoExample example);

    int deleteByExample(EvaluateReplyInfoExample example);

    int deleteByPrimaryKey(String replyNum);

    int insert(EvaluateReplyInfo record);

    int insertSelective(EvaluateReplyInfo record);

    List<EvaluateReplyInfo> selectByExample(EvaluateReplyInfoExample example);

    EvaluateReplyInfo selectByPrimaryKey(String replyNum);

    int updateByExampleSelective(@Param("record") EvaluateReplyInfo record, @Param("example") EvaluateReplyInfoExample example);

    int updateByExample(@Param("record") EvaluateReplyInfo record, @Param("example") EvaluateReplyInfoExample example);

    int updateByPrimaryKeySelective(EvaluateReplyInfo record);

    int updateByPrimaryKey(EvaluateReplyInfo record);
}