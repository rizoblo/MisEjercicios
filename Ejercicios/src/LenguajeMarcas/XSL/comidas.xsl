<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  
  <xsl:output method="html" encoding="iso-8859-1"/>
  <xsl:template match="/navidad">
    <html>
      <head>
        <title>Navidad</title>
        <style type="text/css">
        
        </style>
      </head>
      <body>
      	<h1>Almuerzo</h1>
        <h2>primerplato:<xsl:value-of select="almuerzo/primerplato"/></h2>
        <h2>segundoplato:<xsl:value-of select="almuerzo/segundoplato"/></h2>
        <h2>postre:<xsl:value-of select="almuerzo/postre"/></h2>
        <h2>bebida:<xsl:value-of select="almuerzo/bebida"/></h2>
        <h2>Sobremesa</h2>
        <h3>Primeracopa: <xsl:value-of select="almuerzo/sobremesa/primeracopa"/></h3>
        <h3>Segundacopa:<xsl:value-of select="almuerzo/sobremesa/segundacopa"/></h3>
        <h3>Terceracopa: <xsl:value-of select="almuerzo/sobremesa/terceracopa"/></h3>  
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>