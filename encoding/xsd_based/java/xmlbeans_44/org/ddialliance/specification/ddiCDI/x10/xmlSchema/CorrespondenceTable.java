/*
 * XML Type:  CorrespondenceTable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CorrespondenceTable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CorrespondenceTable extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencetablea580type");
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
     * Gets the "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getEffectiveDates();

    /**
     * True if has "effectiveDates" element
     */
    boolean isSetEffectiveDates();

    /**
     * Sets the "effectiveDates" element
     */
    void setEffectiveDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange effectiveDates);

    /**
     * Appends and returns a new empty "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewEffectiveDates();

    /**
     * Unsets the "effectiveDates" element
     */
    void unsetEffectiveDates();

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
     * Gets the "CorrespondenceTable_hasSource_Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasSourceLevel getCorrespondenceTableHasSourceLevel();

    /**
     * True if has "CorrespondenceTable_hasSource_Level" element
     */
    boolean isSetCorrespondenceTableHasSourceLevel();

    /**
     * Sets the "CorrespondenceTable_hasSource_Level" element
     */
    void setCorrespondenceTableHasSourceLevel(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasSourceLevel correspondenceTableHasSourceLevel);

    /**
     * Appends and returns a new empty "CorrespondenceTable_hasSource_Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasSourceLevel addNewCorrespondenceTableHasSourceLevel();

    /**
     * Unsets the "CorrespondenceTable_hasSource_Level" element
     */
    void unsetCorrespondenceTableHasSourceLevel();

    /**
     * Gets the "CorrespondenceTable_hasTarget_Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasTargetLevel getCorrespondenceTableHasTargetLevel();

    /**
     * True if has "CorrespondenceTable_hasTarget_Level" element
     */
    boolean isSetCorrespondenceTableHasTargetLevel();

    /**
     * Sets the "CorrespondenceTable_hasTarget_Level" element
     */
    void setCorrespondenceTableHasTargetLevel(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasTargetLevel correspondenceTableHasTargetLevel);

    /**
     * Appends and returns a new empty "CorrespondenceTable_hasTarget_Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasTargetLevel addNewCorrespondenceTableHasTargetLevel();

    /**
     * Unsets the "CorrespondenceTable_hasTarget_Level" element
     */
    void unsetCorrespondenceTableHasTargetLevel();

    /**
     * Gets a List of "CorrespondenceTable_isOwnedBy_Agent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent> getCorrespondenceTableIsOwnedByAgentList();

    /**
     * Gets array of all "CorrespondenceTable_isOwnedBy_Agent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent[] getCorrespondenceTableIsOwnedByAgentArray();

    /**
     * Gets ith "CorrespondenceTable_isOwnedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent getCorrespondenceTableIsOwnedByAgentArray(int i);

    /**
     * Returns number of "CorrespondenceTable_isOwnedBy_Agent" element
     */
    int sizeOfCorrespondenceTableIsOwnedByAgentArray();

    /**
     * Sets array of all "CorrespondenceTable_isOwnedBy_Agent" element
     */
    void setCorrespondenceTableIsOwnedByAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent[] correspondenceTableIsOwnedByAgentArray);

    /**
     * Sets ith "CorrespondenceTable_isOwnedBy_Agent" element
     */
    void setCorrespondenceTableIsOwnedByAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent correspondenceTableIsOwnedByAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CorrespondenceTable_isOwnedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent insertNewCorrespondenceTableIsOwnedByAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CorrespondenceTable_isOwnedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent addNewCorrespondenceTableIsOwnedByAgent();

    /**
     * Removes the ith "CorrespondenceTable_isOwnedBy_Agent" element
     */
    void removeCorrespondenceTableIsOwnedByAgent(int i);

    /**
     * Gets a List of "CorrespondenceTable_mapsTo_StatisticalClassification" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification> getCorrespondenceTableMapsToStatisticalClassificationList();

    /**
     * Gets array of all "CorrespondenceTable_mapsTo_StatisticalClassification" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification[] getCorrespondenceTableMapsToStatisticalClassificationArray();

    /**
     * Gets ith "CorrespondenceTable_mapsTo_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification getCorrespondenceTableMapsToStatisticalClassificationArray(int i);

    /**
     * Returns number of "CorrespondenceTable_mapsTo_StatisticalClassification" element
     */
    int sizeOfCorrespondenceTableMapsToStatisticalClassificationArray();

    /**
     * Sets array of all "CorrespondenceTable_mapsTo_StatisticalClassification" element
     */
    void setCorrespondenceTableMapsToStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification[] correspondenceTableMapsToStatisticalClassificationArray);

    /**
     * Sets ith "CorrespondenceTable_mapsTo_StatisticalClassification" element
     */
    void setCorrespondenceTableMapsToStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification correspondenceTableMapsToStatisticalClassification);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CorrespondenceTable_mapsTo_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification insertNewCorrespondenceTableMapsToStatisticalClassification(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CorrespondenceTable_mapsTo_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification addNewCorrespondenceTableMapsToStatisticalClassification();

    /**
     * Removes the ith "CorrespondenceTable_mapsTo_StatisticalClassification" element
     */
    void removeCorrespondenceTableMapsToStatisticalClassification(int i);

    /**
     * Gets a List of "CorrespondenceTable_hasContact_Agent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent> getCorrespondenceTableHasContactAgentList();

    /**
     * Gets array of all "CorrespondenceTable_hasContact_Agent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent[] getCorrespondenceTableHasContactAgentArray();

    /**
     * Gets ith "CorrespondenceTable_hasContact_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent getCorrespondenceTableHasContactAgentArray(int i);

    /**
     * Returns number of "CorrespondenceTable_hasContact_Agent" element
     */
    int sizeOfCorrespondenceTableHasContactAgentArray();

    /**
     * Sets array of all "CorrespondenceTable_hasContact_Agent" element
     */
    void setCorrespondenceTableHasContactAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent[] correspondenceTableHasContactAgentArray);

    /**
     * Sets ith "CorrespondenceTable_hasContact_Agent" element
     */
    void setCorrespondenceTableHasContactAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent correspondenceTableHasContactAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CorrespondenceTable_hasContact_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent insertNewCorrespondenceTableHasContactAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CorrespondenceTable_hasContact_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent addNewCorrespondenceTableHasContactAgent();

    /**
     * Removes the ith "CorrespondenceTable_hasContact_Agent" element
     */
    void removeCorrespondenceTableHasContactAgent(int i);

    /**
     * Gets the "CorrespondenceTable_isMaintainedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent getCorrespondenceTableIsMaintainedByAgent();

    /**
     * True if has "CorrespondenceTable_isMaintainedBy_Agent" element
     */
    boolean isSetCorrespondenceTableIsMaintainedByAgent();

    /**
     * Sets the "CorrespondenceTable_isMaintainedBy_Agent" element
     */
    void setCorrespondenceTableIsMaintainedByAgent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent correspondenceTableIsMaintainedByAgent);

    /**
     * Appends and returns a new empty "CorrespondenceTable_isMaintainedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent addNewCorrespondenceTableIsMaintainedByAgent();

    /**
     * Unsets the "CorrespondenceTable_isMaintainedBy_Agent" element
     */
    void unsetCorrespondenceTableIsMaintainedByAgent();

    /**
     * Gets a List of "CorrespondenceTable_has_ConceptMap" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap> getCorrespondenceTableHasConceptMapList();

    /**
     * Gets array of all "CorrespondenceTable_has_ConceptMap" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap[] getCorrespondenceTableHasConceptMapArray();

    /**
     * Gets ith "CorrespondenceTable_has_ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap getCorrespondenceTableHasConceptMapArray(int i);

    /**
     * Returns number of "CorrespondenceTable_has_ConceptMap" element
     */
    int sizeOfCorrespondenceTableHasConceptMapArray();

    /**
     * Sets array of all "CorrespondenceTable_has_ConceptMap" element
     */
    void setCorrespondenceTableHasConceptMapArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap[] correspondenceTableHasConceptMapArray);

    /**
     * Sets ith "CorrespondenceTable_has_ConceptMap" element
     */
    void setCorrespondenceTableHasConceptMapArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap correspondenceTableHasConceptMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CorrespondenceTable_has_ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap insertNewCorrespondenceTableHasConceptMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CorrespondenceTable_has_ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap addNewCorrespondenceTableHasConceptMap();

    /**
     * Removes the ith "CorrespondenceTable_has_ConceptMap" element
     */
    void removeCorrespondenceTableHasConceptMap(int i);

    /**
     * An XML CorrespondenceTable_hasSource_Level(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CorrespondenceTableHasSourceLevel extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasSourceLevel> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencetablehassourcelevel851belemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableHasSourceLevel$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasSourceLevel.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype9eddelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LEVEL = Enum.forString("Level");

            int INT_LEVEL = Enum.INT_LEVEL;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableHasSourceLevel$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LEVEL
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

                static final int INT_LEVEL = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Level", INT_LEVEL),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CorrespondenceTable_hasTarget_Level(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CorrespondenceTableHasTargetLevel extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasTargetLevel> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencetablehastargetlevel5c91elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableHasTargetLevel$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasTargetLevel.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype7653elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LEVEL = Enum.forString("Level");

            int INT_LEVEL = Enum.INT_LEVEL;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableHasTargetLevel$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LEVEL
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

                static final int INT_LEVEL = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Level", INT_LEVEL),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CorrespondenceTable_isOwnedBy_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CorrespondenceTableIsOwnedByAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencetableisownedbyagentf959elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableIsOwnedByAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype131belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT = Enum.forString("Agent");
            Enum CURATOR = Enum.forString("Curator");
            Enum INDIVIDUAL = Enum.forString("Individual");
            Enum MACHINE = Enum.forString("Machine");
            Enum ORGANIZATION = Enum.forString("Organization");
            Enum PROCESSING_AGENT = Enum.forString("ProcessingAgent");
            Enum SERVICE = Enum.forString("Service");

            int INT_AGENT = Enum.INT_AGENT;
            int INT_CURATOR = Enum.INT_CURATOR;
            int INT_INDIVIDUAL = Enum.INT_INDIVIDUAL;
            int INT_MACHINE = Enum.INT_MACHINE;
            int INT_ORGANIZATION = Enum.INT_ORGANIZATION;
            int INT_PROCESSING_AGENT = Enum.INT_PROCESSING_AGENT;
            int INT_SERVICE = Enum.INT_SERVICE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableIsOwnedByAgent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT
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

                static final int INT_AGENT = 1;
                static final int INT_CURATOR = 2;
                static final int INT_INDIVIDUAL = 3;
                static final int INT_MACHINE = 4;
                static final int INT_ORGANIZATION = 5;
                static final int INT_PROCESSING_AGENT = 6;
                static final int INT_SERVICE = 7;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Agent", INT_AGENT),
                    new Enum("Curator", INT_CURATOR),
                    new Enum("Individual", INT_INDIVIDUAL),
                    new Enum("Machine", INT_MACHINE),
                    new Enum("Organization", INT_ORGANIZATION),
                    new Enum("ProcessingAgent", INT_PROCESSING_AGENT),
                    new Enum("Service", INT_SERVICE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CorrespondenceTable_mapsTo_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CorrespondenceTableMapsToStatisticalClassification extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencetablemapstostatisticalclassification539belemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableMapsToStatisticalClassification$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypeb619elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STATISTICAL_CLASSIFICATION = Enum.forString("StatisticalClassification");

            int INT_STATISTICAL_CLASSIFICATION = Enum.INT_STATISTICAL_CLASSIFICATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableMapsToStatisticalClassification$ValidType.
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
     * An XML CorrespondenceTable_hasContact_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CorrespondenceTableHasContactAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencetablehascontactagent6193elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableHasContactAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasContactAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype8011elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT = Enum.forString("Agent");
            Enum CURATOR = Enum.forString("Curator");
            Enum INDIVIDUAL = Enum.forString("Individual");
            Enum MACHINE = Enum.forString("Machine");
            Enum ORGANIZATION = Enum.forString("Organization");
            Enum PROCESSING_AGENT = Enum.forString("ProcessingAgent");
            Enum SERVICE = Enum.forString("Service");

            int INT_AGENT = Enum.INT_AGENT;
            int INT_CURATOR = Enum.INT_CURATOR;
            int INT_INDIVIDUAL = Enum.INT_INDIVIDUAL;
            int INT_MACHINE = Enum.INT_MACHINE;
            int INT_ORGANIZATION = Enum.INT_ORGANIZATION;
            int INT_PROCESSING_AGENT = Enum.INT_PROCESSING_AGENT;
            int INT_SERVICE = Enum.INT_SERVICE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableHasContactAgent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT
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

                static final int INT_AGENT = 1;
                static final int INT_CURATOR = 2;
                static final int INT_INDIVIDUAL = 3;
                static final int INT_MACHINE = 4;
                static final int INT_ORGANIZATION = 5;
                static final int INT_PROCESSING_AGENT = 6;
                static final int INT_SERVICE = 7;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Agent", INT_AGENT),
                    new Enum("Curator", INT_CURATOR),
                    new Enum("Individual", INT_INDIVIDUAL),
                    new Enum("Machine", INT_MACHINE),
                    new Enum("Organization", INT_ORGANIZATION),
                    new Enum("ProcessingAgent", INT_PROCESSING_AGENT),
                    new Enum("Service", INT_SERVICE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CorrespondenceTable_isMaintainedBy_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CorrespondenceTableIsMaintainedByAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencetableismaintainedbyagent2c98elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableIsMaintainedByAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypedc16elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT = Enum.forString("Agent");
            Enum CURATOR = Enum.forString("Curator");
            Enum INDIVIDUAL = Enum.forString("Individual");
            Enum MACHINE = Enum.forString("Machine");
            Enum ORGANIZATION = Enum.forString("Organization");
            Enum PROCESSING_AGENT = Enum.forString("ProcessingAgent");
            Enum SERVICE = Enum.forString("Service");

            int INT_AGENT = Enum.INT_AGENT;
            int INT_CURATOR = Enum.INT_CURATOR;
            int INT_INDIVIDUAL = Enum.INT_INDIVIDUAL;
            int INT_MACHINE = Enum.INT_MACHINE;
            int INT_ORGANIZATION = Enum.INT_ORGANIZATION;
            int INT_PROCESSING_AGENT = Enum.INT_PROCESSING_AGENT;
            int INT_SERVICE = Enum.INT_SERVICE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableIsMaintainedByAgent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT
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

                static final int INT_AGENT = 1;
                static final int INT_CURATOR = 2;
                static final int INT_INDIVIDUAL = 3;
                static final int INT_MACHINE = 4;
                static final int INT_ORGANIZATION = 5;
                static final int INT_PROCESSING_AGENT = 6;
                static final int INT_SERVICE = 7;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Agent", INT_AGENT),
                    new Enum("Curator", INT_CURATOR),
                    new Enum("Individual", INT_INDIVIDUAL),
                    new Enum("Machine", INT_MACHINE),
                    new Enum("Organization", INT_ORGANIZATION),
                    new Enum("ProcessingAgent", INT_PROCESSING_AGENT),
                    new Enum("Service", INT_SERVICE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CorrespondenceTable_has_ConceptMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CorrespondenceTableHasConceptMap extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencetablehasconceptmapd840elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableHasConceptMap$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable.CorrespondenceTableHasConceptMap.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype7e3eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CONCEPT_MAP = Enum.forString("ConceptMap");

            int INT_CONCEPT_MAP = Enum.INT_CONCEPT_MAP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable$CorrespondenceTableHasConceptMap$ValidType.
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
