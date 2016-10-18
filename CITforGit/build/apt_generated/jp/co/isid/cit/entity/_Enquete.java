package jp.co.isid.cit.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-18T22:41:01.585+0900")
public final class _Enquete extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.isid.cit.entity.Enquete> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final _Enquete __singleton = new _Enquete();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("ENQUETE_SEQ");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the enqueteId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.lang.Integer, Object> $enqueteId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(jp.co.isid.cit.entity.Enquete.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "enqueteId", "ENQUETE_ID", __namingType, false, __idGenerator);

    /** the enqueteName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.lang.String, Object> $enqueteName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Enquete.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "enqueteName", "ENQUETE_NAME", __namingType, true, true, false);

    /** the enqueteStateId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.lang.Integer, Object> $enqueteStateId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Enquete.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "enqueteStateId", "ENQUETE_STATE_ID", __namingType, true, true, false);

    /** the createUserId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.lang.String, Object> $createUserId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Enquete.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "createUserId", "CREATE_USER_ID", __namingType, true, true, false);

    /** the createDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.util.Date, Object> $createDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Enquete.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "createDate", "CREATE_DATE", __namingType, true, true, false);

    /** the startDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.util.Date, Object> $startDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Enquete.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "startDate", "START_DATE", __namingType, true, true, false);

    /** the finishDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.util.Date, Object> $finishDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Enquete.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "finishDate", "FINISH_DATE", __namingType, true, true, false);

    /** the enqueteSubtext */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.lang.String, Object> $enqueteSubtext = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Enquete.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "enqueteSubtext", "ENQUETE_SUBTEXT", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, java.lang.Long, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(jp.co.isid.cit.entity.Enquete.class,  java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "version", "VERSION", __namingType, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.Enquete>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?>> __entityPropertyTypeMap;

    private _Enquete() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Enquete";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ENQUETE";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?>> __list = new java.util.ArrayList<>(9);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?>> __map = new java.util.HashMap<>(9);
        __idList.add($enqueteId);
        __list.add($enqueteId);
        __map.put("enqueteId", $enqueteId);
        __list.add($enqueteName);
        __map.put("enqueteName", $enqueteName);
        __list.add($enqueteStateId);
        __map.put("enqueteStateId", $enqueteStateId);
        __list.add($createUserId);
        __map.put("createUserId", $createUserId);
        __list.add($createDate);
        __map.put("createDate", $createDate);
        __list.add($startDate);
        __map.put("startDate", $startDate);
        __list.add($finishDate);
        __map.put("finishDate", $finishDate);
        __list.add($enqueteSubtext);
        __map.put("enqueteSubtext", $enqueteSubtext);
        __list.add($version);
        __map.put("version", $version);
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
    public void preInsert(jp.co.isid.cit.entity.Enquete entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.isid.cit.entity.Enquete> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.isid.cit.entity.Enquete entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.isid.cit.entity.Enquete> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.isid.cit.entity.Enquete entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.isid.cit.entity.Enquete> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.isid.cit.entity.Enquete entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.isid.cit.entity.Enquete> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.isid.cit.entity.Enquete entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.isid.cit.entity.Enquete> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.isid.cit.entity.Enquete entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.isid.cit.entity.Enquete> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Enquete, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, ?, ?> getGeneratedIdPropertyType() {
        return $enqueteId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.Enquete, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public jp.co.isid.cit.entity.Enquete newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.isid.cit.entity.Enquete, ?>> __args) {
        jp.co.isid.cit.entity.Enquete entity = new jp.co.isid.cit.entity.Enquete();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<jp.co.isid.cit.entity.Enquete> getEntityClass() {
        return jp.co.isid.cit.entity.Enquete.class;
    }

    @Override
    public jp.co.isid.cit.entity.Enquete getOriginalStates(jp.co.isid.cit.entity.Enquete __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.isid.cit.entity.Enquete __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Enquete getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Enquete newInstance() {
        return new _Enquete();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.Enquete> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
