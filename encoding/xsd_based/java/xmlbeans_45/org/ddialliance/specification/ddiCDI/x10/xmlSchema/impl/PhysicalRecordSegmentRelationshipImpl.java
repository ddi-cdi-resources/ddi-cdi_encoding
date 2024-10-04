/*
 * XML Type:  PhysicalRecordSegmentRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML PhysicalRecordSegmentRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class PhysicalRecordSegmentRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship {
    private static final long serialVersionUID = 1L;

    public PhysicalRecordSegmentRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment"),
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
     * Gets a List of "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment> getPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray,
                this::setPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray,
                this::insertNewPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment,
                this::removePhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment,
                this::sizeOfPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment[] getPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment[0]);
    }

    /**
     * Gets ith "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment getPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    @Override
    public int sizeOfPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment[] physicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray) {
        check_orphaned();
        arraySetterHelper(physicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    @Override
    public void setPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment physicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment) {
        generatedSetterHelperImpl(physicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment insertNewPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment addNewPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    @Override
    public void removePhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets the "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment getPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    @Override
    public boolean isSetPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    @Override
    public void setPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment physicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment) {
        generatedSetterHelperImpl(physicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment addNewPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    @Override
    public void unsetPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
    /**
     * An XML PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment {
        private static final long serialVersionUID = 1L;

        public PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship$PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment.ValidType {
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
     * An XML PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegmentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment {
        private static final long serialVersionUID = 1L;

        public PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegmentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship$PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment.ValidType {
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
