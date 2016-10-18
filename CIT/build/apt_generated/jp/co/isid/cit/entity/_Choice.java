package jp.co.isid.cit.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T22:52:13.450+0900")
public final class _Choice extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.isid.cit.entity.Choice> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final _Choice __singleton = new _Choice();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("CHOICE_SEQ");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the choiceId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.Choice, java.lang.Integer, Object> $choiceId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(jp.co.isid.cit.entity.Choice.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "choiceId", "CHOICE_ID", __namingType, false, __idGenerator);

    /** the questionId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Choice, java.lang.Integer, Object> $questionId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Choice.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "questionId", "QUESTION_ID", __namingType, true, true, false);

    /** the choiceNumber */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Choice, java.lang.Integer, Object> $choiceNumber = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Choice.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "choiceNumber", "CHOICE_NUMBER", __namingType, true, true, false);

    /** the choiceText */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Choice, java.lang.String, Object> $choiceText = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Choice.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "choiceText", "CHOICE_TEXT", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.Choice, java.lang.Long, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(jp.co.isid.cit.entity.Choice.class,  java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "version", "VERSION", __namingType, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.Choice>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?>> __entityPropertyTypeMap;

    private _Choice() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Choice";
        __catalogName = "";
        __schemaName = "";
        __tableName = "CHOICE";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?>> __map = new java.util.HashMap<>(5);
        __idList.add($choiceId);
        __list.add($choiceId);
        __map.put("choiceId", $choiceId);
        __list.add($questionId);
        __map.put("questionId", $questionId);
        __list.add($choiceNumber);
        __map.put("choiceNumber", $choiceNumber);
        __list.add($choiceText);
        __map.put("choiceText", $choiceText);
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
    public void preInsert(jp.co.isid.cit.entity.Choice entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.isid.cit.entity.Choice> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.isid.cit.entity.Choice entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.isid.cit.entity.Choice> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.isid.cit.entity.Choice entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.isid.cit.entity.Choice> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.isid.cit.entity.Choice entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.isid.cit.entity.Choice> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.isid.cit.entity.Choice entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.isid.cit.entity.Choice> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.isid.cit.entity.Choice entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.isid.cit.entity.Choice> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Choice, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.Choice, ?, ?> getGeneratedIdPropertyType() {
        return $choiceId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.Choice, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public jp.co.isid.cit.entity.Choice newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.isid.cit.entity.Choice, ?>> __args) {
        jp.co.isid.cit.entity.Choice entity = new jp.co.isid.cit.entity.Choice();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<jp.co.isid.cit.entity.Choice> getEntityClass() {
        return jp.co.isid.cit.entity.Choice.class;
    }

    @Override
    public jp.co.isid.cit.entity.Choice getOriginalStates(jp.co.isid.cit.entity.Choice __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.isid.cit.entity.Choice __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Choice getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Choice newInstance() {
        return new _Choice();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.Choice> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
