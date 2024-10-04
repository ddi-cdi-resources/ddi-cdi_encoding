/*
 * XML Type:  InstanceVariableMap
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InstanceVariableMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface InstanceVariableMap extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "instancevariablemap9217type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "comparison" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator.Enum getComparison();

    /**
     * Gets (as xml) the "comparison" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator xgetComparison();

    /**
     * Sets the "comparison" element
     */
    void setComparison(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator.Enum comparison);

    /**
     * Sets (as xml) the "comparison" element
     */
    void xsetComparison(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator comparison);

    /**
     * Gets the "correspondence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition getCorrespondence();

    /**
     * Sets the "correspondence" element
     */
    void setCorrespondence(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition correspondence);

    /**
     * Appends and returns a new empty "correspondence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition addNewCorrespondence();

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
     * Gets the "setValue" element
     */
    java.lang.String getSetValue();

    /**
     * Gets (as xml) the "setValue" element
     */
    org.apache.xmlbeans.XmlString xgetSetValue();

    /**
     * Sets the "setValue" element
     */
    void setSetValue(java.lang.String setValue);

    /**
     * Sets (as xml) the "setValue" element
     */
    void xsetSetValue(org.apache.xmlbeans.XmlString setValue);

    /**
     * Gets a List of "InstanceVariableMap_hasTarget_InstanceVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable> getInstanceVariableMapHasTargetInstanceVariableList();

    /**
     * Gets array of all "InstanceVariableMap_hasTarget_InstanceVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable[] getInstanceVariableMapHasTargetInstanceVariableArray();

    /**
     * Gets ith "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable getInstanceVariableMapHasTargetInstanceVariableArray(int i);

    /**
     * Returns number of "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    int sizeOfInstanceVariableMapHasTargetInstanceVariableArray();

    /**
     * Sets array of all "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    void setInstanceVariableMapHasTargetInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable[] instanceVariableMapHasTargetInstanceVariableArray);

    /**
     * Sets ith "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    void setInstanceVariableMapHasTargetInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable instanceVariableMapHasTargetInstanceVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable insertNewInstanceVariableMapHasTargetInstanceVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable addNewInstanceVariableMapHasTargetInstanceVariable();

    /**
     * Removes the ith "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    void removeInstanceVariableMapHasTargetInstanceVariable(int i);

    /**
     * Gets a List of "InstanceVariableMap_hasSource_InstanceVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable> getInstanceVariableMapHasSourceInstanceVariableList();

    /**
     * Gets array of all "InstanceVariableMap_hasSource_InstanceVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable[] getInstanceVariableMapHasSourceInstanceVariableArray();

    /**
     * Gets ith "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable getInstanceVariableMapHasSourceInstanceVariableArray(int i);

    /**
     * Returns number of "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    int sizeOfInstanceVariableMapHasSourceInstanceVariableArray();

    /**
     * Sets array of all "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    void setInstanceVariableMapHasSourceInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable[] instanceVariableMapHasSourceInstanceVariableArray);

    /**
     * Sets ith "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    void setInstanceVariableMapHasSourceInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable instanceVariableMapHasSourceInstanceVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable insertNewInstanceVariableMapHasSourceInstanceVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable addNewInstanceVariableMapHasSourceInstanceVariable();

    /**
     * Removes the ith "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    void removeInstanceVariableMapHasSourceInstanceVariable(int i);

    /**
     * An XML InstanceVariableMap_hasTarget_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InstanceVariableMapHasTargetInstanceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "instancevariablemaphastargetinstancevariable502celemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap$InstanceVariableMapHasTargetInstanceVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee92aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");

            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap$InstanceVariableMapHasTargetInstanceVariable$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INSTANCE_VARIABLE
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

                static final int INT_INSTANCE_VARIABLE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML InstanceVariableMap_hasSource_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InstanceVariableMapHasSourceInstanceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "instancevariablemaphassourceinstancevariable4d62elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap$InstanceVariableMapHasSourceInstanceVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee660elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");

            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap$InstanceVariableMapHasSourceInstanceVariable$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INSTANCE_VARIABLE
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

                static final int INT_INSTANCE_VARIABLE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
