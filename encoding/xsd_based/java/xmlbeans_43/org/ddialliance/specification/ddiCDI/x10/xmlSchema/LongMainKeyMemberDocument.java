/*
 * An XML document type.
 * Localname: LongMainKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LongMainKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LongMainKeyMemberDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMemberDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "longmainkeymember15e0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LongMainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember getLongMainKeyMember();

    /**
     * Sets the "LongMainKeyMember" element
     */
    void setLongMainKeyMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember longMainKeyMember);

    /**
     * Appends and returns a new empty "LongMainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember addNewLongMainKeyMember();
}
