/*
 * XML Type:  InformationFlowDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML InformationFlowDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class InformationFlowDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition {
    private static final long serialVersionUID = 1L;

    public InformationFlowDefinitionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InformationFlowDefinition_from_Parameter"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InformationFlowDefinition_to_Parameter"),
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
     * Gets the "InformationFlowDefinition_from_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter getInformationFlowDefinitionFromParameter() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "InformationFlowDefinition_from_Parameter" element
     */
    @Override
    public boolean isSetInformationFlowDefinitionFromParameter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "InformationFlowDefinition_from_Parameter" element
     */
    @Override
    public void setInformationFlowDefinitionFromParameter(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter informationFlowDefinitionFromParameter) {
        generatedSetterHelperImpl(informationFlowDefinitionFromParameter, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InformationFlowDefinition_from_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter addNewInformationFlowDefinitionFromParameter() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "InformationFlowDefinition_from_Parameter" element
     */
    @Override
    public void unsetInformationFlowDefinitionFromParameter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "InformationFlowDefinition_to_Parameter" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter> getInformationFlowDefinitionToParameterList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInformationFlowDefinitionToParameterArray,
                this::setInformationFlowDefinitionToParameterArray,
                this::insertNewInformationFlowDefinitionToParameter,
                this::removeInformationFlowDefinitionToParameter,
                this::sizeOfInformationFlowDefinitionToParameterArray
            );
        }
    }

    /**
     * Gets array of all "InformationFlowDefinition_to_Parameter" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter[] getInformationFlowDefinitionToParameterArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter[0]);
    }

    /**
     * Gets ith "InformationFlowDefinition_to_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter getInformationFlowDefinitionToParameterArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "InformationFlowDefinition_to_Parameter" element
     */
    @Override
    public int sizeOfInformationFlowDefinitionToParameterArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "InformationFlowDefinition_to_Parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInformationFlowDefinitionToParameterArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter[] informationFlowDefinitionToParameterArray) {
        check_orphaned();
        arraySetterHelper(informationFlowDefinitionToParameterArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "InformationFlowDefinition_to_Parameter" element
     */
    @Override
    public void setInformationFlowDefinitionToParameterArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter informationFlowDefinitionToParameter) {
        generatedSetterHelperImpl(informationFlowDefinitionToParameter, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InformationFlowDefinition_to_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter insertNewInformationFlowDefinitionToParameter(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "InformationFlowDefinition_to_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter addNewInformationFlowDefinitionToParameter() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "InformationFlowDefinition_to_Parameter" element
     */
    @Override
    public void removeInformationFlowDefinitionToParameter(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }
    /**
     * An XML InformationFlowDefinition_from_Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class InformationFlowDefinitionFromParameterImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter {
        private static final long serialVersionUID = 1L;

        public InformationFlowDefinitionFromParameterImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition$InformationFlowDefinitionFromParameter$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionFromParameter.ValidType {
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
     * An XML InformationFlowDefinition_to_Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class InformationFlowDefinitionToParameterImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter {
        private static final long serialVersionUID = 1L;

        public InformationFlowDefinitionToParameterImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition$InformationFlowDefinitionToParameter$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition.InformationFlowDefinitionToParameter.ValidType {
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
