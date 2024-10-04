Java
====

.. revealjs-vertical::
   :data-name: Java

| Approaches are based on the XML Schema:
| **JAXB** and **XMLBeans**

* `JAXB - Eclipse Jakarta XML Binding <https://eclipse-ee4j.github.io/jaxb-ri/>`_ provides an API and tools that automate the mapping between XML documents and Java objects.
* `Apache XMLBeans <https://xmlbeans.apache.org/>`_ is a technology for accessing XML by binding it to Java types.

JAXB Generation - Windows Batch File
------------------------------------

.. literalinclude:: /xsd_based/java/run_xjc.cmd
   :caption: run_xjc.cmd
   :language: bat
   :linenos:

Generation with XMLBeans - Ant Build File
-----------------------------------------

.. literalinclude:: /xsd_based/java/build.xml
   :caption: build.xml
   :language: xml
   :linenos:

Evaluation
----------

JAXB seems to be the better choice. XMLBeans doesn't ... (to be filled in)