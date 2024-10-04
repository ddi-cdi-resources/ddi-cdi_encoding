/*
 * XML Type:  Population
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Population(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Population extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "population2e6btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "timePeriodOfPopulation" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange> getTimePeriodOfPopulationList();

    /**
     * Gets array of all "timePeriodOfPopulation" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange[] getTimePeriodOfPopulationArray();

    /**
     * Gets ith "timePeriodOfPopulation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getTimePeriodOfPopulationArray(int i);

    /**
     * Returns number of "timePeriodOfPopulation" element
     */
    int sizeOfTimePeriodOfPopulationArray();

    /**
     * Sets array of all "timePeriodOfPopulation" element
     */
    void setTimePeriodOfPopulationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange[] timePeriodOfPopulationArray);

    /**
     * Sets ith "timePeriodOfPopulation" element
     */
    void setTimePeriodOfPopulationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange timePeriodOfPopulation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "timePeriodOfPopulation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange insertNewTimePeriodOfPopulation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "timePeriodOfPopulation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewTimePeriodOfPopulation();

    /**
     * Removes the ith "timePeriodOfPopulation" element
     */
    void removeTimePeriodOfPopulation(int i);

    /**
     * Gets a List of "Population_isComposedOf_Unit" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit> getPopulationIsComposedOfUnitList();

    /**
     * Gets array of all "Population_isComposedOf_Unit" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit[] getPopulationIsComposedOfUnitArray();

    /**
     * Gets ith "Population_isComposedOf_Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit getPopulationIsComposedOfUnitArray(int i);

    /**
     * Returns number of "Population_isComposedOf_Unit" element
     */
    int sizeOfPopulationIsComposedOfUnitArray();

    /**
     * Sets array of all "Population_isComposedOf_Unit" element
     */
    void setPopulationIsComposedOfUnitArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit[] populationIsComposedOfUnitArray);

    /**
     * Sets ith "Population_isComposedOf_Unit" element
     */
    void setPopulationIsComposedOfUnitArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit populationIsComposedOfUnit);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Population_isComposedOf_Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit insertNewPopulationIsComposedOfUnit(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Population_isComposedOf_Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit addNewPopulationIsComposedOfUnit();

    /**
     * Removes the ith "Population_isComposedOf_Unit" element
     */
    void removePopulationIsComposedOfUnit(int i);

    /**
     * An XML Population_isComposedOf_Unit(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PopulationIsComposedOfUnit extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "populationiscomposedofunit8051elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population$PopulationIsComposedOfUnit$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype5e13elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum UNIT = Enum.forString("Unit");

            int INT_UNIT = Enum.INT_UNIT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population$PopulationIsComposedOfUnit$ValidType.
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
}
