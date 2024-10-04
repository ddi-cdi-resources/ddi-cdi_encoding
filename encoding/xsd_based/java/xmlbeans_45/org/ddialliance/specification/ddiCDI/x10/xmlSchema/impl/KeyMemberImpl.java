/*
 * XML Type:  KeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML KeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class KeyMemberImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.InstanceValueImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember {
    private static final long serialVersionUID = 1L;

    public KeyMemberImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyMember_isBasedOn_DataStructureComponent"),
    };


    /**
     * Gets a List of "KeyMember_isBasedOn_DataStructureComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent> getKeyMemberIsBasedOnDataStructureComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyMemberIsBasedOnDataStructureComponentArray,
                this::setKeyMemberIsBasedOnDataStructureComponentArray,
                this::insertNewKeyMemberIsBasedOnDataStructureComponent,
                this::removeKeyMemberIsBasedOnDataStructureComponent,
                this::sizeOfKeyMemberIsBasedOnDataStructureComponentArray
            );
        }
    }

    /**
     * Gets array of all "KeyMember_isBasedOn_DataStructureComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent[] getKeyMemberIsBasedOnDataStructureComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent[0]);
    }

    /**
     * Gets ith "KeyMember_isBasedOn_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent getKeyMemberIsBasedOnDataStructureComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyMember_isBasedOn_DataStructureComponent" element
     */
    @Override
    public int sizeOfKeyMemberIsBasedOnDataStructureComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "KeyMember_isBasedOn_DataStructureComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setKeyMemberIsBasedOnDataStructureComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent[] keyMemberIsBasedOnDataStructureComponentArray) {
        check_orphaned();
        arraySetterHelper(keyMemberIsBasedOnDataStructureComponentArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "KeyMember_isBasedOn_DataStructureComponent" element
     */
    @Override
    public void setKeyMemberIsBasedOnDataStructureComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent keyMemberIsBasedOnDataStructureComponent) {
        generatedSetterHelperImpl(keyMemberIsBasedOnDataStructureComponent, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyMember_isBasedOn_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent insertNewKeyMemberIsBasedOnDataStructureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyMember_isBasedOn_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent addNewKeyMemberIsBasedOnDataStructureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyMember_isBasedOn_DataStructureComponent" element
     */
    @Override
    public void removeKeyMemberIsBasedOnDataStructureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
    /**
     * An XML KeyMember_isBasedOn_DataStructureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class KeyMemberIsBasedOnDataStructureComponentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent {
        private static final long serialVersionUID = 1L;

        public KeyMemberIsBasedOnDataStructureComponentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember$KeyMemberIsBasedOnDataStructureComponent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember.KeyMemberIsBasedOnDataStructureComponent.ValidType {
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
