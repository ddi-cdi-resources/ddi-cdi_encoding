/*
 * XML Type:  Statistic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Statistic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class StatisticImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic {
    private static final long serialVersionUID = 1L;

    public StatisticImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "computationBase"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "content"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isWeighted"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "typeOfNumericValue"),
    };


    /**
     * Gets the "computationBase" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList.Enum getComputationBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "computationBase" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList xgetComputationBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "computationBase" element
     */
    @Override
    public boolean isSetComputationBase() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "computationBase" element
     */
    @Override
    public void setComputationBase(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList.Enum computationBase) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(computationBase);
        }
    }

    /**
     * Sets (as xml) the "computationBase" element
     */
    @Override
    public void xsetComputationBase(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList computationBase) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(computationBase);
        }
    }

    /**
     * Unsets the "computationBase" element
     */
    @Override
    public void unsetComputationBase() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "content" element
     */
    @Override
    public double getContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "content" element
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "content" element
     */
    @Override
    public void setContent(double content) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setDoubleValue(content);
        }
    }

    /**
     * Sets (as xml) the "content" element
     */
    @Override
    public void xsetContent(org.apache.xmlbeans.XmlDouble content) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "isWeighted" element
     */
    @Override
    public boolean getIsWeighted() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isWeighted" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsWeighted() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "isWeighted" element
     */
    @Override
    public boolean isSetIsWeighted() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "isWeighted" element
     */
    @Override
    public void setIsWeighted(boolean isWeighted) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(isWeighted);
        }
    }

    /**
     * Sets (as xml) the "isWeighted" element
     */
    @Override
    public void xsetIsWeighted(org.apache.xmlbeans.XmlBoolean isWeighted) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(isWeighted);
        }
    }

    /**
     * Unsets the "isWeighted" element
     */
    @Override
    public void unsetIsWeighted() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "typeOfNumericValue" element
     */
    @Override
    public java.lang.String getTypeOfNumericValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "typeOfNumericValue" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTypeOfNumericValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "typeOfNumericValue" element
     */
    @Override
    public boolean isSetTypeOfNumericValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "typeOfNumericValue" element
     */
    @Override
    public void setTypeOfNumericValue(java.lang.String typeOfNumericValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(typeOfNumericValue);
        }
    }

    /**
     * Sets (as xml) the "typeOfNumericValue" element
     */
    @Override
    public void xsetTypeOfNumericValue(org.apache.xmlbeans.XmlString typeOfNumericValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(typeOfNumericValue);
        }
    }

    /**
     * Unsets the "typeOfNumericValue" element
     */
    @Override
    public void unsetTypeOfNumericValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}
