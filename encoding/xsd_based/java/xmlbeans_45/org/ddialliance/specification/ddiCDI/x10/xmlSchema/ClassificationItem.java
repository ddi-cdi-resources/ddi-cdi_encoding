/*
 * XML Type:  ClassificationItem
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ClassificationItem extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationitem0837type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "changeFromPreviousVersion" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getChangeFromPreviousVersion();

    /**
     * True if has "changeFromPreviousVersion" element
     */
    boolean isSetChangeFromPreviousVersion();

    /**
     * Sets the "changeFromPreviousVersion" element
     */
    void setChangeFromPreviousVersion(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString changeFromPreviousVersion);

    /**
     * Appends and returns a new empty "changeFromPreviousVersion" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewChangeFromPreviousVersion();

    /**
     * Unsets the "changeFromPreviousVersion" element
     */
    void unsetChangeFromPreviousVersion();

    /**
     * Gets the "changeLog" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getChangeLog();

    /**
     * True if has "changeLog" element
     */
    boolean isSetChangeLog();

    /**
     * Sets the "changeLog" element
     */
    void setChangeLog(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString changeLog);

    /**
     * Appends and returns a new empty "changeLog" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewChangeLog();

    /**
     * Unsets the "changeLog" element
     */
    void unsetChangeLog();

    /**
     * Gets a List of "explanatoryNotes" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getExplanatoryNotesList();

    /**
     * Gets array of all "explanatoryNotes" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getExplanatoryNotesArray();

    /**
     * Gets ith "explanatoryNotes" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getExplanatoryNotesArray(int i);

    /**
     * Returns number of "explanatoryNotes" element
     */
    int sizeOfExplanatoryNotesArray();

    /**
     * Sets array of all "explanatoryNotes" element
     */
    void setExplanatoryNotesArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] explanatoryNotesArray);

    /**
     * Sets ith "explanatoryNotes" element
     */
    void setExplanatoryNotesArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString explanatoryNotes);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "explanatoryNotes" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewExplanatoryNotes(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "explanatoryNotes" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewExplanatoryNotes();

    /**
     * Removes the ith "explanatoryNotes" element
     */
    void removeExplanatoryNotes(int i);

    /**
     * Gets a List of "futureNotes" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getFutureNotesList();

    /**
     * Gets array of all "futureNotes" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getFutureNotesArray();

    /**
     * Gets ith "futureNotes" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getFutureNotesArray(int i);

    /**
     * Returns number of "futureNotes" element
     */
    int sizeOfFutureNotesArray();

    /**
     * Sets array of all "futureNotes" element
     */
    void setFutureNotesArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] futureNotesArray);

    /**
     * Sets ith "futureNotes" element
     */
    void setFutureNotesArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString futureNotes);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "futureNotes" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewFutureNotes(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "futureNotes" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewFutureNotes();

    /**
     * Removes the ith "futureNotes" element
     */
    void removeFutureNotes(int i);

    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

    /**
     * Gets the "isGenerated" element
     */
    boolean getIsGenerated();

    /**
     * Gets (as xml) the "isGenerated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsGenerated();

    /**
     * True if has "isGenerated" element
     */
    boolean isSetIsGenerated();

    /**
     * Sets the "isGenerated" element
     */
    void setIsGenerated(boolean isGenerated);

    /**
     * Sets (as xml) the "isGenerated" element
     */
    void xsetIsGenerated(org.apache.xmlbeans.XmlBoolean isGenerated);

    /**
     * Unsets the "isGenerated" element
     */
    void unsetIsGenerated();

    /**
     * Gets the "isValid" element
     */
    boolean getIsValid();

    /**
     * Gets (as xml) the "isValid" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsValid();

    /**
     * True if has "isValid" element
     */
    boolean isSetIsValid();

    /**
     * Sets the "isValid" element
     */
    void setIsValid(boolean isValid);

    /**
     * Sets (as xml) the "isValid" element
     */
    void xsetIsValid(org.apache.xmlbeans.XmlBoolean isValid);

    /**
     * Unsets the "isValid" element
     */
    void unsetIsValid();

    /**
     * Gets a List of "name" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList();

    /**
     * Gets array of all "name" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray();

    /**
     * Gets ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i);

    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();

    /**
     * Sets array of all "name" element
     */
    void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray);

    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName();

    /**
     * Removes the ith "name" element
     */
    void removeName(int i);

    /**
     * Gets the "validDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getValidDates();

    /**
     * True if has "validDates" element
     */
    boolean isSetValidDates();

    /**
     * Sets the "validDates" element
     */
    void setValidDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange validDates);

    /**
     * Appends and returns a new empty "validDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewValidDates();

    /**
     * Unsets the "validDates" element
     */
    void unsetValidDates();

    /**
     * Gets a List of "ClassificationItem_excludes_ClassificationItem" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem> getClassificationItemExcludesClassificationItemList();

    /**
     * Gets array of all "ClassificationItem_excludes_ClassificationItem" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem[] getClassificationItemExcludesClassificationItemArray();

    /**
     * Gets ith "ClassificationItem_excludes_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem getClassificationItemExcludesClassificationItemArray(int i);

    /**
     * Returns number of "ClassificationItem_excludes_ClassificationItem" element
     */
    int sizeOfClassificationItemExcludesClassificationItemArray();

    /**
     * Sets array of all "ClassificationItem_excludes_ClassificationItem" element
     */
    void setClassificationItemExcludesClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem[] classificationItemExcludesClassificationItemArray);

    /**
     * Sets ith "ClassificationItem_excludes_ClassificationItem" element
     */
    void setClassificationItemExcludesClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem classificationItemExcludesClassificationItem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItem_excludes_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem insertNewClassificationItemExcludesClassificationItem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItem_excludes_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem addNewClassificationItemExcludesClassificationItem();

    /**
     * Removes the ith "ClassificationItem_excludes_ClassificationItem" element
     */
    void removeClassificationItemExcludesClassificationItem(int i);

    /**
     * Gets the "ClassificationItem_denotes_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemDenotesCategory getClassificationItemDenotesCategory();

    /**
     * Sets the "ClassificationItem_denotes_Category" element
     */
    void setClassificationItemDenotesCategory(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemDenotesCategory classificationItemDenotesCategory);

    /**
     * Appends and returns a new empty "ClassificationItem_denotes_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemDenotesCategory addNewClassificationItemDenotesCategory();

    /**
     * Gets the "ClassificationItem_uses_Notation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemUsesNotation getClassificationItemUsesNotation();

    /**
     * Sets the "ClassificationItem_uses_Notation" element
     */
    void setClassificationItemUsesNotation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemUsesNotation classificationItemUsesNotation);

    /**
     * Appends and returns a new empty "ClassificationItem_uses_Notation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemUsesNotation addNewClassificationItemUsesNotation();

    /**
     * Gets a List of "ClassificationItem_hasRulingBy_AuthorizationSource" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource> getClassificationItemHasRulingByAuthorizationSourceList();

    /**
     * Gets array of all "ClassificationItem_hasRulingBy_AuthorizationSource" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource[] getClassificationItemHasRulingByAuthorizationSourceArray();

    /**
     * Gets ith "ClassificationItem_hasRulingBy_AuthorizationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource getClassificationItemHasRulingByAuthorizationSourceArray(int i);

    /**
     * Returns number of "ClassificationItem_hasRulingBy_AuthorizationSource" element
     */
    int sizeOfClassificationItemHasRulingByAuthorizationSourceArray();

    /**
     * Sets array of all "ClassificationItem_hasRulingBy_AuthorizationSource" element
     */
    void setClassificationItemHasRulingByAuthorizationSourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource[] classificationItemHasRulingByAuthorizationSourceArray);

    /**
     * Sets ith "ClassificationItem_hasRulingBy_AuthorizationSource" element
     */
    void setClassificationItemHasRulingByAuthorizationSourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource classificationItemHasRulingByAuthorizationSource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItem_hasRulingBy_AuthorizationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource insertNewClassificationItemHasRulingByAuthorizationSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItem_hasRulingBy_AuthorizationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource addNewClassificationItemHasRulingByAuthorizationSource();

    /**
     * Removes the ith "ClassificationItem_hasRulingBy_AuthorizationSource" element
     */
    void removeClassificationItemHasRulingByAuthorizationSource(int i);

    /**
     * An XML ClassificationItem_excludes_ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationItemExcludesClassificationItem extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationitemexcludesclassificationitema4e2elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem$ClassificationItemExcludesClassificationItem$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemExcludesClassificationItem.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypef424elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_ITEM = Enum.forString("ClassificationItem");

            int INT_CLASSIFICATION_ITEM = Enum.INT_CLASSIFICATION_ITEM;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem$ClassificationItemExcludesClassificationItem$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CLASSIFICATION_ITEM
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_CLASSIFICATION_ITEM = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ClassificationItem", INT_CLASSIFICATION_ITEM),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ClassificationItem_denotes_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationItemDenotesCategory extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemDenotesCategory> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationitemdenotescategory54c8elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem$ClassificationItemDenotesCategory$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemDenotesCategory.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypefac6elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");

            int INT_CATEGORY = Enum.INT_CATEGORY;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem$ClassificationItemDenotesCategory$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CATEGORY
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_CATEGORY = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Category", INT_CATEGORY),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ClassificationItem_uses_Notation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationItemUsesNotation extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemUsesNotation> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationitemusesnotation354celemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem$ClassificationItemUsesNotation$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemUsesNotation.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype800eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum NOTATION = Enum.forString("Notation");

            int INT_NOTATION = Enum.INT_NOTATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem$ClassificationItemUsesNotation$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_NOTATION
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_NOTATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Notation", INT_NOTATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ClassificationItem_hasRulingBy_AuthorizationSource(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationItemHasRulingByAuthorizationSource extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationitemhasrulingbyauthorizationsource1482elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem$ClassificationItemHasRulingByAuthorizationSource$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypef2c4elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AUTHORIZATION_SOURCE = Enum.forString("AuthorizationSource");

            int INT_AUTHORIZATION_SOURCE = Enum.INT_AUTHORIZATION_SOURCE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem$ClassificationItemHasRulingByAuthorizationSource$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AUTHORIZATION_SOURCE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_AUTHORIZATION_SOURCE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("AuthorizationSource", INT_AUTHORIZATION_SOURCE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
