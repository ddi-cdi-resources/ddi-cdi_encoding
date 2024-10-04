/*
 * XML Type:  Population
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Population(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class PopulationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.UniverseImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population {
    private static final long serialVersionUID = 1L;

    public PopulationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "timePeriodOfPopulation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Population_isComposedOf_Unit"),
    };


    /**
     * Gets a List of "timePeriodOfPopulation" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange> getTimePeriodOfPopulationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTimePeriodOfPopulationArray,
                this::setTimePeriodOfPopulationArray,
                this::insertNewTimePeriodOfPopulation,
                this::removeTimePeriodOfPopulation,
                this::sizeOfTimePeriodOfPopulationArray
            );
        }
    }

    /**
     * Gets array of all "timePeriodOfPopulation" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange[] getTimePeriodOfPopulationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange[0]);
    }

    /**
     * Gets ith "timePeriodOfPopulation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getTimePeriodOfPopulationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "timePeriodOfPopulation" element
     */
    @Override
    public int sizeOfTimePeriodOfPopulationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "timePeriodOfPopulation" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTimePeriodOfPopulationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange[] timePeriodOfPopulationArray) {
        check_orphaned();
        arraySetterHelper(timePeriodOfPopulationArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "timePeriodOfPopulation" element
     */
    @Override
    public void setTimePeriodOfPopulationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange timePeriodOfPopulation) {
        generatedSetterHelperImpl(timePeriodOfPopulation, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "timePeriodOfPopulation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange insertNewTimePeriodOfPopulation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "timePeriodOfPopulation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewTimePeriodOfPopulation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "timePeriodOfPopulation" element
     */
    @Override
    public void removeTimePeriodOfPopulation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Population_isComposedOf_Unit" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit> getPopulationIsComposedOfUnitList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPopulationIsComposedOfUnitArray,
                this::setPopulationIsComposedOfUnitArray,
                this::insertNewPopulationIsComposedOfUnit,
                this::removePopulationIsComposedOfUnit,
                this::sizeOfPopulationIsComposedOfUnitArray
            );
        }
    }

    /**
     * Gets array of all "Population_isComposedOf_Unit" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit[] getPopulationIsComposedOfUnitArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit[0]);
    }

    /**
     * Gets ith "Population_isComposedOf_Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit getPopulationIsComposedOfUnitArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Population_isComposedOf_Unit" element
     */
    @Override
    public int sizeOfPopulationIsComposedOfUnitArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "Population_isComposedOf_Unit" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPopulationIsComposedOfUnitArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit[] populationIsComposedOfUnitArray) {
        check_orphaned();
        arraySetterHelper(populationIsComposedOfUnitArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "Population_isComposedOf_Unit" element
     */
    @Override
    public void setPopulationIsComposedOfUnitArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit populationIsComposedOfUnit) {
        generatedSetterHelperImpl(populationIsComposedOfUnit, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Population_isComposedOf_Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit insertNewPopulationIsComposedOfUnit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Population_isComposedOf_Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit addNewPopulationIsComposedOfUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Population_isComposedOf_Unit" element
     */
    @Override
    public void removePopulationIsComposedOfUnit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
    /**
     * An XML Population_isComposedOf_Unit(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class PopulationIsComposedOfUnitImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit {
        private static final long serialVersionUID = 1L;

        public PopulationIsComposedOfUnitImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population$PopulationIsComposedOfUnit$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population.PopulationIsComposedOfUnit.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
