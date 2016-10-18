package jp.co.isid.cit.dao;


import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.UserDeptDto;



/**
 */
@Dao
@ConfigAutowireable
public interface UserDeptDtoDao {

    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    UserDeptDto selectById(String id);
    
    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    List<UserDeptDto> searchUser(String esqId,String userName,int deptId);
    
    /**
     * @param enqueteId
     * @return the ChoiceAnswer entity
     */
    @Select
    List<UserDeptDto> selectAnsweredUserByEnqueteId(int id);
    
    /**
     * @param enqueteId
     * @return the ChoiceAnswer entity
     */
    @Select
    List<UserDeptDto> selectUnansweredUserByEnqueteId(int id);
    
}
