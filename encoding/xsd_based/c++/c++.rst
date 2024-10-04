C++
===

.. revealjs-vertical::
   :data-name: C++

Based on the XML Schema.

**CodeSynthesis XSD** is an open-source, cross-platform W3C XML Schema to C++ data binding compiler.

* `Product <https://www.codesynthesis.com/products/xsd/>`_
* `Installing XSD on Windows <https://www.codesynthesis.com/download/xsd/4.2/windows/README.xhtml>`_
* `C++/Tree Mapping Getting Started Guide <https://www.codesynthesis.com/projects/xsd/documentation/cxx/tree/guide/>`_

Windows Batch File
------------------

.. literalinclude:: /xsd_based/c++/run_xsd.cmd
   :language: bat
   :caption: run_xsd.cmd
   :linenos:

.. container:: font50p

   Source file `run_xsd.cmd <https://bitbucket.org/wackerow/ddi-cdi_encoding/src/master/encoding/xsd_based/c%2B%2B/run_xsd.cmd>`_

Generated Files
---------------

A code file and a header file are generated for C++.

C++ Code File Fragment
----------------------

.. literalinclude:: /xsd_based/c++/ddi-cdi_44_noXsdTypeInName.cxx
   :language: c
   :caption: Fragment of ddi-cdi_44_noXsdTypeInName.cxx
   :linenos:
   :lines: 39-64

.. container:: font50p

   Source file `ddi-cdi.cxx <https://bitbucket.org/wackerow/ddi-cdi_encoding/src/master/encoding/xsd_based/c%2B%2B/ddi-cdi_44_noXsdTypeInName.cxx>`_

C++ Header File Fragment
------------------------

.. literalinclude:: /xsd_based/c++/ddi-cdi_44_noXsdTypeInName.hxx
   :language: c
   :caption: Fragment of ddi-cdi_44_noXsdTypeInName.hxx
   :linenos:
   :lines: 853-873

.. container:: font50p

   Source file `ddi-cdi.hxx <https://bitbucket.org/wackerow/ddi-cdi_encoding/src/master/encoding/xsd_based/c%2B%2B/ddi-cdi_44_noXsdTypeInName.hxx>`__
