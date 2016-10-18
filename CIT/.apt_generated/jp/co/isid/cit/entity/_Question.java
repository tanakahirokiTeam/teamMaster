package jp.co.isid.cit.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.8.0" }, date = "2016-10-12T21:37:11.458+0900")
public final class _Question extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.isid.cit.entity.Question> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.8.0");
    }

    private static final _Question __singleton = new _Question();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("QUESTION_SEQ");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the questionId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, java.lang.Integer, Object> $questionId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(jp.co.isid.cit.entity.Question.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "questionId", "QUESTION_ID", __namingType, false, __idGenerator);

    /** the enqueteId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, java.lang.Integer, Object> $enqueteId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Question.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "enqueteId", "ENQUETE_ID", __namingType, true, true, false);

    /** the questionNumber */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, java.lang.Integer, Object> $questionNumber = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Question.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "questionNumber", "QUESTION_NUMBER", __namingType, true, true, false);

    /** the questionTypeId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, java.lang.Integer, Object> $questionTypeId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Question.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "questionTypeId", "QUESTION_TYPE_ID", __namingType, true, true, false);

    /** the requireFlag */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, java.lang.Integer, Object> $requireFlag = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Question.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "requireFlag", "REQUIRE_FLAG", __namingType, true, true, false);

    /** the questionText */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, java.lang.String, Object> $questionText = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Question.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "questionText", "QUESTION_TEXT", __namingType, true, true, false);

    /** the questionSubtext */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, java.lang.String, Object> $questionSubtext = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.isid.cit.entity.Question.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "questionSubtext", "QUESTION_SUBTEXT", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, java.lang.Long, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(jp.co.isid.cit.entity.Question.class,  java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "version", "VERSION", __namingType, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.Question>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?>> __entityPropertyTypeMap;

    private _Question() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Question";
        __catalogName = "";
        __schemaName = "";
        __tableName = "QUESTION";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?>> __list = new java.util.ArrayList<>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?>> __map = new java.util.HashMap<>(8);
        __idList.add($questionId);
        __list.add($questionId);
        __map.put("questionId", $questionId);
        __list.add($enqueteId);
        __map.put("enqueteId", $enqueteId);
        __list.add($questionNumber);
        __map.put("questionNumber", $questionNumber);
        __list.add($questionTypeId);
        __map.put("questionTypeId", $questionTypeId);
        __list.add($requireFlag);
        __map.put("requireFlag", $requireFlag);
        __list.add($questionText);
        __map.put("questionText", $questionText);
        __list.add($questionSubtext);
        __map.put("questionSubtext", $questionSubtext);
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
    public void preInsert(jp.co.isid.cit.entity.Question entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.isid.cit.entity.Question> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.isid.cit.entity.Question entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.isid.cit.entity.Question> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.isid.cit.entity.Question entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.isid.cit.entity.Question> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.isid.cit.entity.Question entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.isid.cit.entity.Question> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.isid.cit.entity.Question entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.isid.cit.entity.Question> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.isid.cit.entity.Question entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.isid.cit.entity.Question> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.isid.cit.entity.Question, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, ?, ?> getGeneratedIdPropertyType() {
        return $questionId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.isid.cit.entity.Question, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public jp.co.isid.cit.entity.Question newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.isid.cit.entity.Question, ?>> __args) {
        jp.co.isid.cit.entity.Question entity = new jp.co.isid.cit.entity.Question();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<jp.co.isid.cit.entity.Question> getEntityClass() {
        return jp.co.isid.cit.entity.Question.class;
    }

    @Override
    public jp.co.isid.cit.entity.Question getOriginalStates(jp.co.isid.cit.entity.Question __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.isid.cit.entity.Question __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Question getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Question newInstance() {
        return new _Question();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.isid.cit.entity.Question> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
