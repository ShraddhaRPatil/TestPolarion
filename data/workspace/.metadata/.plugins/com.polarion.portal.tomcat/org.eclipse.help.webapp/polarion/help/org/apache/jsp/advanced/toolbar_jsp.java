/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2017-06-22 04:26:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class toolbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/advanced/header.jsp", Long.valueOf(1252574902000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("org.eclipse.help.internal.webapp.data");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
 
request.setCharacterEncoding("UTF-8");
boolean isRTL = UrlUtil.isRTL(request, response);
String  direction = isRTL?"rtl":"ltr";
if (new RequestData(application,request, response).isMozilla()) {

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\">\n");
 
} else {

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");

}

      out.write("<!------------------------------------------------------------------------------\n");
      out.write(" ! Copyright (c) 2000, 2004 IBM Corporation and others.\n");
      out.write(" ! All rights reserved. This program and the accompanying materials \n");
      out.write(" ! are made available under the terms of the Eclipse Public License v1.0\n");
      out.write(" ! which accompanies this distribution, and is available at\n");
      out.write(" ! http://www.eclipse.org/legal/epl-v10.html\n");
      out.write(" ! \n");
      out.write(" ! Contributors:\n");
      out.write(" !     IBM Corporation - initial API and implementation\n");
      out.write(" ------------------------------------------------------------------------------->");
      out.write('\n');
      out.write('\n');
 
	ToolbarData data = new ToolbarData(application,request, response);
	WebappPreferences prefs = data.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("Toolbar", request));
      out.write("</title>\n");
      out.write(" \n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("/* need this one for Mozilla */\n");
      out.write("HTML { \n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("BODY {\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("}\n");
      out.write("\n");
      out.write("#titleText {\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tcolor:WindowText;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".buttonOn a { \n");
      out.write("\tdisplay:block;\n");
      out.write("\tmargin-left:2px;\n");
      out.write("\tmargin-right:2px;\n");
      out.write("\twidth:");
      out.print(data.isMozilla()?18:20);
      out.write("px;\n");
      out.write("\theight:");
      out.print(data.isMozilla()?18:20);
      out.write("px;\n");
      out.write("\tborder:1px solid Highlight;\n");
      out.write("\twriting-mode:tb-rl;\n");
      out.write("\tvertical-align:middle;\n");
      out.write("\tbackground: ");
      out.print(prefs.getViewBackground());
      out.write(";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button a { \n");
      out.write("\tdisplay:block;\n");
      out.write("\tmargin-left:2px;\n");
      out.write("\tmargin-right:2px;\n");
      out.write("\twidth:");
      out.print(data.isMozilla()?18:20);
      out.write("px;\n");
      out.write("\theight:");
      out.print(data.isMozilla()?18:20);
      out.write("px;\n");
      out.write("\tborder:1px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\twriting-mode:tb-rl;\n");
      out.write("\tvertical-align:middle;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button a:hover { \n");
      out.write("\tborder-top:1px solid ButtonHighlight; \n");
      out.write("\tborder-");
      out.print(isRTL?"right":"left");
      out.write(":1px solid ButtonHighlight; \n");
      out.write("\tborder-");
      out.print(isRTL?"left":"right");
      out.write(":1px solid ButtonShadow; \n");
      out.write("\tborder-bottom:1px solid ButtonShadow;\n");
      out.write("}\n");
      out.write("\n");
 if (data.isIE() || data.isMozilla() && "1.2.1".compareTo(data.getMozillaVersion()) <=0){
// maximize (last) button should not jump

      out.write('\n');
      out.write('#');
      out.write('b');
      out.print(data.getButtons().length-1);
      out.write(":hover{\n");
      out.write("\tborder:1px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("}\n");
}
      out.write("\n");
      out.write("\n");
      out.write(".separator {\n");
      out.write("\tbackground-color: ThreeDShadow;\n");
      out.write("\theight:100%;\n");
      out.write("\twidth: 1px;\n");
      out.write("\tborder-top:2px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder-bottom:2px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder-left:3px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder-right:3px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#container {\n");
      out.write("\tborder-bottom:1px solid ThreeDShadow;\n");

if (data.isIE()) {

      out.write(' ');
      out.write('\n');

}else if (data.isMozilla()){

      out.write("\n");
      out.write("\tborder-top:1px solid ThreeDShadow;\n");
      out.write("\theight:24px;\n");

}

      out.write("\n");
      out.write("}\n");
      out.write("\n");

// workaround for adding right border on mozilla (ugly..)
if (data.isMozilla() && "content".equals(request.getParameter("toolbar"))) { 

      out.write("\n");
      out.write("\n");
      out.write("/* need this one for Mozilla */\n");
      out.write("HTML { \n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("}\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("var bRestore = false;\n");
      out.write("// Preload images\n");

ToolbarButton[] buttons = data.getButtons();
for (int i=0; i<buttons.length; i++) {
	if (!buttons[i].isSeparator()) {

      out.write("\n");
      out.write("\tvar ");
      out.print(buttons[i].getName());
      out.write(" = new Image();\n");
      out.write("\t");
      out.print(buttons[i].getName());
      out.write(".src = \"");
      out.print(buttons[i].getOnImage());
      out.write('"');
      out.write(';');
      out.write('\n');

	}
}

      out.write("\n");
      out.write("\n");
      out.write("function setTitle(label)\n");
      out.write("{\n");
      out.write("\tif( label == null) label = \"\";\n");
      out.write("\tvar title = document.getElementById(\"titleText\");\n");
      out.write("\tif (title == null) return;\n");
      out.write("\tvar text = title.lastChild;\n");
      out.write("\tif (text == null) return;\n");
      out.write("\ttext.nodeValue = label;\n");
      out.write("}\n");
      out.write("\n");
 if (data.isIE()
	|| data.isMozilla() && "1.2.1".compareTo(data.getMozillaVersion()) <=0
	|| (data.isSafari() && "120".compareTo(data.getSafariVersion()) <= 0) ){

      out.write("\n");
      out.write("function registerMaximizedChangedListener(){\n");
      out.write("\t// get to the frameset\n");
      out.write("\tvar p = parent;\n");
      out.write("\twhile (p && !p.registerMaximizeListener)\n");
      out.write("\t\tp = p.parent;\n");
      out.write("\t\n");
      out.write("\tif (p!= null){\n");
      out.write("\t\tp.registerMaximizeListener('");
      out.print(data.getName());
      out.write("Toolbar', maximizedChanged);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("registerMaximizedChangedListener();\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Handler for double click: maximize/restore this view\n");
      out.write(" * Note: Mozilla browsers prior to 1.2.1 do not support programmatic frame resizing well.\n");
      out.write(" */\n");
      out.write("function mouseDblClickHandler(e) {\n");
      out.write("\t// ignore double click on buttons\n");
      out.write("\tvar target=");
      out.print(data.isIE()?"window.event.srcElement":"e.target");
      out.write(";\n");
      out.write("\tif (target.tagName && (target.tagName == \"A\" || target.tagName == \"IMG\"))\n");
      out.write("\t\treturn;\n");
      out.write("\ttoggleFrame();\n");
      out.write("\treturn false;\n");
      out.write("}\t\t\n");
      out.write("function restore_maximize(button)\n");
      out.write("{\n");
      out.write("\ttoggleFrame();\n");
      out.write("\tif (isIE && button && document.getElementById(button)){\n");
      out.write("\t\tdocument.getElementById(button).blur();\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function toggleFrame(){\n");
      out.write("\t// get to the frameset\n");
      out.write("\tvar p = parent;\n");
      out.write("\twhile (p && !p.toggleFrame)\n");
      out.write("\t\tp = p.parent;\n");
      out.write("\t\n");
      out.write("\tif (p!= null){\n");
      out.write("\t\tp.toggleFrame('");
      out.print(data.getTitle());
      out.write("');\n");
      out.write("\t}\n");
      out.write("\tdocument.selection.clear;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("function maximizedChanged(maximizedNotRestored){\n");
      out.write("\tif(maximizedNotRestored){\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").src=\"");
      out.print(data.getRestoreImage());
      out.write("\";\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").setAttribute(\"title\", \"");
      out.print(data.getRestoreTooltip());
      out.write("\");\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").setAttribute(\"alt\", \"");
      out.print(data.getRestoreTooltip());
      out.write("\");\n");
      out.write("\t\tbRestore = true;\n");
      out.write("\t}else{\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").src=\"");
      out.print(data.getMaximizeImage());
      out.write("\";\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").setAttribute(\"title\", \"");
      out.print(data.getMaximizeTooltip());
      out.write("\");\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").setAttribute(\"alt\", \"");
      out.print(data.getMaximizeTooltip());
      out.write("\");\n");
      out.write("\t\tbRestore = false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.print(( data.isIE() || data.isSafari() )?
	"document.ondblclick = mouseDblClickHandler;"
:
	"document.addEventListener('dblclick', mouseDblClickHandler, true);");
      out.write('\n');
}
      out.write("\n");
      out.write("\n");
      out.write("function setButtonState(buttonName, pressed) {\n");
      out.write("\tif(!document.getElementById(\"tdb_\"+buttonName))\n");
      out.write("\t\treturn;\n");
      out.write("\tif(pressed){\n");
      out.write("\t\tdocument.getElementById(\"tdb_\"+buttonName).className=\"buttonOn\";\n");
      out.write("\t}else{\n");
      out.write("\t\tdocument.getElementById(\"tdb_\"+buttonName).className=\"button\";\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function setWindowStatus(buttonName){\n");
      out.write("\t");

	for (int i=0; i<buttons.length; i++) {
		String name = buttons[i].getName();
      out.write("\n");
      out.write("\t\tif (buttonName == \"");
      out.print(name);
      out.write("\"){\n");
      out.write("\t\t\tif (buttonName == \"maximize_restore\"){\n");
      out.write("\t\t\t\tif (bRestore){\n");
      out.write("\t\t\t\t\twindow.status = \"");
      out.print(data.getRestoreTooltip());
      out.write("\";\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\twindow.status = \"");
      out.print(data.getMaximizeTooltip());
      out.write("\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\twindow.status = \"");
      out.print(buttons[i].getTooltip());
      out.write("\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t");
	
	}
	
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");

if (data.getScript() != null) {

      out.write("\n");
      out.write("<script language=\"JavaScript\" src=\"");
      out.print(data.getScript());
      out.write("\"></script>\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write(" \n");

if(buttons.length > 0){

      out.write("\n");
      out.write("\t<body dir=\"");
      out.print(direction);
      out.write('"');
      out.write('>');
      out.write('\n');

}else{

      out.write("\n");
      out.write("\t<body dir=\"");
      out.print(direction);
      out.write("\" tabIndex=\"-1\">\n");

}

      out.write("\n");
      out.write("\n");
      out.write("<table id=\"container\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"100%\" style='padding-");
      out.print(isRTL?"right":"left");
      out.write(':');
      out.print(data.isIE()?"5px":"8px");
      out.write(";'>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td nowrap style=\"font: ");
      out.print(prefs.getToolbarFont());
      out.write("\" valign=\"middle\">\n");
      out.write("\t\t\t<div id=\"titleTextTableDiv\" style=\"overflow:hidden; height:22px;\"><table><tr><td nowrap style=\"font:");
      out.print(prefs.getToolbarFont());
      out.write("\"><div id=\"titleText\" >&nbsp;");
      out.print(data.getTitle());
      out.write("</div></td></tr></table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div style=\"position:absolute; top:1px; ");
      out.print(isRTL?"left":"right");
      out.write(":0px;\">\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" height=\"100%\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td align=\"");
      out.print(isRTL?"left":"right");
      out.write("\">\n");
      out.write("\t\t\t\t\t<table align=\"");
      out.print(isRTL?"left":"right");
      out.write("\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"100%\" style=\"background:");
      out.print(prefs.getToolbarBackground());
      out.write("\">\n");
      out.write("\t\t\t\t\t<tr>\n");

	for (int i=0; i<buttons.length; i++) {
		if (buttons[i].isSeparator()) {

      out.write("\n");
      out.write("\t\t\t\t\t\t<td align=\"middle\" class=\"separator\" valign=\"middle\">\n");
      out.write("\t\t\t\t\t\t</td>\n");

		} else {

      out.write("\n");
      out.write("\t\t\t\t\t\t<td align=\"middle\" id=\"tdb_");
      out.print(buttons[i].getName());
      out.write("\" class=\"");
      out.print(buttons[i].isOn()?"buttonOn":"button");
      out.write("\" height=18>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:");
      out.print(buttons[i].getAction());
      out.write('(');
      out.write('\'');
      out.write('b');
      out.print(i);
      out.write("');\" \n");
      out.write("\t\t\t\t\t\t\t   onmouseover=\"javascript:setWindowStatus('");
      out.print(buttons[i].getName());
      out.write("');return true;\" \n");
      out.write("\t\t\t\t\t\t\t   onmouseout=\"window.status='';\"\n");
      out.write("\t\t\t\t\t\t\t   id=\"b");
      out.print(i);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t   <img src=\"");
      out.print(buttons[i].getOnImage());
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\talt='");
      out.print(buttons[i].getTooltip());
      out.write("' \n");
      out.write("\t\t\t\t\t\t\t\t\ttitle='");
      out.print(buttons[i].getTooltip());
      out.write("' \n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"0\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"");
      out.print(buttons[i].getName());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</td>\n");

		}
	}

      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table> \n");
      out.write("\t\t</div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("\n");
// special case for content toolbar - internally used live help frame
if ("content".equals(request.getParameter("toolbar"))) {

      out.write("\n");
      out.write("    <iframe name=\"liveHelpFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "liveHelpFrame", request));
      out.write("\" style=\"visibility:hidden\" tabindex=\"-1\" frameborder=\"no\" width=\"0\" height=\"0\" scrolling=\"no\">\n");
      out.write("    </iframe>\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</body>     \n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}