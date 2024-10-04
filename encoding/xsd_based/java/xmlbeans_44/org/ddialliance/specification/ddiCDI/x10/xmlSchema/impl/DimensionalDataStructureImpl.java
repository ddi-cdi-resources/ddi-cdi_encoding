/*
 * XML Type:  DimensionalDataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DimensionalDataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DimensionalDataStructureImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.DataStructureImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure {
    private static final long serialVersionUID = 1L;

    public DimensionalDataStructureImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalDataStructure_uses_DimensionGroup"),
    };


    /**
     * Gets a List of "DimensionalDataStructure_uses_DimensionGroup" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup> getDimensionalDataStructureUsesDimensionGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionalDataStructureUsesDimensionGroupArray,
                this::setDimensionalDataStructureUsesDimensionGroupArray,
                this::insertNewDimensionalDataStructureUsesDimensionGroup,
                this::removeDimensionalDataStructureUsesDimensionGroup,
                this::sizeOfDimensionalDataStructureUsesDimensionGroupArray
            );
        }
    }

    /**
     * Gets array of all "DimensionalDataStructure_uses_DimensionGroup" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup[] getDimensionalDataStructureUsesDimensionGroupArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup[0]);
    }

    /**
     * Gets ith "DimensionalDataStructure_uses_DimensionGroup" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup getDimensionalDataStructureUsesDimensionGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionalDataStructure_uses_DimensionGroup" element
     */
    @Override
    public int sizeOfDimensionalDataStructureUsesDimensionGroupArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "DimensionalDataStructure_uses_DimensionGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionalDataStructureUsesDimensionGroupArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup[] dimensionalDataStructureUsesDimensionGroupArray) {
        check_orphaned();
        arraySetterHelper(dimensionalDataStructureUsesDimensionGroupArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "DimensionalDataStructure_uses_DimensionGroup" element
     */
    @Override
    public void setDimensionalDataStructureUsesDimensionGroupArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup dimensionalDataStructureUsesDimensionGroup) {
        generatedSetterHelperImpl(dimensionalDataStructureUsesDimensionGroup, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalDataStructure_uses_DimensionGroup" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup insertNewDimensionalDataStructureUsesDimensionGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalDataStructure_uses_DimensionGroup" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup addNewDimensionalDataStructureUsesDimensionGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionalDataStructure_uses_DimensionGroup" element
     */
    @Override
    public void removeDimensionalDataStructureUsesDimensionGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
    /**
     * An XML DimensionalDataStructure_uses_DimensionGroup(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DimensionalDataStructureUsesDimensionGroupImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup {
        private static final long serialVersionUID = 1L;

        public DimensionalDataStructureUsesDimensionGroupImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure$DimensionalDataStructureUsesDimensionGroup$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup.ValidType {
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
