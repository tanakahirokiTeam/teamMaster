package jp.co.isid.cit.dao;


import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.EnqueteAnswerUserDto;

/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteAnswerUserDtoDao {

    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    EnqueteAnswerUserDto selectById(String id);
    
    /**
     * @param enqueteId,deptId
     * @return count rows
     */
    @Select
    int countByEnqueteDeptId(int enqueteId,int deptId);
    
}
