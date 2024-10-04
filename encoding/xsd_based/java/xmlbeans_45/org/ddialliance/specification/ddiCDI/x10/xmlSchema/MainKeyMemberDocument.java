/*
 * An XML document type.
 * Localname: MainKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MainKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface MainKeyMemberDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMemberDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "mainkeymember6c7cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember getMainKeyMember();

    /**
     * Sets the "MainKeyMember" element
     */
    void setMainKeyMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember mainKeyMember);

    /**
     * Appends and returns a new empty "MainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember addNewMainKeyMember();
}
