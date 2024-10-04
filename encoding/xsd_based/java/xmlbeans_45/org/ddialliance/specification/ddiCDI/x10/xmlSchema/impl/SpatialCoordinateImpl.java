/*
 * XML Type:  SpatialCoordinate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SpatialCoordinate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class SpatialCoordinateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate {
    private static final long serialVersionUID = 1L;

    public SpatialCoordinateImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "content"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "coordinateType"),
    };


    /**
     * Gets the "content" element
     */
    @Override
    public java.lang.String getContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "content" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "content" element
     */
    @Override
    public boolean isSetContent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "content" element
     */
    @Override
    public void setContent(java.lang.String content) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(content);
        }
    }

    /**
     * Sets (as xml) the "content" element
     */
    @Override
    public void xsetContent(org.apache.xmlbeans.XmlString content) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(content);
        }
    }

    /**
     * Unsets the "content" element
     */
    @Override
    public void unsetContent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "coordinateType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat.Enum getCoordinateType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "coordinateType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat xgetCoordinateType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "coordinateType" element
     */
    @Override
    public boolean isSetCoordinateType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "coordinateType" element
     */
    @Override
    public void setCoordinateType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat.Enum coordinateType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(coordinateType);
        }
    }

    /**
     * Sets (as xml) the "coordinateType" element
     */
    @Override
    public void xsetCoordinateType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat coordinateType) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(coordinateType);
        }
    }

    /**
     * Unsets the "coordinateType" element
     */
    @Override
    public void unsetCoordinateType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
