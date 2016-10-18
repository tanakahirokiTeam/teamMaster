package jp.co.isid.cit.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-18T22:42:49.454+0900")
public final class _UserDeptDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.isid.cit.dto.UserDeptDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final _UserDeptDto __singleton = new _UserDeptDto();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the esqId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<jp.co.isid.cit.entity.EsqUser, jp.co.isid.cit.dto.UserDeptDto, java.lang.String, Object> $esqId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(jp.co.isid.cit.dto.UserDeptDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), jp.co.isid.cit.entity._EsqUser.getSingletonInternal().$esqId, null, "esqId", "ESQ_ID", __namingType, false);

    /** the deptId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.isid.cit.entity.EsqUser, jp.co.isid.cit.dto.UserDeptDto, java.lang.Integer, Object> $deptId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.dto.UserDeptDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), jp.co.isid.cit.entity._EsqUser.getSingletonInternal().$deptId, null, "deptId", "DEPT_ID", __namingType, true, true, false);

    /** the userName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.isid.cit.entity.EsqUser, jp.co.isid.cit.dto.UserDeptDto, java.lang.String, Object> $userName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.dto.UserDeptDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), jp.co.isid.cit.entity._EsqUser.getSingletonInternal().$userName, null, "userName", "USER_NAME", __namingType, true, true, false);

    /** the password */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<jp.co.isid.cit.entity.EsqUser, jp.co.isid.cit.dto.UserDeptDto, java.lang.String, Object> $password = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.dto.UserDeptDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), jp.co.isid.cit.entity._EsqUser.getSingletonInternal().$password, null, "password", "PASSWORD", __namingType, true, true, false);

    /** the deptName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.dto.UserDeptDto, java.lang.String, Object> $deptName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.dto.UserDeptDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "deptName", "DEPT_NAME", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.dto.UserDeptDto>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?>> __entityPropertyTypeMap;

    private _UserDeptDto() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "UserDeptDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?>> __map = new java.util.HashMap<>(5);
        __idList.add($esqId);
        __list.add($esqId);
        __map.put("esqId", $esqId);
        __list.add($deptId);
        __map.put("deptId", $deptId);
        __list.add($userName);
        __map.put("userName", $userName);
        __list.add($password);
        __map.put("password", $password);
        __list.add($deptName);
        __map.put("deptName", $deptName);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(jp.co.isid.cit.dto.UserDeptDto entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.isid.cit.dto.UserDeptDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.isid.cit.dto.UserDeptDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.isid.cit.dto.UserDeptDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.isid.cit.dto.UserDeptDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.isid.cit.dto.UserDeptDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.isid.cit.dto.UserDeptDto entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.isid.cit.dto.UserDeptDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.isid.cit.dto.UserDeptDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.isid.cit.dto.UserDeptDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.isid.cit.dto.UserDeptDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.isid.cit.dto.UserDeptDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.dto.UserDeptDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.dto.UserDeptDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.dto.UserDeptDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public jp.co.isid.cit.dto.UserDeptDto newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.isid.cit.dto.UserDeptDto, ?>> __args) {
        jp.co.isid.cit.dto.UserDeptDto entity = new jp.co.isid.cit.dto.UserDeptDto();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<jp.co.isid.cit.dto.UserDeptDto> getEntityClass() {
        return jp.co.isid.cit.dto.UserDeptDto.class;
    }

    @Override
    public jp.co.isid.cit.dto.UserDeptDto getOriginalStates(jp.co.isid.cit.dto.UserDeptDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.isid.cit.dto.UserDeptDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _UserDeptDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _UserDeptDto newInstance() {
        return new _UserDeptDto();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.dto.UserDeptDto> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
