<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html" encoding="iso-8859-1" />

	<xsl:template match="/primerDia1DAW">
		<html>
			<head></head>
			<body>
				<xsl:apply-templates select="horario" />
				
				<table border="1">
                        <xsl:call-template name="bucleForFila">
                            <xsl:with-param name="i">1</xsl:with-param>
                        </xsl:call-template>
                </table>

			</body>



		</html>

	</xsl:template>

	<xsl:template match="horario">
		<table border="1">
			<xsl:for-each select="dia">
				<tr>
					<td>
						<xsl:value-of select="@desc" />
					</td>
					<xsl:for-each select="hora">
						<xsl:sort select="@orden" order="ascending" />
						<td>
							<xsl:choose>
								<xsl:when test=".='BBDD'">
									<xsl:attribute name="bgcolor">red</xsl:attribute>
								</xsl:when>
								<xsl:when test=".='ENT DES'">
									<xsl:attribute name="bgcolor">green</xsl:attribute>
								</xsl:when>
								<xsl:when test=".='PROG'">
									<xsl:attribute name="bgcolor">yellow</xsl:attribute>
								</xsl:when>
								<xsl:when test=".='FOL'">
									<xsl:attribute name="bgcolor">blue</xsl:attribute>
								</xsl:when>
								<xsl:when test=".='SIST INF'">
									<xsl:attribute name="bgcolor">grey</xsl:attribute>
								</xsl:when>
								<xsl:otherwise>
									<xsl:attribute name="bgcolor">orange</xsl:attribute>
								</xsl:otherwise>
							</xsl:choose>
							<xsl:value-of select="." />
						</td>

					</xsl:for-each>
				</tr>

			</xsl:for-each>
		</table>
	</xsl:template>
<xsl:template name="bucleForFila">
      <xsl:param name="i"/>
      <xsl:if test="$i &lt;= 11">
          <tr>
              <xsl:call-template name="bucleForColumna">
                  <xsl:with-param name="i"><xsl:value-of select="$i"/></xsl:with-param>
                  <xsl:with-param name="j">1</xsl:with-param>
              </xsl:call-template>
              <xsl:call-template name="bucleForFila">
                  <xsl:with-param name="i"><xsl:value-of select="$i + 1"/></xsl:with-param>
              </xsl:call-template>
          </tr>
      </xsl:if>
  </xsl:template>


  <xsl:template name="bucleForColumna">
      <xsl:param name="i"/>
      <xsl:param name="j"/> 
      <xsl:if test="$j &lt;= 8">
          <xsl:call-template name="celda">
              <xsl:with-param name="x"><xsl:value-of select="$j"/></xsl:with-param>
              <xsl:with-param name="y"><xsl:value-of select="$i"/></xsl:with-param>
          </xsl:call-template>
          <xsl:call-template name="bucleForColumna">
              <xsl:with-param name="i"><xsl:value-of select="$i"/></xsl:with-param>
              <xsl:with-param name="j"><xsl:value-of select="$j + 1"/></xsl:with-param>
          </xsl:call-template>
      </xsl:if>
  </xsl:template>
  
  <xsl:template name="celda">
      <xsl:param name="x"/>
      <xsl:param name="y"/>
      <td>
      <xsl:for-each select="estructuraAula/bloque">
      <xsl:if test="($x = @x) and ($y = @y)">
					<xsl:choose>
						<xsl:when test="@tipo = 'puerta'">
							<xsl:attribute name="bgcolor">red</xsl:attribute>
						</xsl:when>
						<xsl:when test="@tipo = 'pared'">
							<xsl:attribute name="bgcolor">yellow</xsl:attribute>
						</xsl:when>
						<xsl:when test="@tipo = 'ventana'">
							<xsl:attribute name="bgcolor">blue</xsl:attribute>
						</xsl:when>
					</xsl:choose>
					<xsl:value-of select="@tipo"/>
      	</xsl:if>
      	</xsl:for-each>
      	<xsl:for-each select="alumnado/alumno">
      	<xsl:if test="($x = @x) and ($y = @y)">
      		<xsl:choose>
      			<xsl:when test="@sexo='H'">
      			  <xsl:attribute name="bgcolor">blue</xsl:attribute>
      				<img width="30px">
      				<xsl:attribute name="src">miiHombre.jpg</xsl:attribute>
      				</img>
      			</xsl:when>
      			<xsl:otherwise>
      			<xsl:attribute name="bgcolor">pink</xsl:attribute>
      			<img width="30px">
      				<xsl:attribute name="src">miiMujer.jpg</xsl:attribute>	
      			</img>
      			</xsl:otherwise>
      		</xsl:choose>
      		<xsl:value-of select="."></xsl:value-of>
      	
      	</xsl:if>
      	</xsl:for-each>
      </td>
  </xsl:template>


  
	
</xsl:stylesheet>