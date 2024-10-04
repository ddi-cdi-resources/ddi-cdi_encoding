/*
 * XML Type:  LogicalRecord
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class LogicalRecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord {
    private static final long serialVersionUID = 1L;

    public LogicalRecordImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecord_organizes_DataSet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecord_isDefinedBy_Concept"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecord_has_InstanceVariable"),
    };


    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "LogicalRecord_organizes_DataSet" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet> getLogicalRecordOrganizesDataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordOrganizesDataSetArray,
                this::setLogicalRecordOrganizesDataSetArray,
                this::insertNewLogicalRecordOrganizesDataSet,
                this::removeLogicalRecordOrganizesDataSet,
                this::sizeOfLogicalRecordOrganizesDataSetArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecord_organizes_DataSet" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet[] getLogicalRecordOrganizesDataSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet[0]);
    }

    /**
     * Gets ith "LogicalRecord_organizes_DataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet getLogicalRecordOrganizesDataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecord_organizes_DataSet" element
     */
    @Override
    public int sizeOfLogicalRecordOrganizesDataSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "LogicalRecord_organizes_DataSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordOrganizesDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet[] logicalRecordOrganizesDataSetArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordOrganizesDataSetArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "LogicalRecord_organizes_DataSet" element
     */
    @Override
    public void setLogicalRecordOrganizesDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet logicalRecordOrganizesDataSet) {
        generatedSetterHelperImpl(logicalRecordOrganizesDataSet, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecord_organizes_DataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet insertNewLogicalRecordOrganizesDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecord_organizes_DataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet addNewLogicalRecordOrganizesDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecord_organizes_DataSet" element
     */
    @Override
    public void removeLogicalRecordOrganizesDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "LogicalRecord_isDefinedBy_Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept> getLogicalRecordIsDefinedByConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordIsDefinedByConceptArray,
                this::setLogicalRecordIsDefinedByConceptArray,
                this::insertNewLogicalRecordIsDefinedByConcept,
                this::removeLogicalRecordIsDefinedByConcept,
                this::sizeOfLogicalRecordIsDefinedByConceptArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecord_isDefinedBy_Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept[] getLogicalRecordIsDefinedByConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept[0]);
    }

    /**
     * Gets ith "LogicalRecord_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept getLogicalRecordIsDefinedByConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecord_isDefinedBy_Concept" element
     */
    @Override
    public int sizeOfLogicalRecordIsDefinedByConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "LogicalRecord_isDefinedBy_Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept[] logicalRecordIsDefinedByConceptArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordIsDefinedByConceptArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "LogicalRecord_isDefinedBy_Concept" element
     */
    @Override
    public void setLogicalRecordIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept logicalRecordIsDefinedByConcept) {
        generatedSetterHelperImpl(logicalRecordIsDefinedByConcept, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecord_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept insertNewLogicalRecordIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecord_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept addNewLogicalRecordIsDefinedByConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecord_isDefinedBy_Concept" element
     */
    @Override
    public void removeLogicalRecordIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "LogicalRecord_has_InstanceVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable> getLogicalRecordHasInstanceVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordHasInstanceVariableArray,
                this::setLogicalRecordHasInstanceVariableArray,
                this::insertNewLogicalRecordHasInstanceVariable,
                this::removeLogicalRecordHasInstanceVariable,
                this::sizeOfLogicalRecordHasInstanceVariableArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecord_has_InstanceVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable[] getLogicalRecordHasInstanceVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable[0]);
    }

    /**
     * Gets ith "LogicalRecord_has_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable getLogicalRecordHasInstanceVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecord_has_InstanceVariable" element
     */
    @Override
    public int sizeOfLogicalRecordHasInstanceVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "LogicalRecord_has_InstanceVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordHasInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable[] logicalRecordHasInstanceVariableArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordHasInstanceVariableArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "LogicalRecord_has_InstanceVariable" element
     */
    @Override
    public void setLogicalRecordHasInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable logicalRecordHasInstanceVariable) {
        generatedSetterHelperImpl(logicalRecordHasInstanceVariable, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecord_has_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable insertNewLogicalRecordHasInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecord_has_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable addNewLogicalRecordHasInstanceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecord_has_InstanceVariable" element
     */
    @Override
    public void removeLogicalRecordHasInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML LogicalRecord_organizes_DataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class LogicalRecordOrganizesDataSetImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet {
        private static final long serialVersionUID = 1L;

        public LogicalRecordOrganizesDataSetImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordOrganizesDataSet$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet.ValidType {
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
     * An XML LogicalRecord_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class LogicalRecordIsDefinedByConceptImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept {
        private static final long serialVersionUID = 1L;

        public LogicalRecordIsDefinedByConceptImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordIsDefinedByConcept$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept.ValidType {
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
     * An XML LogicalRecord_has_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class LogicalRecordHasInstanceVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable {
        private static final long serialVersionUID = 1L;

        public LogicalRecordHasInstanceVariableImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordHasInstanceVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable.ValidType {
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
