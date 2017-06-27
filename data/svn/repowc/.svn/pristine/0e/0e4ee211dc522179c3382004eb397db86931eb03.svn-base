<?xml version="1.0" encoding="ISO-8859-1"?>

<xsl:stylesheet version="1.0"
   xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:p="http://polarion.com/xml-export"
   xmlns:x="http://www.w3.org/1999/xhtml" xmlns:fo="http://www.w3.org/1999/XSL/Format"
   exclude-result-prefixes="x p">
   
   <xsl:import href="xhtml2fo.xsl"/>

   <xsl:output method="xml" encoding="UTF-8" />

   <xsl:key name="type" match="/p:workItems/p:workItem/p:fields/p:type"
      use="@id" />

   <xsl:template match="/">
      <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format" font-family="Arial">
      
         <fo:layout-master-set>
            <fo:simple-page-master master-name="toc" page-width="210mm" page-height="297mm" 
               margin-top="1cm" margin-bottom="1cm" 
               margin-left="2cm" margin-right="2cm">
               <fo:region-body margin-top="2cm" margin-bottom="1cm"/>
               <fo:region-before extent="2cm"/>
               <fo:region-after extent="1cm"/>
            </fo:simple-page-master>
            <fo:simple-page-master master-name="WorkItems" page-width="210mm" page-height="297mm" 
                  margin-top="1cm" margin-bottom="1cm" 
                  margin-left="2cm" margin-right="2cm">
               <fo:region-body margin-top="2cm" margin-bottom="1cm"/>
               <fo:region-before extent="2cm"/>
               <fo:region-after extent="1cm"/>
            </fo:simple-page-master>
         </fo:layout-master-set>
       
       <fo:page-sequence master-reference="toc" format="i" force-page-count="no-force">
         <fo:static-content flow-name="xsl-region-before">
            <fo:block text-align="center" font-size="14pt"  
               border-bottom="thin solid black">
               WorkItem Export - Table of Contents
            </fo:block>
         </fo:static-content>
         <fo:static-content flow-name="xsl-region-after">
            <fo:block font-size="12pt" text-align="center" border-top="thin solid black">
               <fo:page-number/>
            </fo:block>
         </fo:static-content>
         <xsl:apply-templates mode="toc"/>
       </fo:page-sequence>
       
       <fo:page-sequence master-reference="WorkItems"  initial-page-number="1">
         <fo:static-content flow-name="xsl-region-before">
            <fo:block text-align="center" font-size="14pt" border-bottom="thin solid black">WorkItem Export - 
            <fo:retrieve-marker retrieve-class-name="type"
               retrieve-position="first-including-carryover"/>
            </fo:block>
         </fo:static-content>
         <fo:static-content flow-name="xsl-region-after">
            <fo:block font-size="12pt" text-align="center" border-top="thin solid black">
               Page <fo:page-number/> / <fo:page-number-citation ref-id="last-page"/>
            </fo:block>
        </fo:static-content>
        <xsl:apply-templates mode="content"/>
       </fo:page-sequence>
       
      </fo:root>
   </xsl:template>

   <xsl:template match="/p:workItems" mode="toc">
      <fo:flow flow-name="xsl-region-body">
         <fo:block font-size="30pt" font-weight="bold">
            Table of Contents
         </fo:block>
         <xsl:for-each select="p:workItem/p:fields/p:type[generate-id(.)=generate-id(key('type',@id)[1])]">
            <xsl:apply-templates select="." mode="toc">
               <xsl:with-param name="num">
                  <xsl:value-of select="position()"/>
               </xsl:with-param>
            </xsl:apply-templates>
         </xsl:for-each>
      </fo:flow>
   </xsl:template>

   <xsl:template match="/p:workItems/p:workItem/p:fields/p:type" mode="toc">
      <xsl:param name="num"/>
      <fo:block font-size="smaller" space-after="2mm" 
         space-before="2mm" text-align-last="justify"
         font-weight="bold">
         <fo:basic-link internal-destination="{@id}">
            <xsl:value-of select="$num"/>. <xsl:value-of select="@name"/>s 
            <fo:leader leader-pattern="dots"/>
            <fo:page-number-citation ref-id="{@id}"/>
         </fo:basic-link>
      </fo:block>
      <xsl:variable name="type" select="@id"/>
      <xsl:apply-templates select="/p:workItems/p:workItem/p:fields[p:type/@id = $type]" mode="toc"/>
   </xsl:template>

   <xsl:template match="/p:workItems/p:workItem/p:fields" mode="toc">
       <fo:block font-size="smaller" space-after="2mm" 
         space-before="2mm" start-indent="3mm" text-align-last="justify" 
         font-style="italic">
         <fo:basic-link internal-destination="{generate-id(.)}">
            <xsl:value-of select="p:id" /> - <xsl:value-of select="p:title" />
            <fo:leader leader-pattern="dots"/>
            <fo:page-number-citation ref-id="{generate-id(.)}"/>
         </fo:basic-link>
      </fo:block>
   </xsl:template>

   <xsl:template match="/p:workItems" mode="content">
      <fo:flow flow-name="xsl-region-body">
         <xsl:for-each select="/p:workItems/p:workItem/p:fields/p:type[generate-id(.)=generate-id(key('type',@id)[1])]">
            <xsl:apply-templates select="." mode="content">
               <xsl:with-param name="num">
                  <xsl:value-of select="position()"/>
               </xsl:with-param>
            </xsl:apply-templates>   
         </xsl:for-each>
         <fo:block id="last-page"/>
      </fo:flow>
   </xsl:template>
   
   <xsl:template match="/p:workItems/p:workItem/p:fields/p:type" mode="content">
      <xsl:param name="num"/>
      <fo:block font-size="36pt" text-align="left" font-weight="bold" id="{@id}" break-before="page">
         <fo:marker marker-class-name="type"><xsl:value-of select="@name"/>s</fo:marker>
         <xsl:value-of select="$num"/>. <xsl:value-of select="@name"/>s
      </fo:block>
      <fo:block>
         <xsl:value-of select="p:property[@id = 'description']"/>
      </fo:block>
      <xsl:variable name="type" select="@id"/>      
      <xsl:apply-templates select="/p:workItems/p:workItem/p:fields[p:type/@id = $type]" mode="content"/>
   </xsl:template>

   <xsl:template match="/p:workItems/p:workItem/p:fields" mode="content">
      <fo:block  font-size="20pt" text-align="left" font-style="italic" id="{generate-id(.)}" space-before="5mm">
         <xsl:value-of select="p:id" /> - <xsl:value-of select="p:title" />
      </fo:block>
      <xsl:apply-templates select="p:description" />
   </xsl:template>

   <xsl:template match="p:description">
      <xsl:variable name="text" select="p:text"/>
      <xsl:if test="$text">
         <fo:block><xsl:value-of select="$text"/></fo:block>
      </xsl:if>
      <xsl:apply-templates/>
   </xsl:template>

   <xsl:template match="p:html">
      <fo:block>
         <xsl:apply-templates select="./*"/>
      </fo:block>
   </xsl:template>
   
  <!-- FOP Doesn't support that table-and-caption > override table template -->
  <xsl:template match="x:table">
      <fo:table xsl:use-attribute-sets="table">
        <xsl:call-template name="process-table"/>
      </fo:table>
  </xsl:template>

   <xsl:template match="x:img">
      <xsl:choose>
	     <xsl:when test="starts-with(@src,'workitemimg:/') or not(starts-with(@src,'workitemimg:'))">
		    <!--LiveDoc image or normal image -> URL can be used directly -->
		    <fo:external-graphic src="{@src}"/>
		 </xsl:when>
		 <xsl:otherwise>
		    <xsl:variable name="name" select="substring-after(@src , 'workitemimg:')" />
            <xsl:variable name="attachment"
             select="ancestor::p:fields/p:attachments/p:attachment[substring-after(p:url/text(),'attachment') = $name]" />
            <xsl:if test="$attachment/p:url">
               <fo:external-graphic src="{$attachment/p:url}"/>
            </xsl:if>
		 </xsl:otherwise>
      </xsl:choose>
      
   </xsl:template>
   
   <!-- Copied from xhtml2fo.xsl, added filtering of usupported style attributes -->
   <xsl:template name="process-style">
    <xsl:param name="style"/>
    <!-- e.g., style="text-align: center; color: red"
         converted to text-align="center" color="red" -->
    <xsl:variable name="name"
                  select="translate(substring-before($style, ':'),
                  'ABCDEFGHIJKLMNOPQRSTUVWXYZ',
                  'abcdefghijklmnopqrstuvwxyz')"/>
    <xsl:if test="$name">
      <xsl:variable name="value-and-rest"
                    select="normalize-space(substring-after($style, ':'))"/>
      <xsl:variable name="value">
        <xsl:choose>
          <xsl:when test="contains($value-and-rest, ';')">
            <xsl:value-of select="normalize-space(substring-before(
                                  $value-and-rest, ';'))"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:value-of select="$value-and-rest"/>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:variable>
      <xsl:choose>
        <xsl:when test="$name = 'width' and (self::x:col or self::x:colgroup)">
          <xsl:attribute name="column-width">
            <xsl:value-of select="$value"/>
          </xsl:attribute>
        </xsl:when>
        <xsl:when test="$name = 'vertical-align' and (
                                 self::x:table or self::x:caption or
                                 self::x:thead or self::x:tfoot or
                                 self::x:tbody or self::x:colgroup or
                                 self::x:col or self::x:tr or
                                 self::x:th or self::x:td)">
          <xsl:choose>
            <xsl:when test="$value = 'top'">
              <xsl:attribute name="display-align">before</xsl:attribute>
            </xsl:when>
            <xsl:when test="$value = 'bottom'">
              <xsl:attribute name="display-align">after</xsl:attribute>
            </xsl:when>
            <xsl:when test="$value = 'middle'">
              <xsl:attribute name="display-align">center</xsl:attribute>
            </xsl:when>
            <xsl:otherwise>
              <xsl:attribute name="display-align">auto</xsl:attribute>
              <xsl:attribute name="relative-align">baseline</xsl:attribute>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:when>
        <xsl:otherwise>
          <!--  Only process known attributes, ignore background as it caused problems with FOP -->
          <xsl:if test="
