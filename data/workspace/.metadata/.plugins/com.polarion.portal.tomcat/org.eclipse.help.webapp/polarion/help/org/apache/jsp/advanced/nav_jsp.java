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

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/advanced/fheader.jsp", Long.valueOf(1252574902000L));
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\">\n");

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
 
	LayoutData data = new LayoutData(application,request, response);
	WebappPreferences prefs = data.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>");
      out.print(ServletResources.getString("Help", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
 
if (data.isMozilla()) {

      out.write("\n");
      out.write("HTML {\n");
      out.write("\tborder-");
      out.print(isRTL?"right":"left");
      out.write(":1px solid ThreeDShadow;\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("}\n");
 
} else {

      out.write("\n");
      out.write("FRAMESET {\n");
      out.write("\tborder-top:1px solid ThreeDShadow;\n");
      out.write("\tborder-left:1px solid ThreeDShadow;\n");
      out.write("\tborder-right:1px solid ThreeDShadow;\n");
      out.write("}\n");

}

      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("var isMozilla = navigator.userAgent.indexOf('Mozilla') != -1 && parseInt(navigator.appVersion.substring(0,1)) >= 5;\n");
      out.write("var isMozilla10 = isMozilla && navigator.userAgent.indexOf('rv:1') != -1;\n");
      out.write("var isIE = navigator.userAgent.indexOf('MSIE') != -1;\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Views can call this to set the title on the content toolbar\n");
      out.write(" */\n");
      out.write("function setContentToolbarTitle(title)\n");
      out.write("{\n");
      out.write("\tif(parent.ContentFrame.ContentToolbarFrame && parent.ContentFrame.ContentToolbarFrame.setTitle ){\n");
      out.write("\t\tparent.ContentFrame.ContentToolbarFrame.setTitle(title);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Shows specified view. Called from actions that switch the view\n");
      out.write(" */\n");
      out.write("function showView(view)\n");
      out.write("{\n");
      out.write("\t// Note: assumes the same id shared by tabs and iframes\n");
      out.write("\tViewsFrame.showView(view);\n");
      out.write("\tTabsFrame.showTab(view);\n");
      out.write("}\n");
      out.write("\n");
      out.write("var temp;\n");
      out.write("var tempActiveId;\n");
      out.write("var tempView = \"\";\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Shows the TOC frame, loads appropriate TOC, and selects the topic\n");
      out.write(" */\n");
      out.write("function displayTocFor(topic)\n");
      out.write("{\n");
      out.write("\ttempView = ViewsFrame.lastView;\n");
      out.write("\t\n");
      out.write("\t/******** HARD CODED VIEW NAME *********/\n");
      out.write("\tshowView(\"toc\");\n");
      out.write("\t\n");
      out.write("\tvar tocView = ViewsFrame.toc.tocViewFrame;\n");
      out.write("\n");
      out.write("\tif (tocView.selectTopic && tocView.selectTopic(topic))\n");
      out.write("\t\treturn;\n");
      out.write("\telse {\n");
      out.write("\t\t// save the current navigation, so we can retrieve it when synch does not work\n");
      out.write("\t\tsaveNavigation();\n");
      out.write("\n");
      out.write("\t\tvar advIndex=window.location.href.indexOf(\"/advanced/nav.jsp\");\n");
      out.write("\t\tif(advIndex < 0)\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\tvar tocURL = window.location.href.substr(0, advIndex) + \"/advanced/tocView.jsp\";\n");
      out.write("\t\ttocView.location.replace(tocURL + \"?topic=\"+topic+\"&synch=yes\");\t\t\t\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function saveNavigation()\n");
      out.write("{\n");
      out.write("\t/**** HARD CODED VIEW NAME *********/\n");
      out.write("\tvar tocView = ViewsFrame.toc.tocViewFrame;\n");
      out.write("\t\n");
      out.write("\tif (tocView.oldActive) {\n");
      out.write("\t\ttempActiveId = tocView.oldActive.id;\n");
      out.write("\t\ttocView.oldActive.className = tocView.oldActiveClass;\n");
      out.write("\t\ttocView.oldActive = null;\n");
      out.write("\t}\n");
      out.write("\t\t\n");
      out.write("\tif (isIE)\n");
      out.write("\t\ttemp = tocView.document.body.innerHTML;\n");
      out.write("\telse if (isMozilla)\n");
      out.write("\t\ttemp = tocView.document.documentElement.innerHTML;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function restoreNavigation(errorMessage)\n");
      out.write("{\t\n");
      out.write("\t// switch to saved view\n");
      out.write("\tshowView(tempView);\n");
      out.write("\n");
      out.write("\t/**** HARD CODED VIEW NAME *********/\t\n");
      out.write("\tvar tocView = ViewsFrame.toc.tocViewFrame;\n");
      out.write("\n");
      out.write("\tif (temp && (isIE || isMozilla10)) {\n");
      out.write("\t\t// Restore old navigation\n");
      out.write("\t\tif (isIE) {\n");
      out.write("\t\t\ttocView.document.body.innerHTML = temp;\n");
      out.write("\t\t} else if (isMozilla10) {\n");
      out.write("\t\t\ttocView.document.documentElement.innerHTML = temp;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (tempActiveId){\n");
      out.write("\t\t\ttocView.selectTopicById(tempActiveId);\n");
      out.write("\t\t}\n");
      out.write("\t} else {\n");
      out.write("\t\t// fail back case\n");
      out.write("\t\ttocView.location.replace(\"tocView.jsp\");\n");
      out.write("\t}\n");
      out.write("\twindow.status=errorMessage;\t\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<frameset onload=\"showView('");
      out.print(data.getVisibleView());
      out.write("')\" id=\"navFrameset\" rows=\"*,21\"  framespacing=\"0\" border=\"0\"  frameborder=\"0\" scrolling=\"no\">\n");
      out.write("   <frame name=\"ViewsFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "ViewsFrame", request));
      out.write("\" src='");
      out.print("views.jsp"+data.getQuery());
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" resize=yes>\n");
      out.write("   <frame name=\"TabsFrame\" title=\"");
      out.print(ServletResources.getString("TabsFrame", request));
      out.write("\" src='");
      out.print("tabs.jsp"+data.getQuery());
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" noresize>\n");
      out.write("</frameset>\n");
      out.write("\n");
      out.write("</html>");
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