/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.30
 * Generated at: 2017-06-21 08:43:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.polarion.platform.i18n.Localization;
import com.polarion.core.util.EscapeChars;
import com.polarion.portal.login.LoginData;
import com.polarion.portal.tomcat.session.PolarionSingleSignOn;
import com.polarion.portal.tomcat.internal.auth.LoginPageDispatcher;
import com.polarion.core.boot.BootPlugin;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.polarion.core.util.EscapeChars");
    _jspx_imports_classes.add("com.polarion.platform.i18n.Localization");
    _jspx_imports_classes.add("com.polarion.portal.login.LoginData");
    _jspx_imports_classes.add("com.polarion.portal.tomcat.internal.auth.LoginPageDispatcher");
    _jspx_imports_classes.add("com.polarion.core.boot.BootPlugin");
    _jspx_imports_classes.add("com.polarion.portal.tomcat.session.PolarionSingleSignOn");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

if (com.polarion.portal.tomcat.auth.PolarionAuthenticator.usesProxySSO()) {
    application.getRequestDispatcher("/proxysso.jsp").forward(request, response);
    return;
}

      out.write("\r\n");
      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t  \t");
      out.print(com.polarion.portal.tomcat.SupportedBrowsers.getXUACompatibleTag(request));
      out.write("\r\n");
      out.write("\t  \t<meta name=\"apple-itunes-app\" content=\"app-id=600778564\" />  \r\n");
      out.write("\t  \t<link rel=\"shortcut icon\" href=\"/polarion/ria/images/favicon.ico?buildId=");
      out.print( BootPlugin.getPolarionBuildNumber() );
      out.write("\" />\r\n");
      out.write("\t  \t<link rel=\"stylesheet\" type=\"text/css\" href=\"/polarion/ria/css/loginPages.css?buildId=");
      out.print( BootPlugin.getPolarionBuildNumber() );
      out.write("\" />\r\n");
      out.write("\t  \t<link rel=\"stylesheet\" type=\"text/css\" href=\"/polarion/login.css?buildId=");
      out.print( BootPlugin.getPolarionBuildNumber() );
      out.write("\" />\r\n");
      out.write("\t  \t<script src=\"/polarion/ria/javascript/jquery-3.0.0.min.js?buildId=");
      out.print( BootPlugin.getPolarionBuildNumber() );
      out.write("\"></script>\r\n");
      out.write("\t  \t<script src=\"/polarion/ria/javascript/flash_detect.js?buildId=");
      out.print( BootPlugin.getPolarionBuildNumber() );
      out.write("\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tsetFlashMessages(\"");
      out.print( EscapeChars.forJavascriptString(Localization.getString("login.flashWarning.higherVersionOfFlashRequired", "%requiredMajorVersion%")) );
      out.write("\", \"");
      out.print( EscapeChars.forJavascriptString(Localization.getString("login.flashWarning.yourVersionIs", "%currentVersion%")) );
      out.write("\")\r\n");
      out.write("\t  \t</script>\r\n");
      out.write("\t  \t<script src=\"/polarion/login.js?buildId=");
      out.print( BootPlugin.getPolarionBuildNumber() );
      out.write("\" id=\"loginScript\" type=\"text/javascript\"></script>\r\n");
      out.write("\t  \t<script src=\"/polarion/ria/javascript/loginPages.js?buildId=");
      out.print( BootPlugin.getPolarionBuildNumber() );
      out.write("\" type=\"text/javascript\"></script>\r\n");
      out.write("\t  \t<title>Login</title>  \r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body onresize=\"hideCompanyLogo()\" onload=\"hideCompanyLogo()\" style=\"background-image: url(");
      out.print( System.getProperty("login.background", "/polarion/ria/images/login/background.jpg?buildId="+BootPlugin.getPolarionBuildNumber()) );
      out.write(")\" id=\"background\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<img src=\"/polarion/ria/images/login/siemens_logo.png\" alt=\"Siemens\" id=\"siemensLogo\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"companyAndContainer\">\r\n");
      out.write("\t\t\t");
 String companylogo = System.getProperty("login.companylogo");
				if (companylogo  != null && !LoginData.getInstance().isMultiInstance()) {
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print( companylogo );
      out.write("\" alt=\"YourCompanyLogo\" id=\"companyLogo\"/>\r\n");
      out.write("\t  \t\t");
 } 
      out.write("\r\n");
      out.write("\t  \t\t\r\n");
      out.write("\t\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t\t<div id=\"warning\" class=\"hidden\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"warningInfo\">");
      out.print( Localization.getString("login.warningInfo") );
      out.write("<span id=\"moreinfo\">");
      out.print( Localization.getString("login.moreInfo") );
      out.write("</span></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");

		    				if (!com.polarion.portal.tomcat.SupportedBrowsers.isSupported(request)) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>");
      out.print( Localization.getString("login.browserNotFullySupported") );
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");

		    				if (com.polarion.portal.tomcat.SupportedBrowsers.showWarningAboutIECompatibilityView(request)) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>");
      out.print( Localization.getString("login.ieInCompatibilityView") );
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<span id=\"lessinfo\">");
      out.print( Localization.getString("login.lessInfo") );
      out.write("</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
	if (request.getAttribute(LoginPageDispatcher.LOGIN_FAILURE_ATTRIBUTE) != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"errorMessage\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( request.getAttribute(LoginPageDispatcher.LOGIN_FAILURE_ATTRIBUTE) );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">switchLoginLabel();</script>\r\n");
      out.write("\t\t\t\t\t\t");
 request.removeAttribute(LoginPageDispatcher.LOGIN_FAILURE_ATTRIBUTE); 
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<div id=\"box\">\r\n");
      out.write("\t\t\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"companyName\">");
      out.print(Localization.getString("login.companyName"));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"productName\">");
      out.print(BootPlugin.getPolarionProductNameHtml());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form method=\"post\" id=\"logInForm\" action=\"");
      out.print( response.encodeURL("j_security_check") );
      out.write("\" enctype=\"application/x-www-form-urlencoded\" onsubmit=\"return login();\">\r\n");
      out.write("\t\t\t\t\t\t");
 
							String target = (String) request.getParameter("target");
							target = target == null ? "" : target; 
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input id=\"target\" name=\"target\" type=\"hidden\" value=\"");
      out.print( target );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"loginRow\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"polarionLogo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (!LoginData.getInstance().isMultiInstance()) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"/polarion/ria/images/logos/repo_logo.png\" class=\"logo\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print( System.getProperty("com.polarion.logoURL", "/polarion/ria/images/logos/repo_logo.png") );
      out.write("\" class=\"logo\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"login\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
	if (getServletContext().getAttribute("registerMessage") != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"registerMessage\">");
      out.print( getServletContext().getAttribute("registerMessage") );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 getServletContext().removeAttribute("registerMessage"); 
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t                <div id=\"username\">\r\n");
      out.write("\t\t\t\t                \t<label for=\"j_username\" class=\"hidden\">");
      out.print( Localization.getString("login.userName") );
      out.write("</label>\r\n");
      out.write("\t\t\t\t                \t<input id=\"j_username\" name=\"j_username\" size=\"12\" type=\"text\" class=\"input\" />\r\n");
      out.write("\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t                \r\n");
      out.write("\t\t\t\t                <div id=\"password\">\r\n");
      out.write("\t\t\t\t                \t<label for=\"j_password\" class=\"hidden\">");
      out.print( Localization.getString("login.password") );
      out.write("</label>\r\n");
      out.write("\t\t\t\t                \t<input id=\"j_password\" name=\"j_password\" size=\"12\" value=\"\" type=\"password\" class=\"input\" />\r\n");
      out.write("\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"loginRow\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"serverName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (LoginData.getInstance().isMultiInstance()) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 String clusterLabel=EscapeChars.forJavascriptString(LoginData.getInstance().getClusterLabel()); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span title=\"");
      out.print( clusterLabel );
      out.write('"');
      out.write('>');
      out.print( clusterLabel );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label id=\"submitMsg\" class=\"hidden\" for=\"submitButton\">");
      out.print( Localization.getString("login.loggingIn") );
      out.write("</label>\r\n");
      out.write("\t                \t\t\t<input id=\"submitButton\" name=\"submit\" type=\"submit\" value=\"");
      out.print( Localization.getString("login.logIn") );
      out.write("\" />\r\n");
      out.write("\t                \t\t\t<label id=\"rememberme\"><input name=\"rememberme\" value=\"true\" type=\"checkbox\" /><span class=\"remember\">");
      out.print( Localization.getString("login.stayLoggedIn") );
      out.write("</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<div id=\"options\">\r\n");
      out.write("\t\t\t\t\t\t");
 boolean enableCreateAccountForm = Boolean.getBoolean("enableCreateAccountForm");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 String resetPasswordLinkURL = System.getProperty("com.polarion.ui.login.resetPasswordLinkURL");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 boolean isMultiInstance = LoginData.getInstance().isMultiInstance();
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t");
 if (enableCreateAccountForm || isMultiInstance || resetPasswordLinkURL!=null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t    \t");
 if (enableCreateAccountForm) {	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"polarionLink\" href=\"");
      out.print( System.getProperty("createAccountFormUrl", "/polarion/register/") );
      out.write('"');
      out.write('>');
      out.print( Localization.getString("login.createAccount") );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
 if (isMultiInstance) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (enableCreateAccountForm) {	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t        &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t   \t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t   \t<a class=\"polarionLink\" href=\"");
      out.print( LoginData.getInstance().getChangeServerUrl() );
      out.write('"');
      out.write('>');
      out.print( Localization.getString("login.changeServer") );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(resetPasswordLinkURL!=null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (enableCreateAccountForm || isMultiInstance) {	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t    \t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    \t<a class=\"polarionLink\" href=\"");
      out.print( resetPasswordLinkURL );
      out.write('"');
      out.write('>');
      out.print( System.getProperty("com.polarion.ui.login.resetPasswordLinkLabel") );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"copyright\">");
      out.print( Localization.getString("login.copyRightMessage") );
      out.write("</div>\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 if (System.getProperty("google.analytics.number") != null ) { 
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tvar gaJsHost = ((\"https:\" == document.location.protocol) ? \"https://ssl.\" : \"http://www.\");\r\n");
      out.write("\t\t\t\tdocument.write(unescape(\"%3Cscript src='\" + gaJsHost + \"google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E\"));\r\n");
      out.write("\t\t\t\ttry {\r\n");
      out.write("\t\t\t\t\tvar pageTracker = _gat._getTracker(\"");
out.print(System.getProperty("google.analytics.number"));
      out.write("\");\r\n");
      out.write("\t\t\t\t\tpageTracker._trackPageview(\"/polarion/login.jsp\");\r\n");
      out.write("\t\t\t\t} catch(e) {\r\n");
      out.write("\t\t\t\t// nothing to do\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<iframe src=\"/polarion/ria/prefetch.jsp\" id=\"prefetch\"></iframe> \r\n");
      out.write("\t</body>\r\n");
      out.write("</html> \r\n");
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
