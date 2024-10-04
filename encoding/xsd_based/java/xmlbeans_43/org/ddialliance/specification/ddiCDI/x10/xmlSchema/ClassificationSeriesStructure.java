/*
 * XML Type:  ClassificationSeriesStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ClassificationSeriesStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ClassificationSeriesStructure extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "classificationseriesstructurec962type");
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
     * Gets the "purpose" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurpose();

    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();

    /**
     * Sets the "purpose" element
     */
    void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose);

    /**
     * Appends and returns a new empty "purpose" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose();

    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();

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
     * Gets the "specification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification getSpecification();

    /**
     * True if has "specification" element
     */
    boolean isSetSpecification();

    /**
     * Sets the "specification" element
     */
    void setSpecification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification specification);

    /**
     * Appends and returns a new empty "specification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification addNewSpecification();

    /**
     * Unsets the "specification" element
     */
    void unsetSpecification();

    /**
     * Gets the "topology" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTopology();

    /**
     * True if has "topology" element
     */
    boolean isSetTopology();

    /**
     * Sets the "topology" element
     */
    void setTopology(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry topology);

    /**
     * Appends and returns a new empty "topology" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTopology();

    /**
     * Unsets the "topology" element
     */
    void unsetTopology();

    /**
     * Gets the "totality" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum getTotality();

    /**
     * Gets (as xml) the "totality" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent xgetTotality();

    /**
     * True if has "totality" element
     */
    boolean isSetTotality();

    /**
     * Sets the "totality" element
     */
    void setTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum totality);

    /**
     * Sets (as xml) the "totality" element
     */
    void xsetTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent totality);

    /**
     * Unsets the "totality" element
     */
    void unsetTotality();

    /**
     * Gets the "ClassificationSeriesStructure_structures_ClassificationSeries" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureStructuresClassificationSeries getClassificationSeriesStructureStructuresClassificationSeries();

    /**
     * True if has "ClassificationSeriesStructure_structures_ClassificationSeries" element
     */
    boolean isSetClassificationSeriesStructureStructuresClassificationSeries();

    /**
     * Sets the "ClassificationSeriesStructure_structures_ClassificationSeries" element
     */
    void setClassificationSeriesStructureStructuresClassificationSeries(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureStructuresClassificationSeries classificationSeriesStructureStructuresClassificationSeries);

    /**
     * Appends and returns a new empty "ClassificationSeriesStructure_structures_ClassificationSeries" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureStructuresClassificationSeries addNewClassificationSeriesStructureStructuresClassificationSeries();

    /**
     * Unsets the "ClassificationSeriesStructure_structures_ClassificationSeries" element
     */
    void unsetClassificationSeriesStructureStructuresClassificationSeries();

    /**
     * Gets a List of "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship> getClassificationSeriesStructureHasStatisticalClassificationRelationshipList();

    /**
     * Gets array of all "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship[] getClassificationSeriesStructureHasStatisticalClassificationRelationshipArray();

    /**
     * Gets ith "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship getClassificationSeriesStructureHasStatisticalClassificationRelationshipArray(int i);

    /**
     * Returns number of "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" element
     */
    int sizeOfClassificationSeriesStructureHasStatisticalClassificationRelationshipArray();

    /**
     * Sets array of all "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" element
     */
    void setClassificationSeriesStructureHasStatisticalClassificationRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship[] classificationSeriesStructureHasStatisticalClassificationRelationshipArray);

    /**
     * Sets ith "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" element
     */
    void setClassificationSeriesStructureHasStatisticalClassificationRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship classificationSeriesStructureHasStatisticalClassificationRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship insertNewClassificationSeriesStructureHasStatisticalClassificationRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship addNewClassificationSeriesStructureHasStatisticalClassificationRelationship();

    /**
     * Removes the ith "ClassificationSeriesStructure_has_StatisticalClassificationRelationship" element
     */
    void removeClassificationSeriesStructureHasStatisticalClassificationRelationship(int i);

    /**
     * An XML ClassificationSeriesStructure_structures_ClassificationSeries(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationSeriesStructureStructuresClassificationSeries extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureStructuresClassificationSeries> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "classificationseriesstructurestructuresclassificationseriesea81elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure$ClassificationSeriesStructureStructuresClassificationSeries$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureStructuresClassificationSeries.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypecb43elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_SERIES = Enum.forString("ClassificationSeries");

            int INT_CLASSIFICATION_SERIES = Enum.INT_CLASSIFICATION_SERIES;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure$ClassificationSeriesStructureStructuresClassificationSeries$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CLASSIFICATION_SERIES
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

                static final int INT_CLASSIFICATION_SERIES = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ClassificationSeries", INT_CLASSIFICATION_SERIES),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ClassificationSeriesStructure_has_StatisticalClassificationRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationSeriesStructureHasStatisticalClassificationRelationship extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "classificationseriesstructurehasstatisticalclassificationrelationship5d39elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "validType" elements
         */
        java.util.List<java.lang.String> getValidTypeList();

        /**
         * Gets array of all "validType" elements
         */
        java.lang.String[] getValidTypeArray();

        /**
         * Gets ith "validType" element
         */
        java.lang.String getValidTypeArray(int i);

        /**
         * Gets (as xml) a List of "validType" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList();

        /**
         * Gets (as xml) array of all "validType" elements
         */
        org.apache.xmlbeans.XmlString[] xgetValidTypeArray();

        /**
         * Gets (as xml) ith "validType" element
         */
        org.apache.xmlbeans.XmlString xgetValidTypeArray(int i);

        /**
         * Returns number of "validType" element
         */
        int sizeOfValidTypeArray();

        /**
         * Sets array of all "validType" element
         */
        void setValidTypeArray(java.lang.String[] validTypeArray);

        /**
         * Sets ith "validType" element
         */
        void setValidTypeArray(int i, java.lang.String validType);

        /**
         * Sets (as xml) array of all "validType" element
         */
        void xsetValidTypeArray(org.apache.xmlbeans.XmlString[] validTypeArray);

        /**
         * Sets (as xml) ith "validType" element
         */
        void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType);

        /**
         * Inserts the value as the ith "validType" element
         */
        void insertValidType(int i, java.lang.String validType);

        /**
         * Appends the value as the last "validType" element
         */
        void addValidType(java.lang.String validType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        org.apache.xmlbeans.XmlString insertNewValidType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        org.apache.xmlbeans.XmlString addNewValidType();

        /**
         * Removes the ith "validType" element
         */
        void removeValidType(int i);

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure$ClassificationSeriesStructureHasStatisticalClassificationRelationship$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypeb37belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STATISTICAL_CLASSIFICATION_RELATIONSHIP = Enum.forString("StatisticalClassificationRelationship");

            int INT_STATISTICAL_CLASSIFICATION_RELATIONSHIP = Enum.INT_STATISTICAL_CLASSIFICATION_RELATIONSHIP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure$ClassificationSeriesStructureHasStatisticalClassificationRelationship$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STATISTICAL_CLASSIFICATION_RELATIONSHIP
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

                static final int INT_STATISTICAL_CLASSIFICATION_RELATIONSHIP = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("StatisticalClassificationRelationship", INT_STATISTICAL_CLASSIFICATION_RELATIONSHIP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
