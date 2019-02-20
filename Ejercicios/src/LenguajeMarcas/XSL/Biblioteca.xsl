<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" encoding="iso-8859-1"/>
  <xsl:template match="/biblioteca">
  	<html>
      <head>
        <title>Biblioteca</title>
        <xsl:call-template name="css"/>
        
      </head>
      <body>
        <xsl:apply-templates/>
      </body>
    </html>
  </xsl:template>
	  
  <xsl:template match="libro">
  	<h1><xsl:value-of select="titulo"></xsl:value-of></h1>
	 <ul>
		<li>Autor Nacimiento:  <xsl:value-of select="autor"/></li>
		<li>Nacimiento autor: <xsl:value-of select="autor/@fechaNacimiento"/></li>
		<li>Fecha: <xsl:value-of select="fechaPublicacion/@año"></xsl:value-of></li>	  
	</ul>
  </xsl:template>
  
  <xsl:template name="css">
   <style type="text/css">
  		body {
          margin: 50px;
          padding: 0px;
          background: #2372DE;
          font-family: 'Open Sans', sans-serif;
          font-size: 11pt;
          color: #FFFFFF;
          text-align:center;
        }
   </style>
  </xsl:template>
	  
</xsl:stylesheet>