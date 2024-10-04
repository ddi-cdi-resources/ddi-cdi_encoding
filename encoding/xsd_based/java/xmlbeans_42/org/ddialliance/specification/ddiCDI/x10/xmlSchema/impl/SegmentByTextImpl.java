/*
 * XML Type:  SegmentByText
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SegmentByText(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class SegmentByTextImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.PhysicalSegmentLocationImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText {
    private static final long serialVersionUID = 1L;

    public SegmentByTextImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "characterLength"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "endCharacterPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "endLine"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "startCharacterPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "startLine"),
    };


    /**
     * Gets the "characterLength" element
     */
    @Override
    public java.math.BigInteger getCharacterLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "characterLength" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetCharacterLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "characterLength" element
     */
    @Override
    public boolean isSetCharacterLength() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "characterLength" element
     */
    @Override
    public void setCharacterLength(java.math.BigInteger characterLength) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setBigIntegerValue(characterLength);
        }
    }

    /**
     * Sets (as xml) the "characterLength" element
     */
    @Override
    public void xsetCharacterLength(org.apache.xmlbeans.XmlInteger characterLength) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(characterLength);
        }
    }

    /**
     * Unsets the "characterLength" element
     */
    @Override
    public void unsetCharacterLength() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "endCharacterPosition" element
     */
    @Override
    public java.math.BigInteger getEndCharacterPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "endCharacterPosition" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetEndCharacterPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "endCharacterPosition" element
     */
    @Override
    public boolean isSetEndCharacterPosition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "endCharacterPosition" element
     */
    @Override
    public void setEndCharacterPosition(java.math.BigInteger endCharacterPosition) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setBigIntegerValue(endCharacterPosition);
        }
    }

    /**
     * Sets (as xml) the "endCharacterPosition" element
     */
    @Override
    public void xsetEndCharacterPosition(org.apache.xmlbeans.XmlInteger endCharacterPosition) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(endCharacterPosition);
        }
    }

    /**
     * Unsets the "endCharacterPosition" element
     */
    @Override
    public void unsetEndCharacterPosition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "endLine" element
     */
    @Override
    public java.math.BigInteger getEndLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "endLine" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetEndLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "endLine" element
     */
    @Override
    public boolean isSetEndLine() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "endLine" element
     */
    @Override
    public void setEndLine(java.math.BigInteger endLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setBigIntegerValue(endLine);
        }
    }

    /**
     * Sets (as xml) the "endLine" element
     */
    @Override
    public void xsetEndLine(org.apache.xmlbeans.XmlInteger endLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(endLine);
        }
    }

    /**
     * Unsets the "endLine" element
     */
    @Override
    public void unsetEndLine() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "startCharacterPosition" element
     */
    @Override
    public java.math.BigInteger getStartCharacterPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "startCharacterPosition" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetStartCharacterPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "startCharacterPosition" element
     */
    @Override
    public boolean isSetStartCharacterPosition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "startCharacterPosition" element
     */
    @Override
    public void setStartCharacterPosition(java.math.BigInteger startCharacterPosition) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setBigIntegerValue(startCharacterPosition);
        }
    }

    /**
     * Sets (as xml) the "startCharacterPosition" element
     */
    @Override
    public void xsetStartCharacterPosition(org.apache.xmlbeans.XmlInteger startCharacterPosition) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(startCharacterPosition);
        }
    }

    /**
     * Unsets the "startCharacterPosition" element
     */
    @Override
    public void unsetStartCharacterPosition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "startLine" element
     */
    @Override
    public java.math.BigInteger getStartLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "startLine" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetStartLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "startLine" element
     */
    @Override
    public boolean isSetStartLine() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "startLine" element
     */
    @Override
    public void setStartLine(java.math.BigInteger startLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setBigIntegerValue(startLine);
        }
    }

    /**
     * Sets (as xml) the "startLine" element
     */
    @Override
    public void xsetStartLine(org.apache.xmlbeans.XmlInteger startLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(startLine);
        }
    }

    /**
     * Unsets the "startLine" element
     */
    @Override
    public void unsetStartLine() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }
}
