package jp.co.isid.cit.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T22:52:13.568+0900")
public final class _EnqueteAnswer extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.isid.cit.entity.EnqueteAnswer> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final _EnqueteAnswer __singleton = new _EnqueteAnswer();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("ENQUETE_ANSWER_SEQ");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the enqueteAnswerId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAnswer, java.lang.Integer, Object> $enqueteAnswerId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(jp.co.isid.cit.entity.EnqueteAnswer.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "enqueteAnswerId", "ENQUETE_ANSWER_ID", __namingType, false, __idGenerator);

    /** the enqueteId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAnswer, java.lang.Integer, Object> $enqueteId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.EnqueteAnswer.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "enqueteId", "ENQUETE_ID", __namingType, true, true, false);

    /** the esqId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAnswer, java.lang.String, Object> $esqId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.EnqueteAnswer.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "esqId", "ESQ_ID", __namingType, true, true, false);

    /** the answerDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAnswer, java.time.LocalDate, Object> $answerDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.EnqueteAnswer.class, java.time.LocalDate.class, java.time.LocalDate.class, () -> new org.seasar.doma.wrapper.LocalDateWrapper(), null, null, "answerDate", "ANSWER_DATE", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.EnqueteAnswer>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?>> __entityPropertyTypeMap;

    private _EnqueteAnswer() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "EnqueteAnswer";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ENQUETE_ANSWER";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?>> __map = new java.util.HashMap<>(4);
        __idList.add($enqueteAnswerId);
        __list.add($enqueteAnswerId);
        __map.put("enqueteAnswerId", $enqueteAnswerId);
        __list.add($enqueteId);
        __map.put("enqueteId", $enqueteId);
        __list.add($esqId);
        __map.put("esqId", $esqId);
        __list.add($answerDate);
        __map.put("answerDate", $answerDate);
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
    public void preInsert(jp.co.isid.cit.entity.EnqueteAnswer entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.isid.cit.entity.EnqueteAnswer> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.isid.cit.entity.EnqueteAnswer entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.isid.cit.entity.EnqueteAnswer> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.isid.cit.entity.EnqueteAnswer entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.isid.cit.entity.EnqueteAnswer> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.isid.cit.entity.EnqueteAnswer entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.isid.cit.entity.EnqueteAnswer> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.isid.cit.entity.EnqueteAnswer entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.isid.cit.entity.EnqueteAnswer> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.isid.cit.entity.EnqueteAnswer entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.isid.cit.entity.EnqueteAnswer> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.EnqueteAnswer, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAnswer, ?, ?> getGeneratedIdPropertyType() {
        return $enqueteAnswerId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.EnqueteAnswer, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public jp.co.isid.cit.entity.EnqueteAnswer newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.isid.cit.entity.EnqueteAnswer, ?>> __args) {
        jp.co.isid.cit.entity.EnqueteAnswer entity = new jp.co.isid.cit.entity.EnqueteAnswer();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<jp.co.isid.cit.entity.EnqueteAnswer> getEntityClass() {
        return jp.co.isid.cit.entity.EnqueteAnswer.class;
    }

    @Override
    public jp.co.isid.cit.entity.EnqueteAnswer getOriginalStates(jp.co.isid.cit.entity.EnqueteAnswer __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.isid.cit.entity.EnqueteAnswer __entity) {
    }

    /**
     * @return the singleton
     */
    public static _EnqueteAnswer getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _EnqueteAnswer newInstance() {
        return new _EnqueteAnswer();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.EnqueteAnswer> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
