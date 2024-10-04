/*
 * XML Type:  ConceptSystemCorrespondence
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConceptSystemCorrespondence(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ConceptSystemCorrespondence extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptsystemcorrespondence7addtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails();

    /**
     * True if has "catalogDetails" element
     */
    boolean isSetCatalogDetails();

    /**
     * Sets the "catalogDetails" element
     */
    void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails);

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails();

    /**
     * Unsets the "catalogDetails" element
     */
    void unsetCatalogDetails();

    /**
     * Gets a List of "displayLabel" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay> getDisplayLabelList();

    /**
     * Gets array of all "displayLabel" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] getDisplayLabelArray();

    /**
     * Gets ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabelArray(int i);

    /**
     * Returns number of "displayLabel" element
     */
    int sizeOfDisplayLabelArray();

    /**
     * Sets array of all "displayLabel" element
     */
    void setDisplayLabelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] displayLabelArray);

    /**
     * Sets ith "displayLabel" element
     */
    void setDisplayLabelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay insertNewDisplayLabel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewDisplayLabel();

    /**
     * Removes the ith "displayLabel" element
     */
    void removeDisplayLabel(int i);

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
     * Gets the "usage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getUsage();

    /**
     * True if has "usage" element
     */
    boolean isSetUsage();

    /**
     * Sets the "usage" element
     */
    void setUsage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString usage);

    /**
     * Appends and returns a new empty "usage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewUsage();

    /**
     * Unsets the "usage" element
     */
    void unsetUsage();

    /**
     * Gets a List of "ConceptSystemCorrespondence_maps_ConceptSystem" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem> getConceptSystemCorrespondenceMapsConceptSystemList();

    /**
     * Gets array of all "ConceptSystemCorrespondence_maps_ConceptSystem" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem[] getConceptSystemCorrespondenceMapsConceptSystemArray();

    /**
     * Gets ith "ConceptSystemCorrespondence_maps_ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem getConceptSystemCorrespondenceMapsConceptSystemArray(int i);

    /**
     * Returns number of "ConceptSystemCorrespondence_maps_ConceptSystem" element
     */
    int sizeOfConceptSystemCorrespondenceMapsConceptSystemArray();

    /**
     * Sets array of all "ConceptSystemCorrespondence_maps_ConceptSystem" element
     */
    void setConceptSystemCorrespondenceMapsConceptSystemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem[] conceptSystemCorrespondenceMapsConceptSystemArray);

    /**
     * Sets ith "ConceptSystemCorrespondence_maps_ConceptSystem" element
     */
    void setConceptSystemCorrespondenceMapsConceptSystemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem conceptSystemCorrespondenceMapsConceptSystem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSystemCorrespondence_maps_ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem insertNewConceptSystemCorrespondenceMapsConceptSystem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSystemCorrespondence_maps_ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem addNewConceptSystemCorrespondenceMapsConceptSystem();

    /**
     * Removes the ith "ConceptSystemCorrespondence_maps_ConceptSystem" element
     */
    void removeConceptSystemCorrespondenceMapsConceptSystem(int i);

    /**
     * Gets a List of "ConceptSystemCorrespondence_has_ConceptMap" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap> getConceptSystemCorrespondenceHasConceptMapList();

    /**
     * Gets array of all "ConceptSystemCorrespondence_has_ConceptMap" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap[] getConceptSystemCorrespondenceHasConceptMapArray();

    /**
     * Gets ith "ConceptSystemCorrespondence_has_ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap getConceptSystemCorrespondenceHasConceptMapArray(int i);

    /**
     * Returns number of "ConceptSystemCorrespondence_has_ConceptMap" element
     */
    int sizeOfConceptSystemCorrespondenceHasConceptMapArray();

    /**
     * Sets array of all "ConceptSystemCorrespondence_has_ConceptMap" element
     */
    void setConceptSystemCorrespondenceHasConceptMapArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap[] conceptSystemCorrespondenceHasConceptMapArray);

    /**
     * Sets ith "ConceptSystemCorrespondence_has_ConceptMap" element
     */
    void setConceptSystemCorrespondenceHasConceptMapArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap conceptSystemCorrespondenceHasConceptMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSystemCorrespondence_has_ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap insertNewConceptSystemCorrespondenceHasConceptMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSystemCorrespondence_has_ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap addNewConceptSystemCorrespondenceHasConceptMap();

    /**
     * Removes the ith "ConceptSystemCorrespondence_has_ConceptMap" element
     */
    void removeConceptSystemCorrespondenceHasConceptMap(int i);

    /**
     * An XML ConceptSystemCorrespondence_maps_ConceptSystem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ConceptSystemCorrespondenceMapsConceptSystem extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptsystemcorrespondencemapsconceptsystemfc16elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence$ConceptSystemCorrespondenceMapsConceptSystem$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypeb714elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY_SET = Enum.forString("CategorySet");
            Enum CONCEPT_SYSTEM = Enum.forString("ConceptSystem");

            int INT_CATEGORY_SET = Enum.INT_CATEGORY_SET;
            int INT_CONCEPT_SYSTEM = Enum.INT_CONCEPT_SYSTEM;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence$ConceptSystemCorrespondenceMapsConceptSystem$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CATEGORY_SET
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

                static final int INT_CATEGORY_SET = 1;
                static final int INT_CONCEPT_SYSTEM = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("CategorySet", INT_CATEGORY_SET),
                    new Enum("ConceptSystem", INT_CONCEPT_SYSTEM),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ConceptSystemCorrespondence_has_ConceptMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ConceptSystemCorrespondenceHasConceptMap extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptsystemcorrespondencehasconceptmap8c60elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence$ConceptSystemCorrespondenceHasConceptMap$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype765eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CONCEPT_MAP = Enum.forString("ConceptMap");

            int INT_CONCEPT_MAP = Enum.INT_CONCEPT_MAP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence$ConceptSystemCorrespondenceHasConceptMap$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CONCEPT_MAP
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

                static final int INT_CONCEPT_MAP = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ConceptMap", INT_CONCEPT_MAP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
