/*
 * XML Type:  StatisticalClassificationRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StatisticalClassificationRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface StatisticalClassificationRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationrelationshipc305type");
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
     * Gets a List of "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification> getStatisticalClassificationRelationshipHasTargetStatisticalClassificationList();

    /**
     * Gets array of all "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification[] getStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray();

    /**
     * Gets ith "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification getStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray(int i);

    /**
     * Returns number of "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    int sizeOfStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray();

    /**
     * Sets array of all "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    void setStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification[] statisticalClassificationRelationshipHasTargetStatisticalClassificationArray);

    /**
     * Sets ith "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    void setStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification statisticalClassificationRelationshipHasTargetStatisticalClassification);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification insertNewStatisticalClassificationRelationshipHasTargetStatisticalClassification(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification addNewStatisticalClassificationRelationshipHasTargetStatisticalClassification();

    /**
     * Removes the ith "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    void removeStatisticalClassificationRelationshipHasTargetStatisticalClassification(int i);

    /**
     * Gets a List of "StatisticalClassificationRelationship_hasSource_StatisticalClassification" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification> getStatisticalClassificationRelationshipHasSourceStatisticalClassificationList();

    /**
     * Gets array of all "StatisticalClassificationRelationship_hasSource_StatisticalClassification" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification[] getStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray();

    /**
     * Gets ith "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification getStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray(int i);

    /**
     * Returns number of "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    int sizeOfStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray();

    /**
     * Sets array of all "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    void setStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification[] statisticalClassificationRelationshipHasSourceStatisticalClassificationArray);

    /**
     * Sets ith "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    void setStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification statisticalClassificationRelationshipHasSourceStatisticalClassification);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification insertNewStatisticalClassificationRelationshipHasSourceStatisticalClassification(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification addNewStatisticalClassificationRelationshipHasSourceStatisticalClassification();

    /**
     * Removes the ith "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    void removeStatisticalClassificationRelationshipHasSourceStatisticalClassification(int i);

    /**
     * An XML StatisticalClassificationRelationship_hasTarget_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationRelationshipHasTargetStatisticalClassification extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationrelationshiphastargetstatisticalclassification1558elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "isAssociationReference" attribute
         */
        boolean getIsAssociationReference();

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

        /**
         * True if has "isAssociationReference" attribute
         */
        boolean isSetIsAssociationReference();

        /**
         * Sets the "isAssociationReference" attribute
         */
        void setIsAssociationReference(boolean isAssociationReference);

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

        /**
         * Unsets the "isAssociationReference" attribute
         */
        void unsetIsAssociationReference();

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship$StatisticalClassificationRelationshipHasTargetStatisticalClassification$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype011aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STATISTICAL_CLASSIFICATION = Enum.forString("StatisticalClassification");

            int INT_STATISTICAL_CLASSIFICATION = Enum.INT_STATISTICAL_CLASSIFICATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship$StatisticalClassificationRelationshipHasTargetStatisticalClassification$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STATISTICAL_CLASSIFICATION
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

                static final int INT_STATISTICAL_CLASSIFICATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("StatisticalClassification", INT_STATISTICAL_CLASSIFICATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML StatisticalClassificationRelationship_hasSource_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationRelationshipHasSourceStatisticalClassification extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationrelationshiphassourcestatisticalclassification8662elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "isAssociationReference" attribute
         */
        boolean getIsAssociationReference();

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

        /**
         * True if has "isAssociationReference" attribute
         */
        boolean isSetIsAssociationReference();

        /**
         * Sets the "isAssociationReference" attribute
         */
        void setIsAssociationReference(boolean isAssociationReference);

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

        /**
         * Unsets the "isAssociationReference" attribute
         */
        void unsetIsAssociationReference();

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship$StatisticalClassificationRelationshipHasSourceStatisticalClassification$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype7224elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STATISTICAL_CLASSIFICATION = Enum.forString("StatisticalClassification");

            int INT_STATISTICAL_CLASSIFICATION = Enum.INT_STATISTICAL_CLASSIFICATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship$StatisticalClassificationRelationshipHasSourceStatisticalClassification$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STATISTICAL_CLASSIFICATION
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

                static final int INT_STATISTICAL_CLASSIFICATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("StatisticalClassification", INT_STATISTICAL_CLASSIFICATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
