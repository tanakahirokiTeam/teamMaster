package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T22:52:14.196+0900")
public class EnqueteDeptDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.EnqueteDeptDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDeptDao.class, "selectByDeptId", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDeptDao.class, "insert", jp.co.isid.cit.entity.EnqueteDept.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDeptDao.class, "delete", jp.co.isid.cit.entity.EnqueteDept.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDeptDao.class, "deleteByEnqueteId", int.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public EnqueteDeptDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<jp.co.isid.cit.entity.EnqueteDept> selectByDeptId(java.lang.Integer id) {
        entering("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "selectByDeptId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteDeptDao/selectByDeptId.sql");
            __query.setEntityType(jp.co.isid.cit.entity._EnqueteDept.getSingletonInternal());
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDeptDaoImpl");
            __query.setCallerMethodName("selectByDeptId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.entity.EnqueteDept>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.entity.EnqueteDept>(jp.co.isid.cit.entity._EnqueteDept.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.entity.EnqueteDept> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "selectByDeptId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "selectByDeptId", __e);
            throw __e;
        }
    }

    @Override
    public int insert(jp.co.isid.cit.entity.EnqueteDept entity) {
        entering("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<jp.co.isid.cit.entity.EnqueteDept> __query = getQueryImplementors().createAutoInsertQuery(__method1, jp.co.isid.cit.entity._EnqueteDept.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDeptDaoImpl");
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
            exiting("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int delete(jp.co.isid.cit.entity.EnqueteDept entity) {
        entering("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<jp.co.isid.cit.entity.EnqueteDept> __query = getQueryImplementors().createAutoDeleteQuery(__method2, jp.co.isid.cit.entity._EnqueteDept.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDeptDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int deleteByEnqueteId(int enqueteId) {
        entering("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "deleteByEnqueteId", enqueteId);
        try {
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteDeptDao/deleteByEnqueteId.sql");
            __query.addParameter("enqueteId", int.class, enqueteId);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDeptDaoImpl");
            __query.setCallerMethodName("deleteByEnqueteId");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "deleteByEnqueteId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDeptDaoImpl", "deleteByEnqueteId", __e);
            throw __e;
        }
    }

}
