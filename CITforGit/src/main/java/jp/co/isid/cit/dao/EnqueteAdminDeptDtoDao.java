package jp.co.isid.cit.dao;


import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.EnqueteAdminDeptDto;





/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteAdminDeptDtoDao {

    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    List<EnqueteAdminDeptDto> selectById(int id);
}
