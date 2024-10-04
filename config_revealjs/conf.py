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

project = 'XYZ'
#copyright = ''
#author = ''


# -- General configuration ---------------------------------------------------

# Add any Sphinx extension module names here, as strings. They can be
# extensions coming with Sphinx (named 'sphinx.ext.*') or your custom
# ones.
extensions = [
    'sphinx.ext.graphviz',
    'sphinx.ext.ifconfig',
    'sphinx_design',
    'sphinx_revealjs',
#    'sphinx_selective_exclude.eager_only', # doesn't work for non-content, suppresses only the error message
]

# Add any paths that contain templates here, relative to this directory.
templates_path = ['_templates']

#include_patterns = ['*.rst']

# List of patterns, relative to source directory, that match files and
# directories to ignore when looking for source files.
# This pattern also affects html_static_path and html_extra_path.
#exclude_patterns = ['**/*']

# -- graphviz

# graphviz_dot_args = 'fontnames="svg"' # not tested, maybe better in dot file as property of graph. Is it required at all?
graphviz_output_format = 'svg'

# -- reveal.js

# themes see https://revealjs.com/themes/
revealjs_style_theme = 'sky'
#revealjs_style_theme = 'beige'
#revealjs_style_theme = 'blood'
#revealjs_style_theme = 'black'
#revealjs_style_theme = 'white'

revealjs_static_path = ["_static"]

revealjs_css_files = [
    "revealjs_custom.css",
    "common.css",
    "custom.css",
#    "verticator.css",
#    "toc-progress.css", l# how to define the plugin name?
##    "simplemenu.css",
    "menu.css",
    "revealjs4/plugin/highlight/monokai.css",
#    "revealjs4/plugin/highlight/zenburn.css",
]

