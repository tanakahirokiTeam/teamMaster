package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T22:52:14.114+0900")
public class EnqueteAdminUserDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.EnqueteAdminUserDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAdminUserDao.class, "selectByEsqId", java.lang.String.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAdminUserDao.class, "insert", jp.co.isid.cit.entity.EnqueteAdminUser.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAdminUserDao.class, "update", jp.co.isid.cit.entity.EnqueteAdminUser.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAdminUserDao.class, "delete", int.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAdminUserDao.class, "updateDeleteFlag", int.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public EnqueteAdminUserDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<jp.co.isid.cit.entity.EnqueteAdminUser> selectByEsqId(java.lang.String id) {
        entering("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "selectByEsqId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteAdminUserDao/selectByEsqId.sql");
            __query.setEntityType(jp.co.isid.cit.entity._EnqueteAdminUser.getSingletonInternal());
            __query.addParameter("id", java.lang.String.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl");
            __query.setCallerMethodName("selectByEsqId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.entity.EnqueteAdminUser>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.entity.EnqueteAdminUser>(jp.co.isid.cit.entity._EnqueteAdminUser.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.entity.EnqueteAdminUser> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "selectByEsqId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "selectByEsqId", __e);
            throw __e;
        }
    }

    @Override
    public int insert(jp.co.isid.cit.entity.EnqueteAdminUser entity) {
        entering("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<jp.co.isid.cit.entity.EnqueteAdminUser> __query = getQueryImplementors().createAutoInsertQuery(__method1, jp.co.isid.cit.entity._EnqueteAdminUser.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(jp.co.isid.cit.entity.EnqueteAdminUser entity) {
        entering("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<jp.co.isid.cit.entity.EnqueteAdminUser> __query = getQueryImplementors().createAutoUpdateQuery(__method2, jp.co.isid.cit.entity._EnqueteAdminUser.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl");
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
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(int enqueteId) {
        entering("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "delete", enqueteId);
        try {
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteAdminUserDao/delete.sql");
            __query.addParameter("enqueteId", int.class, enqueteId);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int updateDeleteFlag(int enqueteId) {
        entering("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "updateDeleteFlag", enqueteId);
        try {
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteAdminUserDao/updateDeleteFlag.sql");
            __query.addParameter("enqueteId", int.class, enqueteId);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl");
            __query.setCallerMethodName("updateDeleteFlag");
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
            exiting("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "updateDeleteFlag", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAdminUserDaoImpl", "updateDeleteFlag", __e);
            throw __e;
        }
    }

}
