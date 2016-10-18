package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.Dept;

/**
 */
@Dao
@ConfigAutowireable
public interface DeptDao {

    /**
     * @return the Dept entity
     */
    @Select
    List<Dept> selectAll();

    /**
     * @param deptId
     * @return the Dept entity
     */
    @Select
    Dept selectById(Integer id);
    
    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Dept entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Dept entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Dept entity);
}