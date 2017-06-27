<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
   xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:p="http://polarion.com/xml-export"
   xmlns:x="http://www.w3.org/1999/xhtml" xmlns="http://www.w3.org/1999/xhtml"
   xmlns:base64="xalan://com.polarion.alm.tracker.internal.exporters.xml.Base64Loader"
   exclude-result-prefixes="base64 x p">

   <xsl:output method="xml" encoding="UTF-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"/>

   <xsl:key name="type" match="/p:workItems/p:workItem/p:fields/p:type"
      use="@id" />

   <xsl:template match="/">
      <html>
         <head>
            <title>Export</title>
            <style type="text/css">
               h1 {
                  font-weight:bold;
                  position:relative;
                  left:50%;
                  width:1000px;
                  margin-left:-500px;
                  margin-top:20px;
                  margin-bottom:20px;
                  text-align:left;
                  padding:15px;
                  border:1px dashed #333;
                  background-color:#eee;
               }
               .content {
                  position:relative;
                  left:50%;
                  width:1000px;
                  margin-left:-500px;
                  margin-top:10px;
                  text-align:left;
                  padding:15px;
                  border:1px dashed #333;
                  background-color:#eee;
               }
               div#toc a {
                  display:block;
                  text-decoration:none;
                  color:#000;
                  font-weight:bold;
               }
               div#toc a:hover {
                  display:block;
                  text-decoration:underline;
               }
	        </style>
         </head>
         <body>
            <h1>Work Items</h1>
            <xsl:apply-templates mode="toc"/>
            <xsl:apply-templates mode="content"/>
         </body>
      </html>
   </xsl:template>

   <xsl:template match="/p:workItems" mode="toc">
      <div class="content" id="toc">
         <h2>Content</h2>
         <xsl:for-each select="p:workItem/p:fields/p:type[generate-id(.)=generate-id(key('type',@id)[1])]">
            <xsl:apply-templates select="." mode="toc">
               <xsl:with-param name="num">
                  <xsl:value-of select="position()"/>
               </xsl:with-param>
            </xsl:apply-templates>
         </xsl:for-each>
      </div>
   </xsl:template>

   <xsl:template match="/p:workItems/p:workItem/p:fields/p:type" mode="toc">
      <xsl:param name="num"/>
      <xsl:variable name="type" select="@id"/>
      <a style="font-size:large">
         <xsl:attribute name="href">#<xsl:value-of select="$type"/></xsl:attribute>
         <xsl:number value="$num" format="1" />. <xsl:value-of select="@name"/>s
      </a>
      <div style="padding-left:10px">
         <xsl:apply-templates select="/p:workItems/p:workItem/p:fields[p:type/@id = $type]" mode="toc">
            <xsl:with-param name="parentNum" select="$num"/>
         </xsl:apply-templates>
      </div>
   </xsl:template>
   
   <xsl:template match="/p:workItems/p:workItem/p:fields" mode="toc">
      <xsl:param name="parentNum" />
      <a>
         <xsl:attribute name="href">#<xsl:value-of select="p:id"/>/<xsl:value-of select="p:project/p:id"/></xsl:attribute>
         <xsl:value-of select="$parentNum" />.<xsl:value-of select="position()" />. <xsl:value-of select="p:id" /> - <xsl:value-of select="p:title" />
      </a>
   </xsl:template>

   <xsl:template match="/p:workItems" mode="content">
      <xsl:for-each select="/p:workItems/p:workItem/p:fields/p:type[generate-id(.)=generate-id(key('type',@id)[1])]">
         <xsl:apply-templates select="." mode="content">
            <xsl:with-param name="num">
               <xsl:value-of select="position()"/>
            </xsl:with-param>
         </xsl:apply-templates>               
      </xsl:for-each>
   </xsl:template>
   
   <xsl:template match="/p:workItems/p:workItem/p:fields/p:type" mode="content">
      <xsl:param name="num"/>
      <div class="content" id="{@id}">
         <h2>
            <xsl:number value="$num" format="1" /> - <xsl:value-of select="@name"/>s
         </h2>
         <p><xsl:value-of select="p:property[@id = 'description']"/></p>
      </div>
      <div class="content">
         <xsl:variable name="type" select="@id"/>
         <xsl:apply-templates select="/p:workItems/p:workItem/p:fields[p:type/@id = $type]" mode="content"/>
      </div>
   </xsl:template>

   <xsl:template match="/p:workItems/p:workItem/p:fields" mode="content">
      <h3>
         <xsl:attribute name="id"><xsl:value-of select="p:id"/>/<xsl:value-of select="p:project/p:id"/></xsl:attribute>
         <xsl:value-of select="p:id" />
         -
         <xsl:value-of select="p:title" />
      </h3>
      <xsl:apply-templates select="p:description" />
   </xsl:template>

   <xsl:template match="p:description">
      <xsl:value-of select="p:text" />
      <xsl:apply-templates select="p:html/*" />
   </xsl:template>

   <xsl:template match="p:html">
      <xsl:copy>
         <xsl:apply-templates select="@*|node()" />
      </xsl:copy>
   </xsl:template>

   <xsl:template match="x:img">
      <xsl:choose>
	     <xsl:when test="starts-with(@src,'workitemimg:/') or not(starts-with(@src,'workitemimg:'))">
		    <!--LiveDoc image or normal image -> URL can be used directly -->
		    <img alt="LiveDoc Image" 
			  src="{concat('data:image/',substring(@src,string-length(@src) - 2),
			  ';base64,',base64:load(@src))}"/>
		 </xsl:when>
		 <xsl:otherwise>
		   <xsl:variable name="name" select="substring-after(@src , 'workitemimg:')" />
		   <xsl:variable name="attachment"
             select="ancestor::p:fields/p:attachments/p:attachment[substring-after(p:url/text(),'attachment') = $name]" />
           <xsl:variable name="fileName" select="$attachment/p:fileName" />
           <xsl:if test="$fileName">
              <img alt="{$fileName}" src="{concat('data:image/', substring($fileName,string-length($fileName) - 2),
			  ';base64,',base64:load($attachment/p:url/text()))}"/>
           </xsl:if>
		 </xsl:otherwise>
      </xsl:choose>
      
   </xsl:template>

   <xsl:template match="@*|node()">
      <xsl:copy>
         <xsl:apply-templates select="@*|node()"/>
      </xsl:copy>
   </xsl:template>

</xsl:stylesheet>