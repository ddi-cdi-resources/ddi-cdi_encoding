/*
 * XML Type:  TextPositionSelector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TextPositionSelector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface TextPositionSelector extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "textpositionselector2f53type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "end" element
     */
    java.math.BigInteger getEnd();

    /**
     * Gets (as xml) the "end" element
     */
    org.apache.xmlbeans.XmlInteger xgetEnd();

    /**
     * Sets the "end" element
     */
    void setEnd(java.math.BigInteger end);

    /**
     * Sets (as xml) the "end" element
     */
    void xsetEnd(org.apache.xmlbeans.XmlInteger end);

    /**
     * Gets the "start" element
     */
    java.math.BigInteger getStart();

    /**
     * Gets (as xml) the "start" element
     */
    org.apache.xmlbeans.XmlInteger xgetStart();

    /**
     * Sets the "start" element
     */
    void setStart(java.math.BigInteger start);

    /**
     * Sets (as xml) the "start" element
     */
    void xsetStart(org.apache.xmlbeans.XmlInteger start);
}
