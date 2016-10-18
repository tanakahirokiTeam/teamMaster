package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-18T22:42:49.581+0900")
public class EnqueteAnswerUserDtoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.EnqueteAnswerUserDtoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAnswerUserDtoDao.class, "selectById", java.lang.String.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.EnqueteAnswerUserDtoDao.class, "countByEnqueteDeptId", int.class, int.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public EnqueteAnswerUserDtoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public jp.co.isid.cit.dto.EnqueteAnswerUserDto selectById(java.lang.String id) {
        entering("jp.co.isid.cit.dao.EnqueteAnswerUserDtoDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteAnswerUserDtoDao/selectById.sql");
            __query.setEntityType(jp.co.isid.cit.dto._EnqueteAnswerUserDto.getSingletonInternal());
            __query.addParameter("id", java.lang.String.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAnswerUserDtoDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<jp.co.isid.cit.dto.EnqueteAnswerUserDto> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.isid.cit.dto.EnqueteAnswerUserDto>(jp.co.isid.cit.dto._EnqueteAnswerUserDto.getSingletonInternal()));
            jp.co.isid.cit.dto.EnqueteAnswerUserDto __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAnswerUserDtoDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAnswerUserDtoDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int countByEnqueteDeptId(int enqueteId, int deptId) {
        entering("jp.co.isid.cit.dao.EnqueteAnswerUserDtoDaoImpl", "countByEnqueteDeptId", enqueteId, deptId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/EnqueteAnswerUserDtoDao/countByEnqueteDeptId.sql");
            __query.addParameter("enqueteId", int.class, enqueteId);
            __query.addParameter("deptId", int.class, deptId);
            __query.setCallerClassName("jp.co.isid.cit.dao.EnqueteAnswerUserDtoDaoImpl");
            __query.setCallerMethodName("countByEnqueteDeptId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.lang.Integer> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new, true));
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.EnqueteAnswerUserDtoDaoImpl", "countByEnqueteDeptId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.EnqueteAnswerUserDtoDaoImpl", "countByEnqueteDeptId", __e);
            throw __e;
        }
    }

}
