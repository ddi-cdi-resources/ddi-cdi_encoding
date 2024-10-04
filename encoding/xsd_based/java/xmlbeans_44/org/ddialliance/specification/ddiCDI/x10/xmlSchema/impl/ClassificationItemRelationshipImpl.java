/*
 * XML Type:  ClassificationItemRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ClassificationItemRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ClassificationItemRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship {
    private static final long serialVersionUID = 1L;

    public ClassificationItemRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationItemRelationship_hasSource_ClassificationItem"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationItemRelationship_hasTarget_ClassificationItem"),
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
     * Gets a List of "ClassificationItemRelationship_hasSource_ClassificationItem" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem> getClassificationItemRelationshipHasSourceClassificationItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationItemRelationshipHasSourceClassificationItemArray,
                this::setClassificationItemRelationshipHasSourceClassificationItemArray,
                this::insertNewClassificationItemRelationshipHasSourceClassificationItem,
                this::removeClassificationItemRelationshipHasSourceClassificationItem,
                this::sizeOfClassificationItemRelationshipHasSourceClassificationItemArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationItemRelationship_hasSource_ClassificationItem" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem[] getClassificationItemRelationshipHasSourceClassificationItemArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem[0]);
    }

    /**
     * Gets ith "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem getClassificationItemRelationshipHasSourceClassificationItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    @Override
    public int sizeOfClassificationItemRelationshipHasSourceClassificationItemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "ClassificationItemRelationship_hasSource_ClassificationItem" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationItemRelationshipHasSourceClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem[] classificationItemRelationshipHasSourceClassificationItemArray) {
        check_orphaned();
        arraySetterHelper(classificationItemRelationshipHasSourceClassificationItemArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    @Override
    public void setClassificationItemRelationshipHasSourceClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem classificationItemRelationshipHasSourceClassificationItem) {
        generatedSetterHelperImpl(classificationItemRelationshipHasSourceClassificationItem, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem insertNewClassificationItemRelationshipHasSourceClassificationItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem addNewClassificationItemRelationshipHasSourceClassificationItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationItemRelationship_hasSource_ClassificationItem" element
     */
    @Override
    public void removeClassificationItemRelationshipHasSourceClassificationItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "ClassificationItemRelationship_hasTarget_ClassificationItem" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem> getClassificationItemRelationshipHasTargetClassificationItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationItemRelationshipHasTargetClassificationItemArray,
                this::setClassificationItemRelationshipHasTargetClassificationItemArray,
                this::insertNewClassificationItemRelationshipHasTargetClassificationItem,
                this::removeClassificationItemRelationshipHasTargetClassificationItem,
                this::sizeOfClassificationItemRelationshipHasTargetClassificationItemArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationItemRelationship_hasTarget_ClassificationItem" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem[] getClassificationItemRelationshipHasTargetClassificationItemArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem[0]);
    }

    /**
     * Gets ith "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem getClassificationItemRelationshipHasTargetClassificationItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    @Override
    public int sizeOfClassificationItemRelationshipHasTargetClassificationItemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "ClassificationItemRelationship_hasTarget_ClassificationItem" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationItemRelationshipHasTargetClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem[] classificationItemRelationshipHasTargetClassificationItemArray) {
        check_orphaned();
        arraySetterHelper(classificationItemRelationshipHasTargetClassificationItemArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    @Override
    public void setClassificationItemRelationshipHasTargetClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem classificationItemRelationshipHasTargetClassificationItem) {
        generatedSetterHelperImpl(classificationItemRelationshipHasTargetClassificationItem, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem insertNewClassificationItemRelationshipHasTargetClassificationItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem addNewClassificationItemRelationshipHasTargetClassificationItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationItemRelationship_hasTarget_ClassificationItem" element
     */
    @Override
    public void removeClassificationItemRelationshipHasTargetClassificationItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML ClassificationItemRelationship_hasSource_ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ClassificationItemRelationshipHasSourceClassificationItemImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem {
        private static final long serialVersionUID = 1L;

        public ClassificationItemRelationshipHasSourceClassificationItemImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship$ClassificationItemRelationshipHasSourceClassificationItem$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem.ValidType {
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
     * An XML ClassificationItemRelationship_hasTarget_ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ClassificationItemRelationshipHasTargetClassificationItemImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem {
        private static final long serialVersionUID = 1L;

        public ClassificationItemRelationshipHasTargetClassificationItemImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship$ClassificationItemRelationshipHasTargetClassificationItem$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem.ValidType {
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
