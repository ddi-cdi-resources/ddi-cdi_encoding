/*
 * XML Type:  StructureSpecification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructureSpecification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class StructureSpecificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification {
    private static final long serialVersionUID = 1L;

    public StructureSpecificationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "reflexive"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "symmetric"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "transitive"),
    };


    /**
     * Gets the "reflexive" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum getReflexive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "reflexive" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope xgetReflexive() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "reflexive" element
     */
    @Override
    public boolean isSetReflexive() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "reflexive" element
     */
    @Override
    public void setReflexive(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum reflexive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(reflexive);
        }
    }

    /**
     * Sets (as xml) the "reflexive" element
     */
    @Override
    public void xsetReflexive(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope reflexive) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(reflexive);
        }
    }

    /**
     * Unsets the "reflexive" element
     */
    @Override
    public void unsetReflexive() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "symmetric" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum getSymmetric() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "symmetric" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope xgetSymmetric() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "symmetric" element
     */
    @Override
    public boolean isSetSymmetric() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "symmetric" element
     */
    @Override
    public void setSymmetric(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum symmetric) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(symmetric);
        }
    }

    /**
     * Sets (as xml) the "symmetric" element
     */
    @Override
    public void xsetSymmetric(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope symmetric) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(symmetric);
        }
    }

    /**
     * Unsets the "symmetric" element
     */
    @Override
    public void unsetSymmetric() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "transitive" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum getTransitive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "transitive" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope xgetTransitive() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "transitive" element
     */
    @Override
    public boolean isSetTransitive() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "transitive" element
     */
    @Override
    public void setTransitive(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum transitive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(transitive);
        }
    }

    /**
     * Sets (as xml) the "transitive" element
     */
    @Override
    public void xsetTransitive(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope transitive) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(transitive);
        }
    }

    /**
     * Unsets the "transitive" element
     */
    @Override
    public void unsetTransitive() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}
