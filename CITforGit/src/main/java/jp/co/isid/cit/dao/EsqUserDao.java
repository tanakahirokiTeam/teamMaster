package jp.co.isid.cit.dao;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.EsqUser;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
@ConfigAutowireable
public interface EsqUserDao {

    /**
     * @param esqId
     * @return the EsqUser entity
     */
    @Select
    EsqUser selectById(String id);

    /**
     * @param deptId
     * @return count rows
     */
    @Select
    int countByDeptId(int id);
    
    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(EsqUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(EsqUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(EsqUser entity);
}