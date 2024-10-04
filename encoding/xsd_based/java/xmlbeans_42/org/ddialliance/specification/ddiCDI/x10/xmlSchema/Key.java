/*
 * XML Type:  Key
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Key(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Key extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "key6b0btype");
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
     * Gets the "Key_correspondsTo_Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUnit getKeyCorrespondsToUnit();

    /**
     * True if has "Key_correspondsTo_Unit" element
     */
    boolean isSetKeyCorrespondsToUnit();

    /**
     * Sets the "Key_correspondsTo_Unit" element
     */
    void setKeyCorrespondsToUnit(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUnit keyCorrespondsToUnit);

    /**
     * Appends and returns a new empty "Key_correspondsTo_Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUnit addNewKeyCorrespondsToUnit();

    /**
     * Unsets the "Key_correspondsTo_Unit" element
     */
    void unsetKeyCorrespondsToUnit();

    /**
     * Gets the "Key_represents_KeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyRepresentsKeyDefinition getKeyRepresentsKeyDefinition();

    /**
     * True if has "Key_represents_KeyDefinition" element
     */
    boolean isSetKeyRepresentsKeyDefinition();

    /**
     * Sets the "Key_represents_KeyDefinition" element
     */
    void setKeyRepresentsKeyDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyRepresentsKeyDefinition keyRepresentsKeyDefinition);

    /**
     * Appends and returns a new empty "Key_represents_KeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyRepresentsKeyDefinition addNewKeyRepresentsKeyDefinition();

    /**
     * Unsets the "Key_represents_KeyDefinition" element
     */
    void unsetKeyRepresentsKeyDefinition();

    /**
     * Gets a List of "Key_identifies_DataPoint" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint> getKeyIdentifiesDataPointList();

    /**
     * Gets array of all "Key_identifies_DataPoint" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint[] getKeyIdentifiesDataPointArray();

    /**
     * Gets ith "Key_identifies_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint getKeyIdentifiesDataPointArray(int i);

    /**
     * Returns number of "Key_identifies_DataPoint" element
     */
    int sizeOfKeyIdentifiesDataPointArray();

    /**
     * Sets array of all "Key_identifies_DataPoint" element
     */
    void setKeyIdentifiesDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint[] keyIdentifiesDataPointArray);

    /**
     * Sets ith "Key_identifies_DataPoint" element
     */
    void setKeyIdentifiesDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint keyIdentifiesDataPoint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key_identifies_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint insertNewKeyIdentifiesDataPoint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Key_identifies_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint addNewKeyIdentifiesDataPoint();

    /**
     * Removes the ith "Key_identifies_DataPoint" element
     */
    void removeKeyIdentifiesDataPoint(int i);

    /**
     * Gets the "Key_correspondsTo_Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUniverse getKeyCorrespondsToUniverse();

    /**
     * True if has "Key_correspondsTo_Universe" element
     */
    boolean isSetKeyCorrespondsToUniverse();

    /**
     * Sets the "Key_correspondsTo_Universe" element
     */
    void setKeyCorrespondsToUniverse(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUniverse keyCorrespondsToUniverse);

    /**
     * Appends and returns a new empty "Key_correspondsTo_Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUniverse addNewKeyCorrespondsToUniverse();

    /**
     * Unsets the "Key_correspondsTo_Universe" element
     */
    void unsetKeyCorrespondsToUniverse();

    /**
     * Gets a List of "Key_has_KeyMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember> getKeyHasKeyMemberList();

    /**
     * Gets array of all "Key_has_KeyMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember[] getKeyHasKeyMemberArray();

    /**
     * Gets ith "Key_has_KeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember getKeyHasKeyMemberArray(int i);

    /**
     * Returns number of "Key_has_KeyMember" element
     */
    int sizeOfKeyHasKeyMemberArray();

    /**
     * Sets array of all "Key_has_KeyMember" element
     */
    void setKeyHasKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember[] keyHasKeyMemberArray);

    /**
     * Sets ith "Key_has_KeyMember" element
     */
    void setKeyHasKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember keyHasKeyMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key_has_KeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember insertNewKeyHasKeyMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Key_has_KeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember addNewKeyHasKeyMember();

    /**
     * Removes the ith "Key_has_KeyMember" element
     */
    void removeKeyHasKeyMember(int i);

    /**
     * An XML Key_correspondsTo_Unit(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface KeyCorrespondsToUnit extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUnit> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keycorrespondstounit05ebelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyCorrespondsToUnit$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUnit.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypef4e9elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum UNIT = Enum.forString("Unit");

            int INT_UNIT = Enum.INT_UNIT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyCorrespondsToUnit$ValidType.
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
     * An XML Key_represents_KeyDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface KeyRepresentsKeyDefinition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyRepresentsKeyDefinition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keyrepresentskeydefinition2525elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyRepresentsKeyDefinition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyRepresentsKeyDefinition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype5da3elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DIMENSIONAL_KEY_DEFINITION = Enum.forString("DimensionalKeyDefinition");
            Enum KEY_DEFINITION = Enum.forString("KeyDefinition");

            int INT_DIMENSIONAL_KEY_DEFINITION = Enum.INT_DIMENSIONAL_KEY_DEFINITION;
            int INT_KEY_DEFINITION = Enum.INT_KEY_DEFINITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyRepresentsKeyDefinition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DIMENSIONAL_KEY_DEFINITION
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

                static final int INT_DIMENSIONAL_KEY_DEFINITION = 1;
                static final int INT_KEY_DEFINITION = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DimensionalKeyDefinition", INT_DIMENSIONAL_KEY_DEFINITION),
                    new Enum("KeyDefinition", INT_KEY_DEFINITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Key_identifies_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface KeyIdentifiesDataPoint extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keyidentifiesdatapoint78f8elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyIdentifiesDataPoint$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyIdentifiesDataPoint.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypea076elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_POINT = Enum.forString("DataPoint");

            int INT_DATA_POINT = Enum.INT_DATA_POINT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyIdentifiesDataPoint$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DATA_POINT
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

                static final int INT_DATA_POINT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DataPoint", INT_DATA_POINT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Key_correspondsTo_Universe(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface KeyCorrespondsToUniverse extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUniverse> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keycorrespondstouniverse566celemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyCorrespondsToUniverse$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyCorrespondsToUniverse.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype966aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum POPULATION = Enum.forString("Population");
            Enum UNIVERSE = Enum.forString("Universe");

            int INT_POPULATION = Enum.INT_POPULATION;
            int INT_UNIVERSE = Enum.INT_UNIVERSE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyCorrespondsToUniverse$ValidType.
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
     * An XML Key_has_KeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface KeyHasKeyMember extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "keyhaskeymemberd9cbelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyHasKeyMember$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key.KeyHasKeyMember.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype040delemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR = Enum.forString("Descriptor");
            Enum DIMENSIONAL_KEY_MEMBER = Enum.forString("DimensionalKeyMember");
            Enum KEY_MEMBER = Enum.forString("KeyMember");
            Enum LONG_MAIN_KEY_MEMBER = Enum.forString("LongMainKeyMember");
            Enum MAIN_KEY_MEMBER = Enum.forString("MainKeyMember");
            Enum WIDE_KEY_MEMBER = Enum.forString("WideKeyMember");

            int INT_DESCRIPTOR = Enum.INT_DESCRIPTOR;
            int INT_DIMENSIONAL_KEY_MEMBER = Enum.INT_DIMENSIONAL_KEY_MEMBER;
            int INT_KEY_MEMBER = Enum.INT_KEY_MEMBER;
            int INT_LONG_MAIN_KEY_MEMBER = Enum.INT_LONG_MAIN_KEY_MEMBER;
            int INT_MAIN_KEY_MEMBER = Enum.INT_MAIN_KEY_MEMBER;
            int INT_WIDE_KEY_MEMBER = Enum.INT_WIDE_KEY_MEMBER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key$KeyHasKeyMember$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DESCRIPTOR
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

                static final int INT_DESCRIPTOR = 1;
                static final int INT_DIMENSIONAL_KEY_MEMBER = 2;
                static final int INT_KEY_MEMBER = 3;
                static final int INT_LONG_MAIN_KEY_MEMBER = 4;
                static final int INT_MAIN_KEY_MEMBER = 5;
                static final int INT_WIDE_KEY_MEMBER = 6;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Descriptor", INT_DESCRIPTOR),
                    new Enum("DimensionalKeyMember", INT_DIMENSIONAL_KEY_MEMBER),
                    new Enum("KeyMember", INT_KEY_MEMBER),
                    new Enum("LongMainKeyMember", INT_LONG_MAIN_KEY_MEMBER),
                    new Enum("MainKeyMember", INT_MAIN_KEY_MEMBER),
                    new Enum("WideKeyMember", INT_WIDE_KEY_MEMBER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
