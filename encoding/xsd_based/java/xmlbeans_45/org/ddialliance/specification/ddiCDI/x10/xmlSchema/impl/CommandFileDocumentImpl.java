/*
 * An XML document type.
 * Localname: CommandFile
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFileDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CommandFile(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CommandFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFileDocument {
    private static final long serialVersionUID = 1L;

    public CommandFileDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CommandFile"),
    };


    /**
     * Gets the "CommandFile" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile getCommandFile() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CommandFile" element
     */
    @Override
    public void setCommandFile(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile commandFile) {
        generatedSetterHelperImpl(commandFile, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CommandFile" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile addNewCommandFile() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
