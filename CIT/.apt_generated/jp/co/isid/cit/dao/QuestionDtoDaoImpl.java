package jp.co.isid.cit.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T21:37:12.815+0900")
public class QuestionDtoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.isid.cit.dao.QuestionDtoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionDtoDao.class, "selectById", int.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(jp.co.isid.cit.dao.QuestionDtoDao.class, "selectByEnqueteId", int.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public QuestionDtoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public jp.co.isid.cit.dto.QuestionDto selectById(int id) {
        entering("jp.co.isid.cit.dao.QuestionDtoDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/QuestionDtoDao/selectById.sql");
            __query.setEntityType(jp.co.isid.cit.dto._QuestionDto.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionDtoDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<jp.co.isid.cit.dto.QuestionDto> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.isid.cit.dto.QuestionDto>(jp.co.isid.cit.dto._QuestionDto.getSingletonInternal()));
            jp.co.isid.cit.dto.QuestionDto __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionDtoDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionDtoDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.isid.cit.dto.QuestionDto> selectByEnqueteId(int id) {
        entering("jp.co.isid.cit.dao.QuestionDtoDaoImpl", "selectByEnqueteId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/jp/co/isid/cit/dao/QuestionDtoDao/selectByEnqueteId.sql");
            __query.setEntityType(jp.co.isid.cit.dto._QuestionDto.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("jp.co.isid.cit.dao.QuestionDtoDaoImpl");
            __query.setCallerMethodName("selectByEnqueteId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<jp.co.isid.cit.dto.QuestionDto>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.isid.cit.dto.QuestionDto>(jp.co.isid.cit.dto._QuestionDto.getSingletonInternal()));
            java.util.List<jp.co.isid.cit.dto.QuestionDto> __result = __command.execute();
            __query.complete();
            exiting("jp.co.isid.cit.dao.QuestionDtoDaoImpl", "selectByEnqueteId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.isid.cit.dao.QuestionDtoDaoImpl", "selectByEnqueteId", __e);
            throw __e;
        }
    }

}
