<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" encoding="iso-8859-1"/>
  <xsl:template match="/ligaEndesa">
  
   <html>
      <head>
        <title>Liga Endesa</title>
        <style type="text/css">
        h1 {
        text-decoration:underline;
        }
        body{
        background-color:red;
        }
        li:hover{
        color:white;
        }
        </style>
      </head>
      <body>
      	<h1>Liga Endesa</h1>
        <ul>
        <li>Fecha de creación: <xsl:value-of select="fechacreacion"/></li>
        <li>Nombre: <xsl:value-of select="nombreCompleto"/></li>
        <li>Equipos: <xsl:value-of select="equipos"/></li>
        </ul>
      </body>
    </html>
  
  </xsl:template>
</xsl:stylesheet>