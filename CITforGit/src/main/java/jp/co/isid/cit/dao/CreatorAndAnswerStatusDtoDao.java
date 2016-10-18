package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.dto.CreatorAndAnswerStatusDto;

/**
 */
@Dao
@ConfigAutowireable
public interface CreatorAndAnswerStatusDtoDao {

	/**
	 * @param choiceAnswerId
	 * @return the ChoiceAnswer entity
	 */
	@Select
	List<CreatorAndAnswerStatusDto> selectById(int deptId, String esqId);

}