# revealjs Configuration Options: https://revealjs.com/config/
revealjs_script_conf = {
    # Add the current slide number to the URL hash so that reloading the
    # page/copying the URL will return you to the same slide
    "hash": True,

    # Display the page number of the current slide
    # - true:    Show slide number
    # - false:   Hide slide number
    #
    # Can optionally be set as a string that specifies the number formatting:
    # - "h.v":	  Horizontal . vertical slide number (default)
    # - "h/v":	  Horizontal / vertical slide number
    # - "c":	  Flattened slide number
    # - "c/t":	  Flattened slide number / total slides
    #
    # Alternatively, you can provide a function that returns the slide
    # number for the current slide. The function should take in a slide
    # object and return an array with one string [slideNumber] or
    # three strings [n1,delimiter,n2]. See #formatSlideNumber().
    #slideNumber: false,
    "slideNumber": "c/t",

    # simplemenu, see https://github.com/martinomagnifico/reveal.js-simplemenu
    #   https://martinomagnifico.github.io/reveal.js-simplemenu/demo.html#/3/3
##    "simplemenu": {
##        "barhtml": { 
##            "header": "<div class='menubar'><ul class='menu'></ul></div>"
##        }
##    },
	"menu": {
		# Specifies which side of the presentation the menu will
		# be shown. Use 'left' or 'right'.
		"side": 'left',

		# Specifies the width of the menu.
		# Can be one of the following:
		# 'normal', 'wide', 'third', 'half', 'full', or
		# any valid css length value
		"width": 'normal',

		# Add slide numbers to the titles in the slide list.
		# Use 'true' or format string (same as reveal.js slide numbers)
		"numbers": False,

		# Specifies which slide elements will be used for generating
		# the slide titles in the menu. The default selects the first
		# heading element found in the slide, but you can specify any
		# valid css selector and the text from the first matching
		# element will be used.
		# Note": that a section data-menu-title attribute or an element
		# with a menu-title class will take precedence over this option
		"titleSelector": 'h1, h2, h3, h4, h5, h6',

		# If slides do not have a matching title, attempt to use the
		# start of the text content as the title instead
		"useTextContentForMissingTitles": False,

		# Hide slides from the menu that do not have a title.
		# Set to 'true' to only list slides with titles.
		"hideMissingTitles": False,

		# Adds markers to the slide titles to indicate the
		# progress through the presentation. Set to 'false'
		# to hide the markers.
		"markers": True,

		# Specify custom panels to be included in the menu, by
		# providing an array of objects with 'title', 'icon'
		# properties, and either a 'src' or 'content' property.
		"custom": False,

		# Specifies the themes that will be available in the themes
		# menu panel. Set to 'true' to show the themes menu panel
		# with the default themes list. Alternatively, provide an
		# array to specify the themes to make available in the
		# themes menu panel, for example...
		#
		# [
		#     { name": 'Black', theme": 'dist/theme/black.css' },
		#     { name": 'White', theme": 'dist/theme/white.css' },
		#     { name": 'League', theme": 'dist/theme/league.css' },
		#     {
		#       name": 'Dark',
		#       theme": 'lib/reveal.js/dist/theme/black.css',
		#       highlightTheme": 'lib/reveal.js/plugin/highlight/monokai.css'
		#     },
		#     {
		#       name": 'Code": Zenburn',
		#       highlightTheme": 'lib/reveal.js/plugin/highlight/zenburn.css'
		#     }
		# ]
		#
		# Note": specifying highlightTheme without a theme will
		# change the code highlight theme while leaving the
		# presentation theme unchanged.
		"themes": False,

		# Specifies the path to the default theme files. If your
		# presentation uses a different path to the standard reveal
		# layout then you need to provide this option, but only
		# when 'themes' is set to 'true'. If you provide your own
		# list of themes or 'themes' is set to 'false' the
		# 'themesPath' option is ignored.
		"themesPath": 'dist/theme/',

		# Specifies if the transitions menu panel will be shown.
		# Set to 'true' to show the transitions menu panel with
		# the default transitions list. Alternatively, provide an
		# array to specify the transitions to make available in
		# the transitions panel, for example...
		# ['None', 'Fade', 'Slide']
		"transitions": False,

		# Adds a menu button to the slides to open the menu panel.
		# Set to 'false' to hide the button.
		"openButton": True,

		# If 'true' allows the slide number in the presentation to
		# open the menu panel. The reveal.js slideNumber option must
		# be displayed for this to take effect
		"openSlideNumber": False,

		# If true allows the user to open and navigate the menu using
		# the keyboard. Standard keyboard interaction with reveal
		# will be disabled while the menu is open.
		"keyboard": True,

		# Normally the menu will close on user actions such as
		# selecting a menu item, or clicking the presentation area.
		# If 'true', the sticky option will leave the menu open
		# until it is explicitly closed, that is, using the close
		# button or pressing the ESC or m key (when the keyboard
		# interaction option is enabled).
		"sticky": False,

		# If 'true' standard menu items will be automatically opened
		# when navigating using the keyboard. Note": this only takes
		# effect when both the 'keyboard' and 'sticky' options are enabled.
		"autoOpen": True,

		# If 'true' the menu will not be created until it is explicitly
		# requested by calling RevealMenu.init(). Note this will delay
		# the creation of all menu panels, including custom panels, and
		# the menu button.
		"delayInit": False,

		# If 'true' the menu will be shown when the menu is initialised.
		"openOnInit": False,

		# By default the menu will load it's own font-awesome library
		# icons. If your presentation needs to load a different
		# font-awesome library the 'loadIcons' option can be set to false
		# and the menu will not attempt to load the font-awesome library.
		"loadIcons": True
	}
}

# verticator see: https://github.com/martinomagnifico/reveal.js-verticator

  # pointer: {
    # key: "m", // key to enable pointer, default "q", not case-sensitive
    # color: "red", // color of a cursor, default "red" any valid CSS color
    # opacity: 0.5, // opacity of cursor, default 0.8
    # pointerSize: 70, // pointer size in px, default 12
    # alwaysVisible: false, // should pointer mode be always visible? default "false"
    # tailLength: 10, // NOT IMPLEMENTED YET!!! how long the "tail" should be? default 10
  # }

# original width: 960 and height: 700
# 960*1.1=1056
# 960*1.2=1152
#    width: 1056,

revealjs_script_plugins = [
    {
        "src": "revealjs/plugin/highlight/highlight.js",
        "name": "RevealHighlight",
    },
    # search can slow down page
    #{
    #    "src": "revealjs/plugin/search/search.js",
    #    "name": "RevealSearch",
    #},
    {
        "src": "revealjs/plugin/zoom/zoom.js",
        "name": "RevealZoom",
    },
    # {
        # "src": "toc-progress.js",
        # "name": "toc_progress",
    # },
##    {
##        "src": "simplemenu.js",
##        "name": "Simplemenu",
###   },
    {
        "src": "menu.js",
        "name": "RevealMenu",
    },
    # {
        # "src": "pointer.js",
        # "name": "RevealPointer",
    # },
]

# def setup(app):
    # app.add_config_value('theme', 'revealjs', 'env')
