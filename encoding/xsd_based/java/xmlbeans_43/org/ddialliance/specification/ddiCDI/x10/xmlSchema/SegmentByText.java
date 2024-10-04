/*
 * XML Type:  SegmentByText
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SegmentByText(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface SegmentByText extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "segmentbytextd323type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "characterLength" element
     */
    java.math.BigInteger getCharacterLength();

    /**
     * Gets (as xml) the "characterLength" element
     */
    org.apache.xmlbeans.XmlInteger xgetCharacterLength();

    /**
     * True if has "characterLength" element
     */
    boolean isSetCharacterLength();

    /**
     * Sets the "characterLength" element
     */
    void setCharacterLength(java.math.BigInteger characterLength);

    /**
     * Sets (as xml) the "characterLength" element
     */
    void xsetCharacterLength(org.apache.xmlbeans.XmlInteger characterLength);

    /**
     * Unsets the "characterLength" element
     */
    void unsetCharacterLength();

    /**
     * Gets the "endCharacterPosition" element
     */
    java.math.BigInteger getEndCharacterPosition();

    /**
     * Gets (as xml) the "endCharacterPosition" element
     */
    org.apache.xmlbeans.XmlInteger xgetEndCharacterPosition();

    /**
     * True if has "endCharacterPosition" element
     */
    boolean isSetEndCharacterPosition();

    /**
     * Sets the "endCharacterPosition" element
     */
    void setEndCharacterPosition(java.math.BigInteger endCharacterPosition);

    /**
     * Sets (as xml) the "endCharacterPosition" element
     */
    void xsetEndCharacterPosition(org.apache.xmlbeans.XmlInteger endCharacterPosition);

    /**
     * Unsets the "endCharacterPosition" element
     */
    void unsetEndCharacterPosition();

    /**
     * Gets the "endLine" element
     */
    java.math.BigInteger getEndLine();

    /**
     * Gets (as xml) the "endLine" element
     */
    org.apache.xmlbeans.XmlInteger xgetEndLine();

    /**
     * True if has "endLine" element
     */
    boolean isSetEndLine();

    /**
     * Sets the "endLine" element
     */
    void setEndLine(java.math.BigInteger endLine);

    /**
     * Sets (as xml) the "endLine" element
     */
    void xsetEndLine(org.apache.xmlbeans.XmlInteger endLine);

    /**
     * Unsets the "endLine" element
     */
    void unsetEndLine();

    /**
     * Gets the "startCharacterPosition" element
     */
    java.math.BigInteger getStartCharacterPosition();

    /**
     * Gets (as xml) the "startCharacterPosition" element
     */
    org.apache.xmlbeans.XmlInteger xgetStartCharacterPosition();

    /**
     * True if has "startCharacterPosition" element
     */
    boolean isSetStartCharacterPosition();

    /**
     * Sets the "startCharacterPosition" element
     */
    void setStartCharacterPosition(java.math.BigInteger startCharacterPosition);

    /**
     * Sets (as xml) the "startCharacterPosition" element
     */
    void xsetStartCharacterPosition(org.apache.xmlbeans.XmlInteger startCharacterPosition);

    /**
     * Unsets the "startCharacterPosition" element
     */
    void unsetStartCharacterPosition();

    /**
     * Gets the "startLine" element
     */
    java.math.BigInteger getStartLine();

    /**
     * Gets (as xml) the "startLine" element
     */
    org.apache.xmlbeans.XmlInteger xgetStartLine();

    /**
     * True if has "startLine" element
     */
    boolean isSetStartLine();

    /**
     * Sets the "startLine" element
     */
    void setStartLine(java.math.BigInteger startLine);

    /**
     * Sets (as xml) the "startLine" element
     */
    void xsetStartLine(org.apache.xmlbeans.XmlInteger startLine);

    /**
     * Unsets the "startLine" element
     */
    void unsetStartLine();
}
