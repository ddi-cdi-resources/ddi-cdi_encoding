/*
 * XML Type:  EnumerationDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML EnumerationDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface EnumerationDomain extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "enumerationdomaine857type");
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
     * Gets the "EnumerationDomain_uses_LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure getEnumerationDomainUsesLevelStructure();

    /**
     * True if has "EnumerationDomain_uses_LevelStructure" element
     */
    boolean isSetEnumerationDomainUsesLevelStructure();

    /**
     * Sets the "EnumerationDomain_uses_LevelStructure" element
     */
    void setEnumerationDomainUsesLevelStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure enumerationDomainUsesLevelStructure);

    /**
     * Appends and returns a new empty "EnumerationDomain_uses_LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure addNewEnumerationDomainUsesLevelStructure();

    /**
     * Unsets the "EnumerationDomain_uses_LevelStructure" element
     */
    void unsetEnumerationDomainUsesLevelStructure();

    /**
     * Gets the "EnumerationDomain_references_CategorySet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet getEnumerationDomainReferencesCategorySet();

    /**
     * True if has "EnumerationDomain_references_CategorySet" element
     */
    boolean isSetEnumerationDomainReferencesCategorySet();

    /**
     * Sets the "EnumerationDomain_references_CategorySet" element
     */
    void setEnumerationDomainReferencesCategorySet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet enumerationDomainReferencesCategorySet);

    /**
     * Appends and returns a new empty "EnumerationDomain_references_CategorySet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet addNewEnumerationDomainReferencesCategorySet();

    /**
     * Unsets the "EnumerationDomain_references_CategorySet" element
     */
    void unsetEnumerationDomainReferencesCategorySet();

    /**
     * Gets a List of "EnumerationDomain_isDefinedBy_Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept> getEnumerationDomainIsDefinedByConceptList();

    /**
     * Gets array of all "EnumerationDomain_isDefinedBy_Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept[] getEnumerationDomainIsDefinedByConceptArray();

    /**
     * Gets ith "EnumerationDomain_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept getEnumerationDomainIsDefinedByConceptArray(int i);

    /**
     * Returns number of "EnumerationDomain_isDefinedBy_Concept" element
     */
    int sizeOfEnumerationDomainIsDefinedByConceptArray();

    /**
     * Sets array of all "EnumerationDomain_isDefinedBy_Concept" element
     */
    void setEnumerationDomainIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept[] enumerationDomainIsDefinedByConceptArray);

    /**
     * Sets ith "EnumerationDomain_isDefinedBy_Concept" element
     */
    void setEnumerationDomainIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept enumerationDomainIsDefinedByConcept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "EnumerationDomain_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept insertNewEnumerationDomainIsDefinedByConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "EnumerationDomain_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept addNewEnumerationDomainIsDefinedByConcept();

    /**
     * Removes the ith "EnumerationDomain_isDefinedBy_Concept" element
     */
    void removeEnumerationDomainIsDefinedByConcept(int i);

    /**
     * An XML EnumerationDomain_uses_LevelStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface EnumerationDomainUsesLevelStructure extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "enumerationdomainuseslevelstructure3191elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainUsesLevelStructure$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype4b53elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LEVEL_STRUCTURE = Enum.forString("LevelStructure");

            int INT_LEVEL_STRUCTURE = Enum.INT_LEVEL_STRUCTURE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainUsesLevelStructure$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LEVEL_STRUCTURE
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

                static final int INT_LEVEL_STRUCTURE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("LevelStructure", INT_LEVEL_STRUCTURE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML EnumerationDomain_references_CategorySet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface EnumerationDomainReferencesCategorySet extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "enumerationdomainreferencescategorysetab14elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainReferencesCategorySet$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype2212elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY_SET = Enum.forString("CategorySet");

            int INT_CATEGORY_SET = Enum.INT_CATEGORY_SET;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainReferencesCategorySet$ValidType.
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

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("CategorySet", INT_CATEGORY_SET),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML EnumerationDomain_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface EnumerationDomainIsDefinedByConcept extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "enumerationdomainisdefinedbyconcept798eelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainIsDefinedByConcept$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype9350elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");
            Enum CONCEPT = Enum.forString("Concept");
            Enum CONCEPTUAL_VALUE = Enum.forString("ConceptualValue");
            Enum CONCEPTUAL_VARIABLE = Enum.forString("ConceptualVariable");
            Enum DESCRIPTOR_VARIABLE = Enum.forString("DescriptorVariable");
            Enum DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.forString("DimensionalKeyDefinitionMember");
            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");
            Enum KEY_DEFINITION_MEMBER = Enum.forString("KeyDefinitionMember");
            Enum POPULATION = Enum.forString("Population");
            Enum REFERENCE_VARIABLE = Enum.forString("ReferenceVariable");
            Enum REPRESENTED_VARIABLE = Enum.forString("RepresentedVariable");
            Enum UNIT_TYPE = Enum.forString("UnitType");
            Enum UNIVERSE = Enum.forString("Universe");

            int INT_CATEGORY = Enum.INT_CATEGORY;
            int INT_CONCEPT = Enum.INT_CONCEPT;
            int INT_CONCEPTUAL_VALUE = Enum.INT_CONCEPTUAL_VALUE;
            int INT_CONCEPTUAL_VARIABLE = Enum.INT_CONCEPTUAL_VARIABLE;
            int INT_DESCRIPTOR_VARIABLE = Enum.INT_DESCRIPTOR_VARIABLE;
            int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.INT_DIMENSIONAL_KEY_DEFINITION_MEMBER;
            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;
            int INT_KEY_DEFINITION_MEMBER = Enum.INT_KEY_DEFINITION_MEMBER;
            int INT_POPULATION = Enum.INT_POPULATION;
            int INT_REFERENCE_VARIABLE = Enum.INT_REFERENCE_VARIABLE;
            int INT_REPRESENTED_VARIABLE = Enum.INT_REPRESENTED_VARIABLE;
            int INT_UNIT_TYPE = Enum.INT_UNIT_TYPE;
            int INT_UNIVERSE = Enum.INT_UNIVERSE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainIsDefinedByConcept$ValidType.
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
                static final int INT_CONCEPT = 2;
                static final int INT_CONCEPTUAL_VALUE = 3;
                static final int INT_CONCEPTUAL_VARIABLE = 4;
                static final int INT_DESCRIPTOR_VARIABLE = 5;
                static final int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = 6;
                static final int INT_INSTANCE_VARIABLE = 7;
                static final int INT_KEY_DEFINITION_MEMBER = 8;
                static final int INT_POPULATION = 9;
                static final int INT_REFERENCE_VARIABLE = 10;
                static final int INT_REPRESENTED_VARIABLE = 11;
                static final int INT_UNIT_TYPE = 12;
                static final int INT_UNIVERSE = 13;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Category", INT_CATEGORY),
                    new Enum("Concept", INT_CONCEPT),
                    new Enum("ConceptualValue", INT_CONCEPTUAL_VALUE),
                    new Enum("ConceptualVariable", INT_CONCEPTUAL_VARIABLE),
                    new Enum("DescriptorVariable", INT_DESCRIPTOR_VARIABLE),
                    new Enum("DimensionalKeyDefinitionMember", INT_DIMENSIONAL_KEY_DEFINITION_MEMBER),
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                    new Enum("KeyDefinitionMember", INT_KEY_DEFINITION_MEMBER),
                    new Enum("Population", INT_POPULATION),
                    new Enum("ReferenceVariable", INT_REFERENCE_VARIABLE),
                    new Enum("RepresentedVariable", INT_REPRESENTED_VARIABLE),
                    new Enum("UnitType", INT_UNIT_TYPE),
                    new Enum("Universe", INT_UNIVERSE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
