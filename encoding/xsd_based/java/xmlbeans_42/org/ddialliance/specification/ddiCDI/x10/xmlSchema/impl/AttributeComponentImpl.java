/*
 * XML Type:  AttributeComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AttributeComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class AttributeComponentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.DataStructureComponentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent {
    private static final long serialVersionUID = 1L;

    public AttributeComponentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AttributeComponent_qualifies_DataStructureComponent"),
    };


    /**
     * Gets a List of "AttributeComponent_qualifies_DataStructureComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent> getAttributeComponentQualifiesDataStructureComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAttributeComponentQualifiesDataStructureComponentArray,
                this::setAttributeComponentQualifiesDataStructureComponentArray,
                this::insertNewAttributeComponentQualifiesDataStructureComponent,
                this::removeAttributeComponentQualifiesDataStructureComponent,
                this::sizeOfAttributeComponentQualifiesDataStructureComponentArray
            );
        }
    }

    /**
     * Gets array of all "AttributeComponent_qualifies_DataStructureComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent[] getAttributeComponentQualifiesDataStructureComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent[0]);
    }

    /**
     * Gets ith "AttributeComponent_qualifies_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent getAttributeComponentQualifiesDataStructureComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AttributeComponent_qualifies_DataStructureComponent" element
     */
    @Override
    public int sizeOfAttributeComponentQualifiesDataStructureComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "AttributeComponent_qualifies_DataStructureComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAttributeComponentQualifiesDataStructureComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent[] attributeComponentQualifiesDataStructureComponentArray) {
        check_orphaned();
        arraySetterHelper(attributeComponentQualifiesDataStructureComponentArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "AttributeComponent_qualifies_DataStructureComponent" element
     */
    @Override
    public void setAttributeComponentQualifiesDataStructureComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent attributeComponentQualifiesDataStructureComponent) {
        generatedSetterHelperImpl(attributeComponentQualifiesDataStructureComponent, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeComponent_qualifies_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent insertNewAttributeComponentQualifiesDataStructureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeComponent_qualifies_DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent addNewAttributeComponentQualifiesDataStructureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "AttributeComponent_qualifies_DataStructureComponent" element
     */
    @Override
    public void removeAttributeComponentQualifiesDataStructureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
    /**
     * An XML AttributeComponent_qualifies_DataStructureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class AttributeComponentQualifiesDataStructureComponentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent {
        private static final long serialVersionUID = 1L;

        public AttributeComponentQualifiesDataStructureComponentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent$AttributeComponentQualifiesDataStructureComponent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent.ValidType {
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
