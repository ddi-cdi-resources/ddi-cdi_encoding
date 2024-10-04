/*
 * XML Type:  Descriptor
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Descriptor(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Descriptor extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "descriptor5f8dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Descriptor_refersTo_ReferenceValue" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue> getDescriptorRefersToReferenceValueList();

    /**
     * Gets array of all "Descriptor_refersTo_ReferenceValue" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue[] getDescriptorRefersToReferenceValueArray();

    /**
     * Gets ith "Descriptor_refersTo_ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue getDescriptorRefersToReferenceValueArray(int i);

    /**
     * Returns number of "Descriptor_refersTo_ReferenceValue" element
     */
    int sizeOfDescriptorRefersToReferenceValueArray();

    /**
     * Sets array of all "Descriptor_refersTo_ReferenceValue" element
     */
    void setDescriptorRefersToReferenceValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue[] descriptorRefersToReferenceValueArray);

    /**
     * Sets ith "Descriptor_refersTo_ReferenceValue" element
     */
    void setDescriptorRefersToReferenceValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue descriptorRefersToReferenceValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Descriptor_refersTo_ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue insertNewDescriptorRefersToReferenceValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Descriptor_refersTo_ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue addNewDescriptorRefersToReferenceValue();

    /**
     * Removes the ith "Descriptor_refersTo_ReferenceValue" element
     */
    void removeDescriptorRefersToReferenceValue(int i);

    /**
     * Gets the "Descriptor_identifies_ReferenceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable getDescriptorIdentifiesReferenceVariable();

    /**
     * Sets the "Descriptor_identifies_ReferenceVariable" element
     */
    void setDescriptorIdentifiesReferenceVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable descriptorIdentifiesReferenceVariable);

    /**
     * Appends and returns a new empty "Descriptor_identifies_ReferenceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable addNewDescriptorIdentifiesReferenceVariable();

    /**
     * Gets the "Descriptor_hasValueFrom_DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain getDescriptorHasValueFromDescriptorValueDomain();

    /**
     * Sets the "Descriptor_hasValueFrom_DescriptorValueDomain" element
     */
    void setDescriptorHasValueFromDescriptorValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain descriptorHasValueFromDescriptorValueDomain);

    /**
     * Appends and returns a new empty "Descriptor_hasValueFrom_DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain addNewDescriptorHasValueFromDescriptorValueDomain();

    /**
     * An XML Descriptor_refersTo_ReferenceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DescriptorRefersToReferenceValue extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "descriptorreferstoreferencevalue816aelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorRefersToReferenceValue$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype85acelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum REFERENCE_VALUE = Enum.forString("ReferenceValue");

            int INT_REFERENCE_VALUE = Enum.INT_REFERENCE_VALUE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorRefersToReferenceValue$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_REFERENCE_VALUE
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

                static final int INT_REFERENCE_VALUE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ReferenceValue", INT_REFERENCE_VALUE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Descriptor_identifies_ReferenceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DescriptorIdentifiesReferenceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "descriptoridentifiesreferencevariable9dbfelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorIdentifiesReferenceVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypef2bdelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum REFERENCE_VARIABLE = Enum.forString("ReferenceVariable");

            int INT_REFERENCE_VARIABLE = Enum.INT_REFERENCE_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorIdentifiesReferenceVariable$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_REFERENCE_VARIABLE
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

                static final int INT_REFERENCE_VARIABLE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ReferenceVariable", INT_REFERENCE_VARIABLE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Descriptor_hasValueFrom_DescriptorValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DescriptorHasValueFromDescriptorValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "descriptorhasvaluefromdescriptorvaluedomain6ee9elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorHasValueFromDescriptorValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype8d67elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR_VALUE_DOMAIN = Enum.forString("DescriptorValueDomain");

            int INT_DESCRIPTOR_VALUE_DOMAIN = Enum.INT_DESCRIPTOR_VALUE_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorHasValueFromDescriptorValueDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DESCRIPTOR_VALUE_DOMAIN
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

                static final int INT_DESCRIPTOR_VALUE_DOMAIN = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DescriptorValueDomain", INT_DESCRIPTOR_VALUE_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
