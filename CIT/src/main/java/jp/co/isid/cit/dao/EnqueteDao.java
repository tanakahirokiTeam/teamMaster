package jp.co.isid.cit.dao;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.Enquete;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteDao {

    /**
     * @param enqueteId
     * @return the Enquete entity
     */
    @Select
    Enquete selectById(Integer id);
    
    /**
     * @param entity
     * @return affected rows
     */
    @Select
    Integer selectLastInsert();

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Enquete entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Enquete entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Enquete entity);
}