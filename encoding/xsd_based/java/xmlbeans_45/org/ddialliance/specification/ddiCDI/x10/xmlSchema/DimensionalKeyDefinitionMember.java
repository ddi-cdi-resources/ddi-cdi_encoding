/*
 * XML Type:  DimensionalKeyDefinitionMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DimensionalKeyDefinitionMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DimensionalKeyDefinitionMember extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "dimensionalkeydefinitionmember8619type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember> getDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberList();

    /**
     * Gets array of all "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember[] getDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray();

    /**
     * Gets ith "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember getDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray(int i);

    /**
     * Returns number of "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    int sizeOfDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray();

    /**
     * Sets array of all "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    void setDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember[] dimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray);

    /**
     * Sets ith "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    void setDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember dimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember insertNewDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember addNewDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember();

    /**
     * Removes the ith "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    void removeDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember(int i);

    /**
     * An XML DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "dimensionalkeydefinitionmemberisrepresentedbydimensionalkeymembera496elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember$DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypec594elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DIMENSIONAL_KEY_MEMBER = Enum.forString("DimensionalKeyMember");

            int INT_DIMENSIONAL_KEY_MEMBER = Enum.INT_DIMENSIONAL_KEY_MEMBER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember$DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DIMENSIONAL_KEY_MEMBER
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

                static final int INT_DIMENSIONAL_KEY_MEMBER = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DimensionalKeyMember", INT_DIMENSIONAL_KEY_MEMBER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
