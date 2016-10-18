package jp.co.isid.cit.dao;


import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.CreatorDto;

/**
 */
@Dao
@ConfigAutowireable
public interface CreatorDtoDao {

    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    CreatorDto selectById(int id);

    
}