package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.Question;

/**
 */
@Dao
@ConfigAutowireable
public interface QuestionDao {
	
	/**
     * @param questionId
     * @return the Question entity
     */
    @Select
    Question selectById(int id);
    
    /**
     * @param enqueteId
     * @return rows
     */
    @Select
    List<Question> selectByEnqueteId(int id);

    /**
     * @return rows
     */
    @Select
    Integer selectLastInsert();

	
    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Question entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Question entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Question entity);
    
    @Delete(sqlFile = true)
    int deleteByEnqueteId(int enqueteId);
}