/*
 * XML Type:  ClassificationItemRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ClassificationItemRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ClassificationItemRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "classificationitemrelationshipfb8ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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
     * Gets the "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics();

    /**
     * True if has "semantics" element
     */
    boolean isSetSemantics();

    /**
     * Sets the "semantics" element
     */
    void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics);

    /**
     * Appends and returns a new empty "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics();

    /**
     * Unsets the "semantics" element
     */
    void unsetSemantics();

    /**
     * Gets a List of "ClassificationItemRelationship_hasSource_ClassificationItem" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem> getClassificationItemRelationshipHasSourceClassificationItemList();

    /**
     * Gets array of all "ClassificationItemRelationship_hasSource_ClassificationItem" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem[] getClassificationItemRelationshipHasSourceClassificationItemArray();

    /**
     * Gets ith "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem getClassificationItemRelationshipHasSourceClassificationItemArray(int i);

    /**
     * Returns number of "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    int sizeOfClassificationItemRelationshipHasSourceClassificationItemArray();

    /**
     * Sets array of all "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    void setClassificationItemRelationshipHasSourceClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem[] classificationItemRelationshipHasSourceClassificationItemArray);

    /**
     * Sets ith "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    void setClassificationItemRelationshipHasSourceClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem classificationItemRelationshipHasSourceClassificationItem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem insertNewClassificationItemRelationshipHasSourceClassificationItem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem addNewClassificationItemRelationshipHasSourceClassificationItem();

    /**
     * Removes the ith "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    void removeClassificationItemRelationshipHasSourceClassificationItem(int i);

    /**
     * Gets a List of "ClassificationItemRelationship_hasTarget_ClassificationItem" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem> getClassificationItemRelationshipHasTargetClassificationItemList();

    /**
     * Gets array of all "ClassificationItemRelationship_hasTarget_ClassificationItem" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem[] getClassificationItemRelationshipHasTargetClassificationItemArray();

    /**
     * Gets ith "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem getClassificationItemRelationshipHasTargetClassificationItemArray(int i);

    /**
     * Returns number of "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    int sizeOfClassificationItemRelationshipHasTargetClassificationItemArray();

    /**
     * Sets array of all "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    void setClassificationItemRelationshipHasTargetClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem[] classificationItemRelationshipHasTargetClassificationItemArray);

    /**
     * Sets ith "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    void setClassificationItemRelationshipHasTargetClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem classificationItemRelationshipHasTargetClassificationItem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem insertNewClassificationItemRelationshipHasTargetClassificationItem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem addNewClassificationItemRelationshipHasTargetClassificationItem();

    /**
     * Removes the ith "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    void removeClassificationItemRelationshipHasTargetClassificationItem(int i);

    /**
     * An XML ClassificationItemRelationship_hasSource_ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationItemRelationshipHasSourceClassificationItem extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "classificationitemrelationshiphassourceclassificationitem3272elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship$ClassificationItemRelationshipHasSourceClassificationItem$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype3170elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_ITEM = Enum.forString("ClassificationItem");

            int INT_CLASSIFICATION_ITEM = Enum.INT_CLASSIFICATION_ITEM;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship$ClassificationItemRelationshipHasSourceClassificationItem$ValidType.
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
     * An XML ClassificationItemRelationship_hasTarget_ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationItemRelationshipHasTargetClassificationItem extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "classificationitemrelationshiphastargetclassificationitem87e8elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship$ClassificationItemRelationshipHasTargetClassificationItem$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype86e6elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_ITEM = Enum.forString("ClassificationItem");

            int INT_CLASSIFICATION_ITEM = Enum.INT_CLASSIFICATION_ITEM;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship$ClassificationItemRelationshipHasTargetClassificationItem$ValidType.
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
}
