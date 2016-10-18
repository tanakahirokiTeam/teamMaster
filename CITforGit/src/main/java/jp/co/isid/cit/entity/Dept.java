package jp.co.isid.cit.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "DEPT")
public class Dept {

    /** */
    @Id
    @Column(name = "DEPT_ID")
    private int deptId;

    /** */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /** 
     * Returns the deptId.
     * 
     * @return the deptId
     */
    public int getDeptId() {
        return deptId;
    }

    /** 
     * Sets the deptId.
     * 
     * @param deptId the deptId
     */
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    /** 
     * Returns the deptName.
     * 
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /** 
     * Sets the deptName.
     * 
     * @param deptName the deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}