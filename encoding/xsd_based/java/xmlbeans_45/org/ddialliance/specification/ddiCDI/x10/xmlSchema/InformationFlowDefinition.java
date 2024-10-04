/*
 * XML Type:  InformationFlowDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InformationFlowDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface InformationFlowDefinition extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "informationflowdefinitionddd9type");
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
     * Gets the "InformationFlowDefinition_from_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter getInformationFlowDefinitionFromParameter();

    /**
     * True if has "InformationFlowDefinition_from_Parameter" element
     */
    boolean isSetInformationFlowDefinitionFromParameter();

    /**
     * Sets the "InformationFlowDefinition_from_Parameter" element
     */
    void setInformationFlowDefinitionFromParameter(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter informationFlowDefinitionFromParameter);

    /**
     * Appends and returns a new empty "InformationFlowDefinition_from_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter addNewInformationFlowDefinitionFromParameter();

    /**
     * Unsets the "InformationFlowDefinition_from_Parameter" element
     */
    void unsetInformationFlowDefinitionFromParameter();

    /**
     * Gets a List of "InformationFlowDefinition_to_Parameter" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter> getInformationFlowDefinitionToParameterList();

    /**
     * Gets array of all "InformationFlowDefinition_to_Parameter" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter[] getInformationFlowDefinitionToParameterArray();

    /**
     * Gets ith "InformationFlowDefinition_to_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter getInformationFlowDefinitionToParameterArray(int i);

    /**
     * Returns number of "InformationFlowDefinition_to_Parameter" element
     */
    int sizeOfInformationFlowDefinitionToParameterArray();

    /**
     * Sets array of all "InformationFlowDefinition_to_Parameter" element
     */
    void setInformationFlowDefinitionToParameterArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter[] informationFlowDefinitionToParameterArray);

    /**
     * Sets ith "InformationFlowDefinition_to_Parameter" element
     */
    void setInformationFlowDefinitionToParameterArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter informationFlowDefinitionToParameter);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InformationFlowDefinition_to_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter insertNewInformationFlowDefinitionToParameter(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "InformationFlowDefinition_to_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter addNewInformationFlowDefinitionToParameter();

    /**
     * Removes the ith "InformationFlowDefinition_to_Parameter" element
     */
    void removeInformationFlowDefinitionToParameter(int i);

    /**
     * An XML InformationFlowDefinition_from_Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InformationFlowDefinitionFromParameter extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "informationflowdefinitionfromparameter46dbelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition$InformationFlowDefinitionFromParameter$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypedfd9elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PARAMETER = Enum.forString("Parameter");

            int INT_PARAMETER = Enum.INT_PARAMETER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition$InformationFlowDefinitionFromParameter$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PARAMETER
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

                static final int INT_PARAMETER = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Parameter", INT_PARAMETER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML InformationFlowDefinition_to_Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InformationFlowDefinitionToParameter extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "informationflowdefinitiontoparameterabecelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition$InformationFlowDefinitionToParameter$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype6c6aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PARAMETER = Enum.forString("Parameter");

            int INT_PARAMETER = Enum.INT_PARAMETER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition$InformationFlowDefinitionToParameter$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PARAMETER
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

                static final int INT_PARAMETER = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Parameter", INT_PARAMETER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
