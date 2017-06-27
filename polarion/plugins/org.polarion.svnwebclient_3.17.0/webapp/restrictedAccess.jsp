<%--
  - Copyright (c) 2004, 2005 Polarion Software, All rights reserved.
  - Email: community@polarion.org
  -
  - This program and the accompanying materials are made available under the
  - terms of the Apache License, Version 2.0 (the "License"). You may not use
  - this file except in compliance with the License. Copy of the License is
  - located in the file LICENSE.txt in the project distribution. You may also
  - obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
  -
  -
  - POLARION SOFTWARE MAKES NO REPRESENTATIONS OR WARRANTIES
  - ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESSED OR IMPLIED,
  - INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
  - FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. POLARION SOFTWARE
  - SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
  - OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
  --%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@page import="com.polarion.platform.i18n.Localization"%>

<jsp:useBean id="bean" scope="request" class="org.polarion.svnwebclient.web.controller.RestrictedAccessBean"/>
<%
    if (bean.execute(request, response)) {	   
%>

<html>
    <jsp:include page="include/head.jsp">
        <jsp:param name="jsp.head.title" value="<%= Localization.getString("svnwebclient.restrictedAccess.title") %>"/>
    </jsp:include>
    <body>
        <table cellspacing="0" cellpadding="0" width="100%" height="100%">
            <tr>
                <td>
                    <jsp:include page="include/top.jsp">
                        <jsp:param name="jsp.top.isPickerMode" value="<%=bean.isPickerMode()%>"/>
                    </jsp:include>
                </td>
            </tr>
            <tr>
                <td style="padding:0; padding-left:5px; padding-right:5px; padding-top:100px;" width="50%">
                    <table align="center" class="dialog" cellspacing="0" cellpadding="0" width="50%">
                        <tr>
                            <td width="100%">
                                <table width="100%" class="valueListTitle" cellpadding="0" cellspacing="0" >
                    			    <tr>
                                        <td style="padding-left:10px;padding-right:10px;">
                                            <%= Localization.getString("svnwebclient.restrictedAccess.restricted") %>
                                        </td>            
                                    </tr>
                                </table>    
                            </td>
                        </tr>        
                        <tr>
                           <td style="padding-left:10px;padding-right:10px;padding-top:20px;padding-bottom:20px;">
                               <jsp:include page="include/dialog/restrictedAccessContent.jsp"/>
                           </td>
                        </tr>   
                         <tr>
                            <td width="100%" style="padding-left:10px;padding-right:10px;padding-top:0px;padding-bottom:20px;">
                                <jsp:include page="include/dialog/restrictedAccessButtons.jsp"/>
                            </td>    
                        </tr>

                    </table>
                </td>
            </tr>
            
            <tr>
                <td height="100%"/>
            </tr>
<%
    if (!bean.isPickerMode()) {
%>            
            <tr>
                <td>
                    <jsp:include page="include/footer.jsp"/>
                </td>
            </tr>
<%
    }
%>            
        </table>
    </body>
</html>
<%
    }
%>