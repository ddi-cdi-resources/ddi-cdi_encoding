/*
 * XML Type:  KeyDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML KeyDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface KeyDefinition extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keydefinition4a7etype");
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
     * Gets the "KeyDefinition_correspondsTo_Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse getKeyDefinitionCorrespondsToUniverse();

    /**
     * True if has "KeyDefinition_correspondsTo_Universe" element
     */
    boolean isSetKeyDefinitionCorrespondsToUniverse();

    /**
     * Sets the "KeyDefinition_correspondsTo_Universe" element
     */
    void setKeyDefinitionCorrespondsToUniverse(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse keyDefinitionCorrespondsToUniverse);

    /**
     * Appends and returns a new empty "KeyDefinition_correspondsTo_Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse addNewKeyDefinitionCorrespondsToUniverse();

    /**
     * Unsets the "KeyDefinition_correspondsTo_Universe" element
     */
    void unsetKeyDefinitionCorrespondsToUniverse();

    /**
     * Gets the "KeyDefinition_correspondsTo_Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit getKeyDefinitionCorrespondsToUnit();

    /**
     * True if has "KeyDefinition_correspondsTo_Unit" element
     */
    boolean isSetKeyDefinitionCorrespondsToUnit();

    /**
     * Sets the "KeyDefinition_correspondsTo_Unit" element
     */
    void setKeyDefinitionCorrespondsToUnit(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit keyDefinitionCorrespondsToUnit);

    /**
     * Appends and returns a new empty "KeyDefinition_correspondsTo_Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit addNewKeyDefinitionCorrespondsToUnit();

    /**
     * Unsets the "KeyDefinition_correspondsTo_Unit" element
     */
    void unsetKeyDefinitionCorrespondsToUnit();

    /**
     * Gets a List of "KeyDefinition_has_KeyDefinitionMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember> getKeyDefinitionHasKeyDefinitionMemberList();

    /**
     * Gets array of all "KeyDefinition_has_KeyDefinitionMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember[] getKeyDefinitionHasKeyDefinitionMemberArray();

    /**
     * Gets ith "KeyDefinition_has_KeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember getKeyDefinitionHasKeyDefinitionMemberArray(int i);

    /**
     * Returns number of "KeyDefinition_has_KeyDefinitionMember" element
     */
    int sizeOfKeyDefinitionHasKeyDefinitionMemberArray();

    /**
     * Sets array of all "KeyDefinition_has_KeyDefinitionMember" element
     */
    void setKeyDefinitionHasKeyDefinitionMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember[] keyDefinitionHasKeyDefinitionMemberArray);

    /**
     * Sets ith "KeyDefinition_has_KeyDefinitionMember" element
     */
    void setKeyDefinitionHasKeyDefinitionMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember keyDefinitionHasKeyDefinitionMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyDefinition_has_KeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember insertNewKeyDefinitionHasKeyDefinitionMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyDefinition_has_KeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember addNewKeyDefinitionHasKeyDefinitionMember();

    /**
     * Removes the ith "KeyDefinition_has_KeyDefinitionMember" element
     */
    void removeKeyDefinitionHasKeyDefinitionMember(int i);

    /**
     * An XML KeyDefinition_correspondsTo_Universe(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface KeyDefinitionCorrespondsToUniverse extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keydefinitioncorrespondstouniverse070celemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionCorrespondsToUniverse$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype5c0aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum POPULATION = Enum.forString("Population");
            Enum UNIVERSE = Enum.forString("Universe");

            int INT_POPULATION = Enum.INT_POPULATION;
            int INT_UNIVERSE = Enum.INT_UNIVERSE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionCorrespondsToUniverse$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_POPULATION
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

                static final int INT_POPULATION = 1;
                static final int INT_UNIVERSE = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Population", INT_POPULATION),
                    new Enum("Universe", INT_UNIVERSE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML KeyDefinition_correspondsTo_Unit(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface KeyDefinitionCorrespondsToUnit extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keydefinitioncorrespondstounite24belemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionCorrespondsToUnit$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype6649elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum UNIT = Enum.forString("Unit");

            int INT_UNIT = Enum.INT_UNIT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionCorrespondsToUnit$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_UNIT
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

                static final int INT_UNIT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Unit", INT_UNIT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML KeyDefinition_has_KeyDefinitionMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface KeyDefinitionHasKeyDefinitionMember extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keydefinitionhaskeydefinitionmember08a4elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionHasKeyDefinitionMember$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype5366elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum KEY_DEFINITION_MEMBER = Enum.forString("KeyDefinitionMember");

            int INT_KEY_DEFINITION_MEMBER = Enum.INT_KEY_DEFINITION_MEMBER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionHasKeyDefinitionMember$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_KEY_DEFINITION_MEMBER
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

                static final int INT_KEY_DEFINITION_MEMBER = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("KeyDefinitionMember", INT_KEY_DEFINITION_MEMBER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