('absolute-position' = $name) or ('active-state' = $name) or ('alignment-adjust' = $name) or ('alignment-baseline' = $name) or ('allowed-height-scale' = $name) or
('allowed-width-scale' = $name) or ('auto-restore' = $name) or ('azimuth' = $name) or ('background-attachment' = $name) or 
('background-color' = $name) or ('background-image' = $name) or ('background-position' = $name) or ('background-position-horizontal' = $name) or 
('background-position-vertical' = $name) or ('background-repeat' = $name) or ('baseline-shift' = $name) or ('blank-or-not-blank' = $name) or 
('block-progression-dimension' = $name) or ('border' = $name) or ('border-after-color' = $name) or ('border-after-precedence' = $name) or 
('border-after-style' = $name) or ('border-after-width' = $name) or ('border-before-color' = $name) or ('border-before-precedence' = $name) or 
('border-before-style' = $name) or ('border-before-width' = $name) or ('border-bottom' = $name) or ('border-bottom-color' = $name) or 
('border-bottom-style' = $name) or ('border-bottom-width' = $name) or ('border-collapse' = $name) or ('border-color' = $name) or ('border-end-color' = $name) or 
('border-end-precedence' = $name) or ('border-end-style' = $name) or ('border-end-width' = $name) or ('border-left' = $name) or ('border-left-color' = $name) or 
('border-left-style' = $name) or ('border-left-width' = $name) or ('border-right' = $name) or ('border-right-color' = $name) or ('border-right-style' = $name) or 
('border-right-width' = $name) or ('border-separation' = $name) or ('border-spacing' = $name) or ('border-start-color' = $name) or 
('border-start-precedence' = $name) or ('border-start-style' = $name) or ('border-start-width' = $name) or ('border-style' = $name) or ('border-top' = $name) or
('border-top-color' = $name) or ('border-top-style' = $name) or ('border-top-width' = $name) or ('border-width' = $name) or ('bottom' = $name) or 
('break-after' = $name) or ('break-before' = $name) or ('caption-side' = $name) or ('case-name' = $name) or ('case-title' = $name) or 
('change-bar-class' = $name) or ('change-bar-color' = $name) or ('change-bar-offset' = $name) or ('change-bar-placement' = $name) or ('change-bar-style' = $name) or 
('change-bar-width' = $name) or ('character' = $name) or ('clear' = $name) or ('clip' = $name) or ('color' = $name) or ('color-profile-name' = $name) or 
('column-count' = $name) or ('column-gap' = $name) or ('column-number' = $name) or ('column-width' = $name) or ('content-height' = $name) or 
('content-type' = $name) or ('content-width' = $name) or ('country' = $name) or ('cue' = $name) or ('cue-after' = $name) or ('cue-before' = $name) or 
('destination-placement-offset' = $name) or ('direction' = $name) or ('display-align' = $name) or ('dominant-baseline' = $name) or ('elevation' = $name) or 
('empty-cells' = $name) or ('end-indent' = $name) or ('ends-row' = $name) or ('extent' = $name) or ('external-destination' = $name) or ('float' = $name) or 
('flow-map-name' = $name) or ('flow-map-reference' = $name) or ('flow-name' = $name) or ('flow-name-reference' = $name) or ('font' = $name) or 
('font-family' = $name) or ('font-selection-strategy' = $name) or ('font-size' = $name) or ('font-size-adjust' = $name) or ('font-stretch' = $name) or 
('font-style' = $name) or ('font-variant' = $name) or ('font-weight' = $name) or ('force-page-count' = $name) or ('format' = $name) or 
('glyph-orientation-horizontal' = $name) or ('glyph-orientation-vertical' = $name) or ('grouping-separator' = $name) or ('grouping-size' = $name) or 
('height' = $name) or ('hyphenate' = $name) or ('hyphenation-character' = $name) or ('hyphenation-keep' = $name) or ('hyphenation-ladder-count' = $name) or 
('hyphenation-push-character-count' = $name) or ('hyphenation-remain-character-count' = $name) or ('id' = $name) or ('index-class' = $name) or 
('index-key' = $name) or ('indicate-destination' = $name) or ('initial-page-number' = $name) or ('inline-progression-dimension' = $name) or 
('internal-destination' = $name) or ('intrinsic-scale-value' = $name) or ('intrusion-displace' = $name) or ('keep-together' = $name) or 
('keep-with-next' = $name) or ('keep-with-previous' = $name) or ('language' = $name) or ('last-line-end-indent' = $name) or ('leader-alignment' = $name) or 
('leader-length' = $name) or ('leader-pattern' = $name) or ('leader-pattern-width' = $name) or ('left' = $name) or ('letter-spacing' = $name) or 
('letter-value' = $name) or ('linefeed-treatment' = $name) or ('line-height' = $name) or ('line-height-shift-adjustment' = $name) or 
('line-stacking-strategy' = $name) or ('margin' = $name) or ('margin-bottom' = $name) or ('margin-left' = $name) or ('margin-right' = $name) or 
('margin-top' = $name) or ('marker-class-name' = $name) or ('master-name' = $name) or ('master-reference' = $name) or ('max-height' = $name) or 
('maximum-repeats' = $name) or ('max-width' = $name) or ('media-usage' = $name) or ('merge-pages-across-index-key-references' = $name) or 
('merge-ranges-across-index-key-references' = $name) or ('merge-sequential-page-numbers' = $name) or ('min-height' = $name) or ('min-width' = $name) or 
('number-columns-repeated' = $name) or ('number-columns-spanned' = $name) or ('number-rows-spanned' = $name) or ('odd-or-even' = $name) or ('orphans' = $name) or 
('overflow' = $name) or ('padding' = $name) or ('padding-after' = $name) or ('padding-before' = $name) or ('padding-bottom' = $name) or ('padding-end' = $name) or 
('padding-left' = $name) or ('padding-right' = $name) or ('padding-start' = $name) or ('padding-top' = $name) or ('page-break-after' = $name) or 
('page-break-before' = $name) or ('page-break-inside' = $name) or ('page-citation-strategy' = $name) or ('page-height' = $name) or
('page-number-treatment' = $name) or ('page-position' = $name) or ('page-width' = $name) or ('pause' = $name) or ('pause-after' = $name) or 
('pause-before' = $name) or ('pitch' = $name) or ('pitch-range' = $name) or ('play-during' = $name) or ('position' = $name) or ('precedence' = $name) or 
('provisional-distance-between-starts' = $name) or ('provisional-label-separation' = $name) or ('reference-orientation' = $name) or ('ref-id' = $name) or 
('ref-index-key' = $name) or ('region-name' = $name) or ('region-name-reference' = $name) or ('relative-align' = $name) or ('relative-position' = $name) or 
('rendering-intent' = $name) or ('retrieve-boundary' = $name) or ('retrieve-boundary-within-table' = $name) or ('retrieve-class-name' = $name) or 
('retrieve-position' = $name) or ('retrieve-position-within-table' = $name) or ('richness' = $name) or ('right' = $name) or ('role' = $name) or 
('rule-style' = $name) or ('rule-thickness' = $name) or ('scale-option' = $name) or ('scaling' = $name) or ('scaling-method' = $name) or 
('score-spaces' = $name) or ('script' = $name) or ('show-destination' = $name) or ('size' = $name) or ('source-document' = $name) or ('space-after' = $name) or 
('space-before' = $name) or ('space-end' = $name) or ('space-start' = $name) or ('span' = $name) or ('speak' = $name) or ('speak-header' = $name) or 
('speak-numeral' = $name) or ('speak-punctuation' = $name) or ('speech-rate' = $name) or ('src' = $name) or ('start-indent' = $name) or 
('starting-state' = $name) or ('starts-row' = $name) or ('stress' = $name) or ('suppress-at-line-break' = $name) or ('switch-to' = $name) or 
('table-layout' = $name) or ('table-omit-footer-at-break' = $name) or ('table-omit-header-at-break' = $name) or ('target-presentation-context' = $name) or 
('target-processing-context' = $name) or ('target-stylesheet' = $name) or ('text-align' = $name) or ('text-align-last' = $name) or ('text-altitude' = $name) or 
('text-decoration' = $name) or ('text-depth' = $name) or ('text-indent' = $name) or ('text-shadow' = $name) or ('text-transform' = $name) or ('top' = $name) or 
('treat-as-word-space' = $name) or ('unicode-bidi' = $name) or ('vertical-align' = $name) or ('visibility' = $name) or ('voice-family' = $name) or 
('volume' = $name) or ('white-space' = $name) or ('white-space-collapse' = $name) or ('white-space-treatment' = $name) or ('widows' = $name) or 
('width' = $name) or ('word-spacing' = $name) or ('wrap-option' = $name) or ('writing-mode' = $name) or ('xml:lang' = $name) or ('z-index' = $name)">
             <xsl:attribute name="{$name}">
               <xsl:value-of select="$value"/>
             </xsl:attribute>
          </xsl:if>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:if>
    <xsl:variable name="rest"
                  select="normalize-space(substring-after($style, ';'))"/>
    <xsl:if test="$rest">
      <xsl:call-template name="process-style">
        <xsl:with-param name="style" select="$rest"/>
      </xsl:call-template>
    </xsl:if>
  </xsl:template>
  
  <!-- Fop doesn't support bolder... -->
  <xsl:attribute-set name="b">
    <xsl:attribute name="font-weight">bold</xsl:attribute>
  </xsl:attribute-set>
  
  <xsl:attribute-set name="strong">
    <xsl:attribute name="font-weight">bold</xsl:attribute>
  </xsl:attribute-set>
  
  <xsl:attribute-set name="strong-em">
    <xsl:attribute name="font-weight">bold</xsl:attribute>
    <xsl:attribute name="font-style">italic</xsl:attribute>
  </xsl:attribute-set>
  
  <xsl:attribute-set name="th">
    <xsl:attribute name="font-weight">bold</xsl:attribute>
    <xsl:attribute name="text-align">center</xsl:attribute>
    <xsl:attribute name="border">1px</xsl:attribute>
    <!--
    <xsl:attribute name="border-style">inset</xsl:attribute>
    -->
    <xsl:attribute name="padding">1px</xsl:attribute>
  </xsl:attribute-set>
  
  <!-- Override - we don't wan't the id attributes, they may not be unique -->
  <xsl:template name="process-common-attributes">
    <xsl:attribute name="role">
      <xsl:value-of select="concat('x:', local-name())"/>
    </xsl:attribute>

    <xsl:choose>
      <xsl:when test="@xml:lang">
        <xsl:attribute name="xml:lang">
          <xsl:value-of select="@xml:lang"/>
        </xsl:attribute>
      </xsl:when>
      <xsl:when test="@lang">
        <xsl:attribute name="xml:lang">
          <xsl:value-of select="@lang"/>
        </xsl:attribute>
      </xsl:when>
    </xsl:choose>

    <!--<xsl:choose>
      <xsl:when test="@id">
        <xsl:attribute name="id">
          <xsl:value-of select="@id"/>
        </xsl:attribute>
      </xsl:when>
      <xsl:when test="self::x:a/@name">
        <xsl:attribute name="id">
          <xsl:value-of select="@name"/>
        </xsl:attribute>
      </xsl:when>
    </xsl:choose>-->

    <xsl:if test="@align">
      <xsl:choose>
        <xsl:when test="self::x:caption">
        </xsl:when>
        <xsl:when test="self::x:img or self::x:object">
          <xsl:if test="@align = 'bottom' or @align = 'middle' or @align = 'top'">
            <xsl:attribute name="vertical-align">
              <xsl:value-of select="@align"/>
            </xsl:attribute>
          </xsl:if>
        </xsl:when>
        <xsl:otherwise>
          <xsl:call-template name="process-cell-align">
            <xsl:with-param name="align" select="@align"/>
          </xsl:call-template>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:if>
    <xsl:if test="@valign">
      <xsl:call-template name="process-cell-valign">
        <xsl:with-param name="valign" select="@valign"/>
      </xsl:call-template>
    </xsl:if>

    <xsl:if test="@style">
      <xsl:call-template name="process-style">
        <xsl:with-param name="style" select="@style"/>
      </xsl:call-template>
    </xsl:if>

  </xsl:template>

</xsl:stylesheet>