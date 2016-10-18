package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.EnqueteDept;


/**
 */
@Dao
@ConfigAutowireable
public interface EnqueteDeptDao {

    /**
     * @param enqueteId
     * @param deptId
     * @return the EnqueteDept entity
     */
    @Select
    List<EnqueteDept> selectByDeptId(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(EnqueteDept entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(EnqueteDept entity);
    
    @Delete(sqlFile=true)
    int deleteByEnqueteId(int enqueteId);
}