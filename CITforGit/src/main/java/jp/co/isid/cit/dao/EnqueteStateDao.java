package jp.co.isid.cit.dao;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.EnqueteState;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteStateDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(EnqueteState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(EnqueteState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(EnqueteState entity);
}