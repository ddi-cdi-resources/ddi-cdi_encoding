/*
 * An XML document type.
 * Localname: CommandCode
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CommandCode(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CommandCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCodeDocument {
    private static final long serialVersionUID = 1L;

    public CommandCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CommandCode"),
    };


    /**
     * Gets the "CommandCode" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getCommandCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CommandCode" element
     */
    @Override
    public void setCommandCode(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode commandCode) {
        generatedSetterHelperImpl(commandCode, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CommandCode" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewCommandCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
