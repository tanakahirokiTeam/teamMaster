package jp.co.isid.cit.dao;


import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.QuestionDto;



/**
 */
@Dao
@ConfigAutowireable
public interface QuestionDtoDao {

    /**
     * @param questionId
     * @return the ChoiceAnswer entity
     */
    @Select
    QuestionDto selectById(int id);
    
    /**
     * @param enqueteId
     * @return the ChoiceAnswer entity
     */
    @Select
    List<QuestionDto> selectByEnqueteId(int id);
}
