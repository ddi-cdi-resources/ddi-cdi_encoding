/*
 * XML Type:  ConditionalControlLogic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConditionalControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ConditionalControlLogicImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.DeterministicImperativeImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic {
    private static final long serialVersionUID = 1L;

    public ConditionalControlLogicImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "condition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "construct"),
    };


    /**
     * Gets the "condition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getCondition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "condition" element
     */
    @Override
    public void setCondition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode condition) {
        generatedSetterHelperImpl(condition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "condition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewCondition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "construct" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct.Enum getConstruct() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "construct" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct xgetConstruct() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "construct" element
     */
    @Override
    public void setConstruct(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct.Enum construct) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(construct);
        }
    }

    /**
     * Sets (as xml) the "construct" element
     */
    @Override
    public void xsetConstruct(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct construct) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(construct);
        }
    }
}
