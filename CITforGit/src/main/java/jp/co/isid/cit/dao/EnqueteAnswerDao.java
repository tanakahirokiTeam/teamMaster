package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.EnqueteAnswer;

/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteAnswerDao {
	
	
    /**
     * @param enqueteAnswerId
     * @return the EnqueteAnswer entity
     */
    @Select
    EnqueteAnswer selectById(int id);

    /**
     * @param enqueteAnswerId
     * @return the EnqueteAnswer entity
     */
    @Select
    EnqueteAnswer selectByEnqueteEsqId(Integer enqueteId,String esqId);

    /**
     * @param enqueteAnswerId
     * @return the EnqueteAnswer entity
     */
    @Select
    List<EnqueteAnswer> selectByEnqueteId(int id);
    
    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(EnqueteAnswer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(EnqueteAnswer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(EnqueteAnswer entity);
}