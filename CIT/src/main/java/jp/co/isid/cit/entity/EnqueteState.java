package jp.co.isid.cit.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "ENQUETE_STATE")
public class EnqueteState {

    /** */
    @Id
    @Column(name = "ENQUETE_STATE_ID")
    private Short enqueteStateId;

    /** */
    @Column(name = "ENQUETE_STATE")
    private String enqueteState;

    /** 
     * Returns the enqueteStateId.
     * 
     * @return the enqueteStateId
     */
    public Short getEnqueteStateId() {
        return enqueteStateId;
    }

    /** 
     * Sets the enqueteStateId.
     * 
     * @param enqueteStateId the enqueteStateId
     */
    public void setEnqueteStateId(Short enqueteStateId) {
        this.enqueteStateId = enqueteStateId;
    }

    /** 
     * Returns the enqueteState.
     * 
     * @return the enqueteState
     */
    public String getEnqueteState() {
        return enqueteState;
    }

    /** 
     * Sets the enqueteState.
     * 
     * @param enqueteState the enqueteState
     */
    public void setEnqueteState(String enqueteState) {
        this.enqueteState = enqueteState;
    }
}