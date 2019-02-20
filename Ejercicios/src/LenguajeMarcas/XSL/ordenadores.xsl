<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  
  <xsl:output method="html" encoding="iso-8859-1"/>
  <xsl:template match="/ordenadores">
  	<html>
       <head></head>
       <body>
              <!--  <xsl:sort select="nombre" order="ascending"/>-->
              <xsl:apply-templates/>
      </body>
   </html>
  </xsl:template>
  
  <xsl:template select="ordenador">
  
  	<ul>
  		<li>Procesador: <xsl:value-of select="procesador"/><xsl:value-of select="procesador/@generacion"/></li>
  		<li>RAM: <xsl:value-of select="concat(RAM/tipo,':',RAM/capacidad,':')"/></li>
  		<li>ROM: <xsl:value-of select="concat(ROM/tipo,':',ROM/capacidad,':')"/></li>
  		<li>RAM: <xsl:value-of select="RAM/tipo"/></li>
  		<li>RAM: <xsl:value-of select="RAM/tipo"/></li>
  		<li>RAM: <xsl:value-of select="RAM/tipo"/></li>
  		
  		
  
  
  
  
  	</ul>
  </xsl:template>
  
 </xsl:stylesheet>