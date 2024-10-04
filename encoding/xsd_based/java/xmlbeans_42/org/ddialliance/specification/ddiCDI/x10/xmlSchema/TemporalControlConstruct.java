/*
 * XML Type:  TemporalControlConstruct
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TemporalControlConstruct(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface TemporalControlConstruct extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "temporalcontrolconstruct3d1atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "temporalControl" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator.Enum getTemporalControl();

    /**
     * Gets (as xml) the "temporalControl" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator xgetTemporalControl();

    /**
     * Sets the "temporalControl" element
     */
    void setTemporalControl(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator.Enum temporalControl);

    /**
     * Sets (as xml) the "temporalControl" element
     */
    void xsetTemporalControl(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator temporalControl);
}
