package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T21:37:12.309+0900")
public class UserDeptDtoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.UserDeptDtoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.UserDeptDtoDao.class, "selectById", java.lang.String.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.UserDeptDtoDao.class, "searchUser", java.lang.String.class, java.lang.String.class, int.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.UserDeptDtoDao.class, "selectAnsweredUserByEnqueteId", int.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.UserDeptDtoDao.class, "selectUnansweredUserByEnqueteId", int.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UserDeptDtoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public jp.co.isid.cit.dto.UserDeptDto selectById(java.lang.String id) {
        entering("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/UserDeptDtoDao/selectById.sql");
            __query.setEntityType(jp.co.isid.cit.dto._UserDeptDto.getSingletonInternal());
            __query.addParameter("id", java.lang.String.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.UserDeptDtoDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<jp.co.isid.cit.dto.UserDeptDto> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.isid.cit.dto.UserDeptDto>(jp.co.isid.cit.dto._UserDeptDto.getSingletonInternal()));
            jp.co.isid.cit.dto.UserDeptDto __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.isid.cit.dto.UserDeptDto> searchUser(java.lang.String esqId, java.lang.String userName, int deptId) {
        entering("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "searchUser", esqId, userName, deptId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/UserDeptDtoDao/searchUser.sql");
            __query.setEntityType(jp.co.isid.cit.dto._UserDeptDto.getSingletonInternal());
            __query.addParameter("esqId", java.lang.String.class, esqId);
            __query.addParameter("userName", java.lang.String.class, userName);
            __query.addParameter("deptId", int.class, deptId);
            __query.setCallerClassName("jp.co.isid.cit.dao.UserDeptDtoDaoImpl");
            __query.setCallerMethodName("searchUser");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.dto.UserDeptDto>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.dto.UserDeptDto>(jp.co.isid.cit.dto._UserDeptDto.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.dto.UserDeptDto> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "searchUser", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "searchUser", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.isid.cit.dto.UserDeptDto> selectAnsweredUserByEnqueteId(int id) {
        entering("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectAnsweredUserByEnqueteId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/UserDeptDtoDao/selectAnsweredUserByEnqueteId.sql");
            __query.setEntityType(jp.co.isid.cit.dto._UserDeptDto.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.UserDeptDtoDaoImpl");
            __query.setCallerMethodName("selectAnsweredUserByEnqueteId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.dto.UserDeptDto>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.dto.UserDeptDto>(jp.co.isid.cit.dto._UserDeptDto.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.dto.UserDeptDto> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectAnsweredUserByEnqueteId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectAnsweredUserByEnqueteId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.isid.cit.dto.UserDeptDto> selectUnansweredUserByEnqueteId(int id) {
        entering("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectUnansweredUserByEnqueteId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/UserDeptDtoDao/selectUnansweredUserByEnqueteId.sql");
            __query.setEntityType(jp.co.isid.cit.dto._UserDeptDto.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.UserDeptDtoDaoImpl");
            __query.setCallerMethodName("selectUnansweredUserByEnqueteId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.dto.UserDeptDto>> __command = getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.dto.UserDeptDto>(jp.co.isid.cit.dto._UserDeptDto.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.dto.UserDeptDto> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectUnansweredUserByEnqueteId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.UserDeptDtoDaoImpl", "selectUnansweredUserByEnqueteId", __e);
            throw __e;
        }
    }

}
