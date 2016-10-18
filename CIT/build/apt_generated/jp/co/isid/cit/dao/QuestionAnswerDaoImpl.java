package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T22:52:14.265+0900")
public class QuestionAnswerDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.QuestionAnswerDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionAnswerDao.class, "countByQuestionId", int.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionAnswerDao.class, "selectByQuestionId", int.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionAnswerDao.class, "selectByEnqueteAnswerQuestionId", int.class, int.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionAnswerDao.class, "selectByEnqueteAnswerId", int.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionAnswerDao.class, "insert", jp.co.isid.cit.entity.QuestionAnswer.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionAnswerDao.class, "update", jp.co.isid.cit.entity.QuestionAnswer.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionAnswerDao.class, "delete", jp.co.isid.cit.entity.QuestionAnswer.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public QuestionAnswerDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int countByQuestionId(int id) {
        entering("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "countByQuestionId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/QuestionAnswerDao/countByQuestionId.sql");
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionAnswerDaoImpl");
            __query.setCallerMethodName("countByQuestionId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.lang.Integer> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, true));
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "countByQuestionId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "countByQuestionId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.isid.cit.entity.QuestionAnswer> selectByQuestionId(int id) {
        entering("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByQuestionId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/QuestionAnswerDao/selectByQuestionId.sql");
            __query.setEntityType(jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionAnswerDaoImpl");
            __query.setCallerMethodName("selectByQuestionId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.entity.QuestionAnswer>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.entity.QuestionAnswer>(jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.entity.QuestionAnswer> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByQuestionId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByQuestionId", __e);
            throw __e;
        }
    }

    @Override
    public jp.co.isid.cit.entity.QuestionAnswer selectByEnqueteAnswerQuestionId(int enqueteAnswerId, int questionId) {
        entering("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByEnqueteAnswerQuestionId", enqueteAnswerId, questionId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/QuestionAnswerDao/selectByEnqueteAnswerQuestionId.sql");
            __query.setEntityType(jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal());
            __query.addParameter("enqueteAnswerId", int.class, enqueteAnswerId);
            __query.addParameter("questionId", int.class, questionId);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionAnswerDaoImpl");
            __query.setCallerMethodName("selectByEnqueteAnswerQuestionId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<jp.co.isid.cit.entity.QuestionAnswer> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.isid.cit.entity.QuestionAnswer>(jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal()));
            jp.co.isid.cit.entity.QuestionAnswer __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByEnqueteAnswerQuestionId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByEnqueteAnswerQuestionId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.isid.cit.entity.QuestionAnswer> selectByEnqueteAnswerId(int id) {
        entering("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByEnqueteAnswerId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/QuestionAnswerDao/selectByEnqueteAnswerId.sql");
            __query.setEntityType(jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionAnswerDaoImpl");
            __query.setCallerMethodName("selectByEnqueteAnswerId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.entity.QuestionAnswer>> __command = getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.entity.QuestionAnswer>(jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.entity.QuestionAnswer> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByEnqueteAnswerId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "selectByEnqueteAnswerId", __e);
            throw __e;
        }
    }

    @Override
    public int insert(jp.co.isid.cit.entity.QuestionAnswer entity) {
        entering("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<jp.co.isid.cit.entity.QuestionAnswer> __query = getQueryImplementors().createAutoInsertQuery(__method4, jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionAnswerDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(jp.co.isid.cit.entity.QuestionAnswer entity) {
        entering("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<jp.co.isid.cit.entity.QuestionAnswer> __query = getQueryImplementors().createAutoUpdateQuery(__method5, jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionAnswerDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(jp.co.isid.cit.entity.QuestionAnswer entity) {
        entering("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<jp.co.isid.cit.entity.QuestionAnswer> __query = getQueryImplementors().createAutoDeleteQuery(__method6, jp.co.isid.cit.entity._QuestionAnswer.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionAnswerDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method6, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionAnswerDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
