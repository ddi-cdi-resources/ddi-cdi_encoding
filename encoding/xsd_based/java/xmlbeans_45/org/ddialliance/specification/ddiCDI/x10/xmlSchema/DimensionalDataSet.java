/*
 * XML Type:  DimensionalDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DimensionalDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DimensionalDataSet extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "dimensionaldataset9625type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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
     * Gets a List of "DimensionalDataSet_represents_ScopedMeasure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure> getDimensionalDataSetRepresentsScopedMeasureList();

    /**
     * Gets array of all "DimensionalDataSet_represents_ScopedMeasure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure[] getDimensionalDataSetRepresentsScopedMeasureArray();

    /**
     * Gets ith "DimensionalDataSet_represents_ScopedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure getDimensionalDataSetRepresentsScopedMeasureArray(int i);

    /**
     * Returns number of "DimensionalDataSet_represents_ScopedMeasure" element
     */
    int sizeOfDimensionalDataSetRepresentsScopedMeasureArray();

    /**
     * Sets array of all "DimensionalDataSet_represents_ScopedMeasure" element
     */
    void setDimensionalDataSetRepresentsScopedMeasureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure[] dimensionalDataSetRepresentsScopedMeasureArray);

    /**
     * Sets ith "DimensionalDataSet_represents_ScopedMeasure" element
     */
    void setDimensionalDataSetRepresentsScopedMeasureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure dimensionalDataSetRepresentsScopedMeasure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalDataSet_represents_ScopedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure insertNewDimensionalDataSetRepresentsScopedMeasure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalDataSet_represents_ScopedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure addNewDimensionalDataSetRepresentsScopedMeasure();

    /**
     * Removes the ith "DimensionalDataSet_represents_ScopedMeasure" element
     */
    void removeDimensionalDataSetRepresentsScopedMeasure(int i);

    /**
     * An XML DimensionalDataSet_represents_ScopedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DimensionalDataSetRepresentsScopedMeasure extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "dimensionaldatasetrepresentsscopedmeasure97c7elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet$DimensionalDataSetRepresentsScopedMeasure$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype5fc5elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum SCOPED_MEASURE = Enum.forString("ScopedMeasure");

            int INT_SCOPED_MEASURE = Enum.INT_SCOPED_MEASURE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet$DimensionalDataSetRepresentsScopedMeasure$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SCOPED_MEASURE
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

                static final int INT_SCOPED_MEASURE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ScopedMeasure", INT_SCOPED_MEASURE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
