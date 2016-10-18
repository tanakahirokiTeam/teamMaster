package jp.co.isid.cit.dao;


import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.EnqueteDeptDto;



/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteDeptDtoDao {

    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    List<EnqueteDeptDto> selectById(int id);
}
