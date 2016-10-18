package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.Choice;


/**
 */
@Dao
@ConfigAutowireable
public interface ChoiceDao {

	/**
     * @param choiceId
     * @return the Choice entity
     */
    @Select
    Choice selectById(int id);
	
    /**
     * @param questionId
     * @return rows
     */
    @Select
    List<Choice> selectByQuestionId(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Choice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Choice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Choice entity);
    
    @Delete(sqlFile=true)
    int deleteByQuestionId(int questionId);
}