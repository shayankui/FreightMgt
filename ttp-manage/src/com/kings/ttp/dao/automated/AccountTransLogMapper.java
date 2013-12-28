package com.kings.ttp.dao.automated;

import com.kings.ttp.pojo.AccountTransLog;
import com.kings.ttp.pojo.AccountTransLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountTransLogMapper {
    int countByExample(AccountTransLogExample example);

    int deleteByExample(AccountTransLogExample example);

    int deleteByPrimaryKey(String logId);

    int insert(AccountTransLog record);

    int insertSelective(AccountTransLog record);

    List<AccountTransLog> selectByExample(AccountTransLogExample example);

    AccountTransLog selectByPrimaryKey(String logId);

    int updateByExampleSelective(@Param("record") AccountTransLog record, @Param("example") AccountTransLogExample example);

    int updateByExample(@Param("record") AccountTransLog record, @Param("example") AccountTransLogExample example);

    int updateByPrimaryKeySelective(AccountTransLog record);

    int updateByPrimaryKey(AccountTransLog record);
}