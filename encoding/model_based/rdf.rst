RDF
===

.. revealjs-vertical::
   :data-name: RDF

The encodings **ontology as Turtle** and **JSON-LD** are directly based on the UML model.
They are generated with the `UCMIS Model-to-Text tool <https://bitbucket.org/wackerow/ucmis.m2t/src/master/>`_.

Ontology as Turtle
------------------

* Main file `ddi-cdi.onto.ttl <https://ddi-cdi.github.io/ddi-cdi_v1.0-rc3/encoding/ontology/ddi-cdi.onto.ttl>`_
* Fragments per class and data types are available in the field-level documentation of DDI-CDI. See the section 'encodings' on the
  bottom of the example `InstanceVariable
  <https://ddi-cdi.github.io/ddi-cdi_v1.0-rc3/field-level-documentation/DDICDILibrary/Classes/Conceptual/InstanceVariable.html#inheritance>`_.

Generator Code for Ontology as Turtle
-------------------------------------

Acceleo code for generating Turtle on the basis of UML classes.

.. literalinclude:: /m2t/target/onto/classOnto.mtl
   :caption: classOnto.mtl
   :linenos:

.. container:: font50p

   .. raw:: html

      Source files at
      <a target="_blank" href="https://bitbucket.org/wackerow/ucmis.m2t/src/master/src/ucmis/m2t/target/onto/">UCMIS M2T repository</a>.

JSON-LD
-------

* Main file `ddi-cdi.jsonld <https://ddi-cdi.github.io/ddi-cdi_v1.0-rc3/encoding/json-ld/ddi-cdi.jsonld>`_
* Fragments per class and data types are available in the field-level documentation of DDI-CDI. See the section 'encodings' on the bottom of the
  example `InstanceVariable
  <https://ddi-cdi.github.io/ddi-cdi_v1.0-rc3/field-level-documentation/DDICDILibrary/Classes/Conceptual/InstanceVariable.html#inheritance>`_.
