/*
 * XML Type:  CodeList
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CodeList(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CodeList extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "codelistdc89type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "allowsDuplicates" element
     */
    boolean getAllowsDuplicates();

    /**
     * Gets (as xml) the "allowsDuplicates" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowsDuplicates();

    /**
     * Sets the "allowsDuplicates" element
     */
    void setAllowsDuplicates(boolean allowsDuplicates);

    /**
     * Sets (as xml) the "allowsDuplicates" element
     */
    void xsetAllowsDuplicates(org.apache.xmlbeans.XmlBoolean allowsDuplicates);

    /**
     * Gets a List of "CodeList_has_CodePosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition> getCodeListHasCodePositionList();

    /**
     * Gets array of all "CodeList_has_CodePosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition[] getCodeListHasCodePositionArray();

    /**
     * Gets ith "CodeList_has_CodePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition getCodeListHasCodePositionArray(int i);

    /**
     * Returns number of "CodeList_has_CodePosition" element
     */
    int sizeOfCodeListHasCodePositionArray();

    /**
     * Sets array of all "CodeList_has_CodePosition" element
     */
    void setCodeListHasCodePositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition[] codeListHasCodePositionArray);

    /**
     * Sets ith "CodeList_has_CodePosition" element
     */
    void setCodeListHasCodePositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition codeListHasCodePosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeList_has_CodePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition insertNewCodeListHasCodePosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeList_has_CodePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition addNewCodeListHasCodePosition();

    /**
     * Removes the ith "CodeList_has_CodePosition" element
     */
    void removeCodeListHasCodePosition(int i);

    /**
     * Gets a List of "CodeList_has_Code" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode> getCodeListHasCodeList();

    /**
     * Gets array of all "CodeList_has_Code" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode[] getCodeListHasCodeArray();

    /**
     * Gets ith "CodeList_has_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode getCodeListHasCodeArray(int i);

    /**
     * Returns number of "CodeList_has_Code" element
     */
    int sizeOfCodeListHasCodeArray();

    /**
     * Sets array of all "CodeList_has_Code" element
     */
    void setCodeListHasCodeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode[] codeListHasCodeArray);

    /**
     * Sets ith "CodeList_has_Code" element
     */
    void setCodeListHasCodeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode codeListHasCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeList_has_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode insertNewCodeListHasCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeList_has_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode addNewCodeListHasCode();

    /**
     * Removes the ith "CodeList_has_Code" element
     */
    void removeCodeListHasCode(int i);

    /**
     * An XML CodeList_has_CodePosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CodeListHasCodePosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "codelisthascodeposition7c6eelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList$CodeListHasCodePosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCodePosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype8d6celemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CODE_POSITION = Enum.forString("CodePosition");

            int INT_CODE_POSITION = Enum.INT_CODE_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList$CodeListHasCodePosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CODE_POSITION
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

                static final int INT_CODE_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("CodePosition", INT_CODE_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CodeList_has_Code(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CodeListHasCode extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "codelisthascode77d7elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList$CodeListHasCode$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList.CodeListHasCode.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype66d5elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CODE = Enum.forString("Code");

            int INT_CODE = Enum.INT_CODE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList$CodeListHasCode$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CODE
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

                static final int INT_CODE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Code", INT_CODE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
