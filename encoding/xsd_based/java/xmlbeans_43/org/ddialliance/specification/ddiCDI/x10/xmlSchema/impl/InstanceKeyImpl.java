/*
 * XML Type:  InstanceKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML InstanceKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class InstanceKeyImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.KeyImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey {
    private static final long serialVersionUID = 1L;

    public InstanceKeyImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceKey_has_InstanceValue"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceKey_refersTo_ReferenceValue"),
    };


    /**
     * Gets the "InstanceKey_has_InstanceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue getInstanceKeyHasInstanceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "InstanceKey_has_InstanceValue" element
     */
    @Override
    public boolean isSetInstanceKeyHasInstanceValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "InstanceKey_has_InstanceValue" element
     */
    @Override
    public void setInstanceKeyHasInstanceValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue instanceKeyHasInstanceValue) {
        generatedSetterHelperImpl(instanceKeyHasInstanceValue, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InstanceKey_has_InstanceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue addNewInstanceKeyHasInstanceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "InstanceKey_has_InstanceValue" element
     */
    @Override
    public void unsetInstanceKeyHasInstanceValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "InstanceKey_refersTo_ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue getInstanceKeyRefersToReferenceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "InstanceKey_refersTo_ReferenceValue" element
     */
    @Override
    public void setInstanceKeyRefersToReferenceValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue instanceKeyRefersToReferenceValue) {
        generatedSetterHelperImpl(instanceKeyRefersToReferenceValue, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InstanceKey_refersTo_ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue addNewInstanceKeyRefersToReferenceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }
    /**
     * An XML InstanceKey_has_InstanceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class InstanceKeyHasInstanceValueImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue {
        private static final long serialVersionUID = 1L;

        public InstanceKeyHasInstanceValueImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey$InstanceKeyHasInstanceValue$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue.ValidType {
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
     * An XML InstanceKey_refersTo_ReferenceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class InstanceKeyRefersToReferenceValueImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue {
        private static final long serialVersionUID = 1L;

        public InstanceKeyRefersToReferenceValueImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey$InstanceKeyRefersToReferenceValue$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue.ValidType {
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
