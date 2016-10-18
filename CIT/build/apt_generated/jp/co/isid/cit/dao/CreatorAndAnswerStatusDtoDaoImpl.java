package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T22:52:14.007+0900")
public class CreatorAndAnswerStatusDtoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.CreatorAndAnswerStatusDtoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.CreatorAndAnswerStatusDtoDao.class, "selectById", int.class, java.lang.String.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public CreatorAndAnswerStatusDtoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<jp.co.isid.cit.dto.CreatorAndAnswerStatusDto> selectById(int deptId, java.lang.String esqId) {
        entering("jp.co.isid.cit.dao.CreatorAndAnswerStatusDtoDaoImpl", "selectById", deptId, esqId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/CreatorAndAnswerStatusDtoDao/selectById.sql");
            __query.setEntityType(jp.co.isid.cit.dto._CreatorAndAnswerStatusDto.getSingletonInternal());
            __query.addParameter("deptId", int.class, deptId);
            __query.addParameter("esqId", java.lang.String.class, esqId);
            __query.setCallerClassName("jp.co.isid.cit.dao.CreatorAndAnswerStatusDtoDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.dto.CreatorAndAnswerStatusDto>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.dto.CreatorAndAnswerStatusDto>(jp.co.isid.cit.dto._CreatorAndAnswerStatusDto.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.dto.CreatorAndAnswerStatusDto> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.CreatorAndAnswerStatusDtoDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.CreatorAndAnswerStatusDtoDaoImpl", "selectById", __e);
            throw __e;
        }
    }

}
