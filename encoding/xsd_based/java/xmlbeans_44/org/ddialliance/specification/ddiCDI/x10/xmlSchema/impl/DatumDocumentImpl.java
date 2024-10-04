/*
 * An XML document type.
 * Localname: Datum
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DatumDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Datum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DatumDocument {
    private static final long serialVersionUID = 1L;

    public DatumDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Datum"),
    };


    /**
     * Gets the "Datum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum getDatum() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Datum" element
     */
    @Override
    public void setDatum(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum datum) {
        generatedSetterHelperImpl(datum, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Datum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum addNewDatum() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
