package jp.co.isid.cit.dao;


import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.EnqueteAdminDto;





/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteAdminDtoDao {

    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    List<EnqueteAdminDto> selectById(int id);
}
