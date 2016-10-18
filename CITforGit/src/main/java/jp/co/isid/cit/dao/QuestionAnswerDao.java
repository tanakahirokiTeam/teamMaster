package jp.co.isid.cit.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import jp.co.isid.cit.ConfigAutowireable;
import jp.co.isid.cit.entity.QuestionAnswer;

@Dao
@ConfigAutowireable
public interface QuestionAnswerDao {

	/**
	 * @param questionId
	 * @return count rows
	 */
	@Select
	int countByQuestionId(int id);

	/**
	 * @param questionId
	 * @return entity
	 */
	@Select
	List<QuestionAnswer> selectByQuestionId(int id);

	/**
	 * @param enqueteEnqueteAnswerId
	 * @return entity
	 */
	@Select
	QuestionAnswer selectByEnqueteAnswerQuestionId(int enqueteAnswerId, int questionId);

	/**
	 * @param enqueteEnqueteAnswerId
	 * @return entity
	 */
	@Select
	List<QuestionAnswer> selectByEnqueteAnswerId(int id);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Insert
	int insert(QuestionAnswer entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Update
	int update(QuestionAnswer entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Delete
	int delete(QuestionAnswer entity);
}
