C#
==

.. revealjs-vertical::
   :data-name: C#

Based on the XML Schema.

The Microsoft **XML Schema Definition** (Xsd.exe) tool generates XML schema or common language runtime classes from
XDR, XML, and XSD files, or from classes in a runtime assembly.

* `XML Schema Definition tool <https://learn.microsoft.com/en-us/dotnet/standard/serialization/xml-schema-definition-tool-xsd-exe>`_
* Prerequisites: `Visual Studio <https://visualstudio.microsoft.com/downloads/>`_

Windows Batch File
------------------

.. literalinclude:: /xsd_based/c#/run_xsd.cmd
   :language: bat
   :caption: run_xsd.cmd
   :linenos:

Generated File
--------------

A code file is generated for C#.

.. literalinclude:: /xsd_based/c#/ddi-cdi_44_noXsdTypeInName.cs
   :language: cs
   :caption: Fragment of ddi-cdi_44_noXsdTypeInName.cs
   :linenos:
   :lines: 19-64

.. container:: font50p

   Source file `ddi-cdi.cs <https://github.com/ddi-cdi-resources/ddi-cdi_encoding/tree/main/encoding/xsd_based/c%23/ddi-cdi_44_noXsdTypeInName.cs>`_
