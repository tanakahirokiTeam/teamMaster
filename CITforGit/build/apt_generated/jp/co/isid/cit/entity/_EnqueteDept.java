package jp.co.isid.cit.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-18T22:41:01.651+0900")
public final class _EnqueteDept extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.isid.cit.entity.EnqueteDept> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final _EnqueteDept __singleton = new _EnqueteDept();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the enqueteId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteDept, java.lang.Integer, Object> $enqueteId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(jp.co.isid.cit.entity.EnqueteDept.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "enqueteId", "ENQUETE_ID", __namingType, false);

    /** the deptId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteDept, java.lang.Integer, Object> $deptId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(jp.co.isid.cit.entity.EnqueteDept.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "deptId", "DEPT_ID", __namingType, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.EnqueteDept>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?>> __entityPropertyTypeMap;

    private _EnqueteDept() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "EnqueteDept";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ENQUETE_DEPT";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($enqueteId);
        __list.add($enqueteId);
        __map.put("enqueteId", $enqueteId);
        __idList.add($deptId);
        __list.add($deptId);
        __map.put("deptId", $deptId);
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
    public void preInsert(jp.co.isid.cit.entity.EnqueteDept entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.isid.cit.entity.EnqueteDept> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.isid.cit.entity.EnqueteDept entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.isid.cit.entity.EnqueteDept> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.isid.cit.entity.EnqueteDept entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.isid.cit.entity.EnqueteDept> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.isid.cit.entity.EnqueteDept entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.isid.cit.entity.EnqueteDept> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.isid.cit.entity.EnqueteDept entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.isid.cit.entity.EnqueteDept> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.isid.cit.entity.EnqueteDept entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.isid.cit.entity.EnqueteDept> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteDept, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteDept, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteDept, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public jp.co.isid.cit.entity.EnqueteDept newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.isid.cit.entity.EnqueteDept, ?>> __args) {
        jp.co.isid.cit.entity.EnqueteDept entity = new jp.co.isid.cit.entity.EnqueteDept();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<jp.co.isid.cit.entity.EnqueteDept> getEntityClass() {
        return jp.co.isid.cit.entity.EnqueteDept.class;
    }

    @Override
    public jp.co.isid.cit.entity.EnqueteDept getOriginalStates(jp.co.isid.cit.entity.EnqueteDept __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.isid.cit.entity.EnqueteDept __entity) {
    }

    /**
     * @return the singleton
     */
    public static _EnqueteDept getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _EnqueteDept newInstance() {
        return new _EnqueteDept();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.EnqueteDept> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
