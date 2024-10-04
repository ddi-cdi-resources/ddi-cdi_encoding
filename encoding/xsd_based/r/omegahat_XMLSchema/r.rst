R Language
==========

.. revealjs-vertical::
   :data-name: R

Approach is based on a XML Schema.

**R XMLSchema** from Duncan Temple Lang. 

.. container:: font50p

   *A package that reads XML schema into an R representation
   and can perform some operations on the resulting information to generate
   class definitions and code to read documents using this schema.*

The R representation uses S4 classes.

* `github repository <https://github.com/omegahat/XMLSchema>`_
* Usage of `readSchema <https://rdrr.io/github/omegahat/XMLSchema/man/readSchema.html>`_

Installation of XMLSchema in R
------------------------------

.. literalinclude:: /xsd_based/r/omegahat_XMLSchema/install_packages.R
   :language: r
   :linenos:

Test Run
--------

An internal representation of the XML schema is created as S4 classes.

.. literalinclude:: /xsd_based/r/omegahat_XMLSchema/script.R
   :language: r
   :linenos:

Documentation of XMLSchema
--------------------------

In R:

.. code-block:: r

   help(package="XMLSchema")

Once a local web server has been started, the documentation is displayed in the web browser.
