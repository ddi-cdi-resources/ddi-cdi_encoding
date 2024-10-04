/*
 * XML Type:  LogicalRecordRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML LogicalRecordRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class LogicalRecordRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship {
    private static final long serialVersionUID = 1L;

    public LogicalRecordRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordRelationship_hasTarget_LogicalRecord"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordRelationship_hasSource_LogicalRecord"),
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
     * Gets the "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "semantics" element
     */
    @Override
    public boolean isSetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "semantics" element
     */
    @Override
    public void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics) {
        generatedSetterHelperImpl(semantics, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "semantics" element
     */
    @Override
    public void unsetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "LogicalRecordRelationship_hasTarget_LogicalRecord" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord> getLogicalRecordRelationshipHasTargetLogicalRecordList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordRelationshipHasTargetLogicalRecordArray,
                this::setLogicalRecordRelationshipHasTargetLogicalRecordArray,
                this::insertNewLogicalRecordRelationshipHasTargetLogicalRecord,
                this::removeLogicalRecordRelationshipHasTargetLogicalRecord,
                this::sizeOfLogicalRecordRelationshipHasTargetLogicalRecordArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecordRelationship_hasTarget_LogicalRecord" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord[] getLogicalRecordRelationshipHasTargetLogicalRecordArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord[0]);
    }

    /**
     * Gets ith "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord getLogicalRecordRelationshipHasTargetLogicalRecordArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    @Override
    public int sizeOfLogicalRecordRelationshipHasTargetLogicalRecordArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "LogicalRecordRelationship_hasTarget_LogicalRecord" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordRelationshipHasTargetLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord[] logicalRecordRelationshipHasTargetLogicalRecordArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordRelationshipHasTargetLogicalRecordArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    @Override
    public void setLogicalRecordRelationshipHasTargetLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord logicalRecordRelationshipHasTargetLogicalRecord) {
        generatedSetterHelperImpl(logicalRecordRelationshipHasTargetLogicalRecord, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord insertNewLogicalRecordRelationshipHasTargetLogicalRecord(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord addNewLogicalRecordRelationshipHasTargetLogicalRecord() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    @Override
    public void removeLogicalRecordRelationshipHasTargetLogicalRecord(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "LogicalRecordRelationship_hasSource_LogicalRecord" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord> getLogicalRecordRelationshipHasSourceLogicalRecordList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordRelationshipHasSourceLogicalRecordArray,
                this::setLogicalRecordRelationshipHasSourceLogicalRecordArray,
                this::insertNewLogicalRecordRelationshipHasSourceLogicalRecord,
                this::removeLogicalRecordRelationshipHasSourceLogicalRecord,
                this::sizeOfLogicalRecordRelationshipHasSourceLogicalRecordArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecordRelationship_hasSource_LogicalRecord" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord[] getLogicalRecordRelationshipHasSourceLogicalRecordArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord[0]);
    }

    /**
     * Gets ith "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord getLogicalRecordRelationshipHasSourceLogicalRecordArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    @Override
    public int sizeOfLogicalRecordRelationshipHasSourceLogicalRecordArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "LogicalRecordRelationship_hasSource_LogicalRecord" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordRelationshipHasSourceLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord[] logicalRecordRelationshipHasSourceLogicalRecordArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordRelationshipHasSourceLogicalRecordArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    @Override
    public void setLogicalRecordRelationshipHasSourceLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord logicalRecordRelationshipHasSourceLogicalRecord) {
        generatedSetterHelperImpl(logicalRecordRelationshipHasSourceLogicalRecord, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord insertNewLogicalRecordRelationshipHasSourceLogicalRecord(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord addNewLogicalRecordRelationshipHasSourceLogicalRecord() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    @Override
    public void removeLogicalRecordRelationshipHasSourceLogicalRecord(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML LogicalRecordRelationship_hasTarget_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class LogicalRecordRelationshipHasTargetLogicalRecordImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord {
        private static final long serialVersionUID = 1L;

        public LogicalRecordRelationshipHasTargetLogicalRecordImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship$LogicalRecordRelationshipHasTargetLogicalRecord$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord.ValidType {
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
     * An XML LogicalRecordRelationship_hasSource_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class LogicalRecordRelationshipHasSourceLogicalRecordImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord {
        private static final long serialVersionUID = 1L;

        public LogicalRecordRelationshipHasSourceLogicalRecordImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship$LogicalRecordRelationshipHasSourceLogicalRecord$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord.ValidType {
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
