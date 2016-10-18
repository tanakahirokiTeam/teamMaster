package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T22:52:14.168+0900")
public class EnqueteDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.EnqueteDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDao.class, "selectById", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDao.class, "selectLastInsert");

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDao.class, "insert", jp.co.isid.cit.entity.Enquete.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDao.class, "update", jp.co.isid.cit.entity.Enquete.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteDao.class, "delete", jp.co.isid.cit.entity.Enquete.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public EnqueteDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public jp.co.isid.cit.entity.Enquete selectById(java.lang.Integer id) {
        entering("jp.co.isid.cit.dao.EnqueteDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteDao/selectById.sql");
            __query.setEntityType(jp.co.isid.cit.entity._Enquete.getSingletonInternal());
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<jp.co.isid.cit.entity.Enquete> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.isid.cit.entity.Enquete>(jp.co.isid.cit.entity._Enquete.getSingletonInternal()));
            jp.co.isid.cit.entity.Enquete __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.lang.Integer selectLastInsert() {
        entering("jp.co.isid.cit.dao.EnqueteDaoImpl", "selectLastInsert");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteDao/selectLastInsert.sql");
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDaoImpl");
            __query.setCallerMethodName("selectLastInsert");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.lang.Integer> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, false));
            java.lang.Integer __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteDaoImpl", "selectLastInsert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDaoImpl", "selectLastInsert", __e);
            throw __e;
        }
    }

    @Override
    public int insert(jp.co.isid.cit.entity.Enquete entity) {
        entering("jp.co.isid.cit.dao.EnqueteDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<jp.co.isid.cit.entity.Enquete> __query = getQueryImplementors().createAutoInsertQuery(__method2, jp.co.isid.cit.entity._Enquete.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(jp.co.isid.cit.entity.Enquete entity) {
        entering("jp.co.isid.cit.dao.EnqueteDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<jp.co.isid.cit.entity.Enquete> __query = getQueryImplementors().createAutoUpdateQuery(__method3, jp.co.isid.cit.entity._Enquete.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDaoImpl");
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
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(jp.co.isid.cit.entity.Enquete entity) {
        entering("jp.co.isid.cit.dao.EnqueteDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<jp.co.isid.cit.entity.Enquete> __query = getQueryImplementors().createAutoDeleteQuery(__method4, jp.co.isid.cit.entity._Enquete.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
