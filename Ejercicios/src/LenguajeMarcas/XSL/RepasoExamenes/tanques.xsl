<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="iso-8859-1"/>
  	<xsl:template match="/juegoTanques">
  		<html>
  		<head>
  		<title>Tanques</title>
  		
  		</head>
  		<body>
  		<table>
  			<tr>
  				<th colspan="2">Jugador</th>
  				<th>Jugada</th>
  			</tr>
  			<xsl:for-each select="jugadasDescritas/jugada">
  				<xsl:if test="position()mod 2 = 1">
	  			<tr>
		  			<td><xsl:value-of select="position()"></xsl:value-of></td>
		  			<td><xsl:value-of select="@jugador"></xsl:value-of></td>
		  			<td><xsl:value-of select="@desc"></xsl:value-of></td>
	  			</tr>
	  			</xsl:if>
  			</xsl:for-each>
  		
  		</table>
  		</body>
  		</html>
 	</xsl:template>
 	
</xsl:stylesheet>