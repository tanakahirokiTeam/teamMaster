package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.ChoiceAnswer;

/**
 */
@Dao
@ConfigAutowireable
public interface ChoiceAnswerDao {

    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    ChoiceAnswer selectById(Long choiceAnswerId);
    
    /**
     * @param choiceAnswerId
     * @return the ChoiceAnswer entity
     */
    @Select
    List<ChoiceAnswer> selectByQuestionAnswerId(int id);
    
    /**
     * @param choiceId
     * @return 
     */
    @Select
    int countByChoiceId(int id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(ChoiceAnswer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(ChoiceAnswer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(ChoiceAnswer entity);
}