/*
 * XML Type:  Notation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Notation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Notation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "notation6fe0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "content" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString getContent();

    /**
     * True if has "content" element
     */
    boolean isSetContent();

    /**
     * Sets the "content" element
     */
    void setContent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString content);

    /**
     * Appends and returns a new empty "content" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString addNewContent();

    /**
     * Unsets the "content" element
     */
    void unsetContent();

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
     * Gets the "whiteSpace" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WhiteSpaceRule.Enum getWhiteSpace();

    /**
     * Gets (as xml) the "whiteSpace" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WhiteSpaceRule xgetWhiteSpace();

    /**
     * True if has "whiteSpace" element
     */
    boolean isSetWhiteSpace();

    /**
     * Sets the "whiteSpace" element
     */
    void setWhiteSpace(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WhiteSpaceRule.Enum whiteSpace);

    /**
     * Sets (as xml) the "whiteSpace" element
     */
    void xsetWhiteSpace(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WhiteSpaceRule whiteSpace);

    /**
     * Unsets the "whiteSpace" element
     */
    void unsetWhiteSpace();

    /**
     * Gets a List of "Notation_represents_Category" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory> getNotationRepresentsCategoryList();

    /**
     * Gets array of all "Notation_represents_Category" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory[] getNotationRepresentsCategoryArray();

    /**
     * Gets ith "Notation_represents_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory getNotationRepresentsCategoryArray(int i);

    /**
     * Returns number of "Notation_represents_Category" element
     */
    int sizeOfNotationRepresentsCategoryArray();

    /**
     * Sets array of all "Notation_represents_Category" element
     */
    void setNotationRepresentsCategoryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory[] notationRepresentsCategoryArray);

    /**
     * Sets ith "Notation_represents_Category" element
     */
    void setNotationRepresentsCategoryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory notationRepresentsCategory);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Notation_represents_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory insertNewNotationRepresentsCategory(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Notation_represents_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory addNewNotationRepresentsCategory();

    /**
     * Removes the ith "Notation_represents_Category" element
     */
    void removeNotationRepresentsCategory(int i);

    /**
     * An XML Notation_represents_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface NotationRepresentsCategory extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "notationrepresentscategory392felemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation$NotationRepresentsCategory$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation.NotationRepresentsCategory.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype9f71elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");

            int INT_CATEGORY = Enum.INT_CATEGORY;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation$NotationRepresentsCategory$ValidType.
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

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Category", INT_CATEGORY),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
