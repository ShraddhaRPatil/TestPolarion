<?xml version="1.0" encoding="ISO-8859-1"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:p="http://polarion.com/xml-export" 
>

<xsl:output method="text"/>

<xsl:key name="type" match="/p:workItems/p:workItem/p:fields/p:type" use="@id"/>

<xsl:strip-space elements="*"/>

<xsl:template match="/p:workItems">Statistics:
<xsl:for-each select="p:workItem/p:fields/p:type[generate-id(.)=generate-id(key('type',@id)[1])]"><xsl:text>
  </xsl:text>
  <xsl:variable name="type" select="@id"/>
  <xsl:value-of select="@name"/>:<xsl:text>	</xsl:text><xsl:value-of select="count(/p:workItems/p:workItem/p:fields[p:type/@id = $type])"/>
</xsl:for-each>
</xsl:template>


</xsl:stylesheet>