package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.QuestionType;

/**
 */
@Dao
@ConfigAutowireable
public interface QuestionTypeDao {

    /**
     * @param questionTypeId
     * @return the QuestionType entity
     */
    @Select
    List<QuestionType> selectAll();

    /**
     * @param questionTypeId
     * @return the QuestionType entity
     */
    @Select
    QuestionType selectById(Integer id);
    
    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(QuestionType entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(QuestionType entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(QuestionType entity);
}