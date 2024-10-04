/*
 * XML Type:  SpatialPoint
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SpatialPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class SpatialPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint {
    private static final long serialVersionUID = 1L;

    public SpatialPointImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "xCoordinate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "yCoordinate"),
    };


    /**
     * Gets the "xCoordinate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate getXCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "xCoordinate" element
     */
    @Override
    public boolean isSetXCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "xCoordinate" element
     */
    @Override
    public void setXCoordinate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate xCoordinate) {
        generatedSetterHelperImpl(xCoordinate, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "xCoordinate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate addNewXCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "xCoordinate" element
     */
    @Override
    public void unsetXCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "yCoordinate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate getYCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "yCoordinate" element
     */
    @Override
    public boolean isSetYCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "yCoordinate" element
     */
    @Override
    public void setYCoordinate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate yCoordinate) {
        generatedSetterHelperImpl(yCoordinate, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "yCoordinate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate addNewYCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "yCoordinate" element
     */
    @Override
    public void unsetYCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
