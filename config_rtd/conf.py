# Configuration file for the Sphinx documentation builder.
#
# This file only contains a selection of the most common options. For a full
# list see the documentation:
# https://www.sphinx-doc.org/en/master/usage/configuration.html

# -- Path setup --------------------------------------------------------------

# If extensions (or modules to document with autodoc) are in another directory,
# add these directories to sys.path here. If the directory is relative to the
# documentation root, use os.path.abspath to make it absolute, like shown here.
#
# import os
# import sys
# sys.path.insert(0, os.path.abspath('.'))


# -- Project information -----------------------------------------------------

project = 'Syntax Representations of the DDI-CDI Model (Exploration)'
html_show_copyright = False

# -- General configuration ---------------------------------------------------

# Add any Sphinx extension module names here, as strings. They can be
# extensions coming with Sphinx (named 'sphinx.ext.*') or your custom
# ones.
extensions = [
    'sphinx.ext.graphviz',
    'sphinx.ext.ifconfig',
    'sphinx_design',
    'sphinx_rtd_theme',
#    'sphinx_selective_exclude.eager_only', # doesn't work for non-content, suppresses only the error message
]

# Add any paths that contain templates here, relative to this directory.
templates_path = ['_templates']

#include_patterns = [*.rst]

# List of patterns, relative to source directory, that match files and
# directories to ignore when looking for source files.
# This pattern also affects html_static_path and html_extra_path.
exclude_patterns = []


# -- Options for HTML output -------------------------------------------------

# The theme to use for HTML and HTML Help pages.  See the documentation for
# a list of builtin themes.
#
html_theme = 'sphinx_rtd_theme'
#html_theme = 'classic'
#html_theme = 'alabaster'

# Add any paths that contain custom static files (such as style sheets) here,
# relative to this directory. They are copied after the builtin static files,
# so a file named "default.css" will overwrite the builtin "default.css".
html_static_path = ['_static']

###  additional configuration

html_css_files = [
    'html_custom.css',
    'common.css',
]

# html_js_files = [
	# 'html_custom.js'
# ]

html_theme_options = {
 	'body_max_width'		: 'auto',
## 	'collapsiblesidebar'	: 'true',	# Add an experimental JavaScript snippet that makes the sidebar collapsible via a button on its side
# 	'externalrefs'			: 'true',	# Display external links differently from internal links
 	'navigation_with_keys'	: 'true',	# Allow navigating to the previous/next page using the keyboard’s left and right arrows
 	'sidebarwidth'			: '22em',	# width for the widest TOC entry, also width of the logo
# 	'sidebarwidth'			: '330px',	# width for the widest TOC entry, also width of the logo
# 	'sidebarwidth'			: '290px',	# width for the widest TOC entry, also width of the logo
 	##'stickysidebar'			: 'false',	# not possible together with collapsiblesidebar
}

html_show_sphinx = False
html_show_sourcelink = False

html_sidebars = {
#	'**': ['globaltoc.html', 'sourcelink.html']
	'**': ['searchbox.html', 'globaltoc.html', 'sourcelink.html']
}

# -- grapviz

# graphviz_dot_args = 'fontnames="svg"' # not tested, maybe better in dot file as property of graph. Is it required at all?
graphviz_output_format = 'svg'

# def setup(app):
    # app.add_config_value('theme', 'rtd', 'env')
