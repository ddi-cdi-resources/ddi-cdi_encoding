/*
 * An XML document type.
 * Localname: KeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one KeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface KeyMemberDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMemberDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "keymember4a35doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "KeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember getKeyMember();

    /**
     * Sets the "KeyMember" element
     */
    void setKeyMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember keyMember);

    /**
     * Appends and returns a new empty "KeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember addNewKeyMember();
}
