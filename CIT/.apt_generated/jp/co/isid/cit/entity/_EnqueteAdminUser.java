package jp.co.isid.cit.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T21:37:11.474+0900")
public final class _EnqueteAdminUser extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.isid.cit.entity.EnqueteAdminUser> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final _EnqueteAdminUser __singleton = new _EnqueteAdminUser();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the enqueteId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAdminUser, java.lang.Integer, Object> $enqueteId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(jp.co.isid.cit.entity.EnqueteAdminUser.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "enqueteId", "ENQUETE_ID", __namingType, false);

    /** the esqId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAdminUser, java.lang.String, Object> $esqId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(jp.co.isid.cit.entity.EnqueteAdminUser.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "esqId", "ESQ_ID", __namingType, false);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAdminUser, java.lang.Integer, Object> $deleteFlag = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.EnqueteAdminUser.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "deleteFlag", "DELETE_FLAG", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.EnqueteAdminUser>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> __entityPropertyTypeMap;

    private _EnqueteAdminUser() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "EnqueteAdminUser";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ENQUETE_ADMIN_USER";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> __list = new java.util.ArrayList<>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> __map = new java.util.HashMap<>(3);
        __idList.add($enqueteId);
        __list.add($enqueteId);
        __map.put("enqueteId", $enqueteId);
        __idList.add($esqId);
        __list.add($esqId);
        __map.put("esqId", $esqId);
        __list.add($deleteFlag);
        __map.put("deleteFlag", $deleteFlag);
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
    public void preInsert(jp.co.isid.cit.entity.EnqueteAdminUser entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.isid.cit.entity.EnqueteAdminUser> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.isid.cit.entity.EnqueteAdminUser entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.isid.cit.entity.EnqueteAdminUser> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.isid.cit.entity.EnqueteAdminUser entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.isid.cit.entity.EnqueteAdminUser> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.isid.cit.entity.EnqueteAdminUser entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.isid.cit.entity.EnqueteAdminUser> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.isid.cit.entity.EnqueteAdminUser entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.isid.cit.entity.EnqueteAdminUser> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.isid.cit.entity.EnqueteAdminUser entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.isid.cit.entity.EnqueteAdminUser> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAdminUser, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAdminUser, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public jp.co.isid.cit.entity.EnqueteAdminUser newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.isid.cit.entity.EnqueteAdminUser, ?>> __args) {
        jp.co.isid.cit.entity.EnqueteAdminUser entity = new jp.co.isid.cit.entity.EnqueteAdminUser();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<jp.co.isid.cit.entity.EnqueteAdminUser> getEntityClass() {
        return jp.co.isid.cit.entity.EnqueteAdminUser.class;
    }

    @Override
    public jp.co.isid.cit.entity.EnqueteAdminUser getOriginalStates(jp.co.isid.cit.entity.EnqueteAdminUser __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.isid.cit.entity.EnqueteAdminUser __entity) {
    }

    /**
     * @return the singleton
     */
    public static _EnqueteAdminUser getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _EnqueteAdminUser newInstance() {
        return new _EnqueteAdminUser();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.EnqueteAdminUser> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
