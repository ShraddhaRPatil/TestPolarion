<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en" >
	<head>
		<%@ page contentType="text/html; charset=UTF-8"%>
		<%=com.polarion.portal.tomcat.SupportedBrowsers.getXUACompatibleTag(request)%>
		
  		<link href="/polarion/wiki/skins/sidecar/elements.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/classes.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/chwSkin.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/xwiki.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/wiki.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/page.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/rss.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/screenlayout.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/presentation.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/colorsblue.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/ie.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/wiki/skins/sidecar/processaudit.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		
  		<script type="text/javascript" src="/polarion/wiki/skins/sidecar/lite_xwiki.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>"></script>
  		<script type="text/javascript" src="/polarion/wiki/skins/sidecar/xwiki.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>"></script>
  		<script type="text/javascript" src="/polarion/ria/javascript/pa/selection.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>"></script>
  		
  		<script src="/polarion/ria/javascript/jquery-3.0.0.min.js" type="text/javascript"></script>

		<script src="/polarion/ria/javascript/highcharts.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/highcharts-more.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/highcharts-3d.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/data.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/exporting.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/drilldown.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/funnel.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/heatmap.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/no-data-to-display.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
		<script src="/polarion/ria/javascript/solid-gauge.js?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" type="text/javascript"></script>
  		
  		<script src="/polarion/ria/javascript/diff/dojo/dojo.js" type="text/javascript"></script>
  		<script src="/polarion/ria/javascript/diff/diff.js" type="text/javascript"></script>
  		<script type="text/javascript">try{htmlDiffInit();}catch(e){}</script>
  		
  		<style>
  			<%= com.polarion.core.config.Configuration.getInstance().ui().listStyle().getStyle() %>
  		</style>  
  		
  		<link href="/polarion/gwt/gwt/polarion/dle_document.css?buildId=<%=com.polarion.portal.jetspeed.gwt.GWTServletProxy.getBuildId()%>" rel="stylesheet" type="text/css"/>
  		<link href="/polarion/ria/font-awesome-4.0.3/css/font-awesome.css" rel="stylesheet">  		
  	</head>
	<body id="dle_compare" class="polarion-dle-document polarion-dle-document-paper withResolvedComments">
		<div style="height:100%" >
			<table style="width:100%;height:100%">
				<tr>
					<td align="center" valign="middle">
						<img src="/polarion/ria/images/progress.gif" alt="progress"/>
						<br/>
						<span><%= com.polarion.platform.i18n.Localization.getString("definition.loadingBig") %></span>
					</td>
				</tr>
			</table>
		</div>	
	</body>
</html>