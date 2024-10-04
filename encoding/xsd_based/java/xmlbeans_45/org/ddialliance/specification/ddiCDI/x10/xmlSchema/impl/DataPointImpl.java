/*
 * XML Type:  DataPoint
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DataPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint {
    private static final long serialVersionUID = 1L;

    public DataPointImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "catalogDetails"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPoint_correspondsTo_DataStructureComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPoint_isDescribedBy_InstanceVariable"),
    };


    /**
     * Gets the "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "catalogDetails" element
     */
    @Override
    public boolean isSetCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "catalogDetails" element
     */
    @Override
    public void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails) {
        generatedSetterHelperImpl(catalogDetails, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "catalogDetails" element
     */
    @Override
    public void unsetCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "identifier" element
     */
    @Override
    public boolean isSetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "identifier" element
     */
    @Override
    public void unsetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "DataPoint_correspondsTo_DataStructureComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent> getDataPointCorrespondsToDataStructureComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataPointCorrespondsToDataStructureComponentArray,
                this::setDataPointCorrespondsToDataStructureComponentArray,
                this::insertNewDataPointCorrespondsToDataStructureComponent,
                this::removeDataPointCorrespondsToDataStructureComponent,
                this::sizeOfDataPointCorrespondsToDataStructureComponentArray
            );
        }
    }

    /**
     * Gets array of all "DataPoint_correspondsTo_DataStructureComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent[] getDataPointCorrespondsToDataStructureComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent[0]);
    }

    /**
     * Gets ith "DataPoint_correspondsTo_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent getDataPointCorrespondsToDataStructureComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataPoint_correspondsTo_DataStructureComponent" element
     */
    @Override
    public int sizeOfDataPointCorrespondsToDataStructureComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "DataPoint_correspondsTo_DataStructureComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataPointCorrespondsToDataStructureComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent[] dataPointCorrespondsToDataStructureComponentArray) {
        check_orphaned();
        arraySetterHelper(dataPointCorrespondsToDataStructureComponentArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "DataPoint_correspondsTo_DataStructureComponent" element
     */
    @Override
    public void setDataPointCorrespondsToDataStructureComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent dataPointCorrespondsToDataStructureComponent) {
        generatedSetterHelperImpl(dataPointCorrespondsToDataStructureComponent, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPoint_correspondsTo_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent insertNewDataPointCorrespondsToDataStructureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPoint_correspondsTo_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent addNewDataPointCorrespondsToDataStructureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "DataPoint_correspondsTo_DataStructureComponent" element
     */
    @Override
    public void removeDataPointCorrespondsToDataStructureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets the "DataPoint_isDescribedBy_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable getDataPointIsDescribedByInstanceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataPoint_isDescribedBy_InstanceVariable" element
     */
    @Override
    public void setDataPointIsDescribedByInstanceVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable dataPointIsDescribedByInstanceVariable) {
        generatedSetterHelperImpl(dataPointIsDescribedByInstanceVariable, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataPoint_isDescribedBy_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable addNewDataPointIsDescribedByInstanceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }
    /**
     * An XML DataPoint_correspondsTo_DataStructureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataPointCorrespondsToDataStructureComponentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent {
        private static final long serialVersionUID = 1L;

        public DataPointCorrespondsToDataStructureComponentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint$DataPointCorrespondsToDataStructureComponent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointCorrespondsToDataStructureComponent.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML DataPoint_isDescribedBy_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataPointIsDescribedByInstanceVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable {
        private static final long serialVersionUID = 1L;

        public DataPointIsDescribedByInstanceVariableImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint$DataPointIsDescribedByInstanceVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint.DataPointIsDescribedByInstanceVariable.ValidType {
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
