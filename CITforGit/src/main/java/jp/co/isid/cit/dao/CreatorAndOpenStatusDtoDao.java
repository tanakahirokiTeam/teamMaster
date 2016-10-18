package jp.co.isid.cit.dao;


import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.CreatorAndOpenStatusDto;


/**
 */
@Dao
@ConfigAutowireable
public interface CreatorAndOpenStatusDtoDao {

    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    CreatorAndOpenStatusDto selectById(int id);

    
}