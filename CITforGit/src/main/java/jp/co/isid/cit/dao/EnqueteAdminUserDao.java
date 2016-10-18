package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.EnqueteAdminUser;

/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteAdminUserDao {

    /**
     * @param enqueteId
     * @param esqId
     * @return the EnqueteAdminUser entity
     */
    @Select
    List<EnqueteAdminUser> selectByEsqId(String id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(EnqueteAdminUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(EnqueteAdminUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete(sqlFile=true)
    int delete(int enqueteId);
    
    @Update(sqlFile=true)
    int updateDeleteFlag(int enqueteId);
}