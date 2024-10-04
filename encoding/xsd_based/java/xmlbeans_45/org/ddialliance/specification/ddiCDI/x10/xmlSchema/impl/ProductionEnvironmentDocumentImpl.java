/*
 * An XML document type.
 * Localname: ProductionEnvironment
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ProductionEnvironment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ProductionEnvironmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironmentDocument {
    private static final long serialVersionUID = 1L;

    public ProductionEnvironmentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ProductionEnvironment"),
    };


    /**
     * Gets the "ProductionEnvironment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment getProductionEnvironment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ProductionEnvironment" element
     */
    @Override
    public void setProductionEnvironment(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment productionEnvironment) {
        generatedSetterHelperImpl(productionEnvironment, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ProductionEnvironment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment addNewProductionEnvironment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
