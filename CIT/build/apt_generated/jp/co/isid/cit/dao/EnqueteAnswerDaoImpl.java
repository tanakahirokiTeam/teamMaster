package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T22:52:14.132+0900")
public class EnqueteAnswerDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.EnqueteAnswerDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAnswerDao.class, "selectById", int.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAnswerDao.class, "selectByEnqueteEsqId", java.lang.Integer.class, java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAnswerDao.class, "selectByEnqueteId", int.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAnswerDao.class, "insert", jp.co.isid.cit.entity.EnqueteAnswer.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAnswerDao.class, "update", jp.co.isid.cit.entity.EnqueteAnswer.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAnswerDao.class, "delete", jp.co.isid.cit.entity.EnqueteAnswer.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public EnqueteAnswerDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public jp.co.isid.cit.entity.EnqueteAnswer selectById(int id) {
        entering("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteAnswerDao/selectById.sql");
            __query.setEntityType(jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<jp.co.isid.cit.entity.EnqueteAnswer> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.isid.cit.entity.EnqueteAnswer>(jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal()));
            jp.co.isid.cit.entity.EnqueteAnswer __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public jp.co.isid.cit.entity.EnqueteAnswer selectByEnqueteEsqId(java.lang.Integer enqueteId, java.lang.String esqId) {
        entering("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectByEnqueteEsqId", enqueteId, esqId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteAnswerDao/selectByEnqueteEsqId.sql");
            __query.setEntityType(jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal());
            __query.addParameter("enqueteId", java.lang.Integer.class, enqueteId);
            __query.addParameter("esqId", java.lang.String.class, esqId);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl");
            __query.setCallerMethodName("selectByEnqueteEsqId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<jp.co.isid.cit.entity.EnqueteAnswer> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.isid.cit.entity.EnqueteAnswer>(jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal()));
            jp.co.isid.cit.entity.EnqueteAnswer __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectByEnqueteEsqId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectByEnqueteEsqId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.isid.cit.entity.EnqueteAnswer> selectByEnqueteId(int id) {
        entering("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectByEnqueteId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteAnswerDao/selectByEnqueteId.sql");
            __query.setEntityType(jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl");
            __query.setCallerMethodName("selectByEnqueteId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.entity.EnqueteAnswer>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.entity.EnqueteAnswer>(jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.entity.EnqueteAnswer> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectByEnqueteId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "selectByEnqueteId", __e);
            throw __e;
        }
    }

    @Override
    public int insert(jp.co.isid.cit.entity.EnqueteAnswer entity) {
        entering("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<jp.co.isid.cit.entity.EnqueteAnswer> __query = getQueryImplementors().createAutoInsertQuery(__method3, jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(jp.co.isid.cit.entity.EnqueteAnswer entity) {
        entering("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<jp.co.isid.cit.entity.EnqueteAnswer> __query = getQueryImplementors().createAutoUpdateQuery(__method4, jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl");
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
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(jp.co.isid.cit.entity.EnqueteAnswer entity) {
        entering("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<jp.co.isid.cit.entity.EnqueteAnswer> __query = getQueryImplementors().createAutoDeleteQuery(__method5, jp.co.isid.cit.entity._EnqueteAnswer.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAnswerDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
