/*
 * XML Type:  ConditionalControlLogic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConditionalControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ConditionalControlLogic extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "conditionalcontrollogica4d3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "condition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getCondition();

    /**
     * Sets the "condition" element
     */
    void setCondition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode condition);

    /**
     * Appends and returns a new empty "condition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewCondition();

    /**
     * Gets the "construct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct.Enum getConstruct();

    /**
     * Gets (as xml) the "construct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct xgetConstruct();

    /**
     * Sets the "construct" element
     */
    void setConstruct(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct.Enum construct);

    /**
     * Sets (as xml) the "construct" element
     */
    void xsetConstruct(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct construct);
}
