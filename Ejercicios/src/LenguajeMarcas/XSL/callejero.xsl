<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html" encoding="iso-8859-1" />

	<xsl:template match="/callejero">
		<html>
			<head></head>
			<body>
				<p>
					<xsl:value-of select="@barrio" />
				</p>
				<p>
					<xsl:value-of select="@ciudad" />
				</p>
				<p>
					<xsl:value-of select="@cod_postal" />
				</p>
				<p>
					<xsl:value-of select="@provincia" />
				</p>


				<table border="1" width="635px" height="500px">
					<xsl:attribute name="style">background:url('http://www.webdidacticarafaelmunoz.appspot.com/lmsgi/image/callejero/callejero.png') no-repeat;"/></xsl:attribute>
					<xsl:call-template name="bucleForFila">
						<xsl:with-param name="i">1</xsl:with-param>
					</xsl:call-template>
				</table>

				<xsl:apply-templates select="patrocinadores/patrocinador"/>
				<xsl:apply-templates select="calle"/>
			</body>



		</html>

	</xsl:template>

	<xsl:template name="bucleForFila">
		<xsl:param name="i" />
		<xsl:if test="$i &lt;= 6">
			<tr>
				<xsl:call-template name="bucleForColumna">
					<xsl:with-param name="i">
						<xsl:value-of select="$i" />
					</xsl:with-param>
					<xsl:with-param name="j">1</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="bucleForFila">
					<xsl:with-param name="i">
						<xsl:value-of select="$i + 1" />
					</xsl:with-param>
				</xsl:call-template>
			</tr>
		</xsl:if>
	</xsl:template>


	<xsl:template name="bucleForColumna">
		<xsl:param name="i" />
		<xsl:param name="j" />
		<xsl:if test="$j &lt;= 6">
			<xsl:call-template name="celda">
				<xsl:with-param name="x">
					<xsl:value-of select="$j" />
				</xsl:with-param>
				<xsl:with-param name="y">
					<xsl:value-of select="$i" />
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="bucleForColumna">
				<xsl:with-param name="i">
					<xsl:value-of select="$i" />
				</xsl:with-param>
				<xsl:with-param name="j">
					<xsl:value-of select="$j + 1" />
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<xsl:template name="celda">
		<xsl:param name="x" />
		<xsl:param name="y" />
		<td>
		<img width="60px">
			<xsl:for-each select="monumentos/monumento">
				<xsl:if test="($x = @x) and ($y = @y)">
					<xsl:attribute name="src"><xsl:value-of select="@imagen"/></xsl:attribute>	
					<xsl:value-of select="."></xsl:value-of>
				</xsl:if>
			</xsl:for-each>
			
		</img>
		</td>
	</xsl:template>
	<xsl:template match="patrocinadores/patrocinador">
	<ul>
		<xsl:for-each select="nombre">
			Nombre
			<li><xsl:value-of select="."/></li>
		</xsl:for-each>
		<xsl:for-each select="direccion">
			Direccion
			<li><xsl:value-of select="."/></li>
		</xsl:for-each>
		<xsl:for-each select="imagen">
			<li><img><xsl:attribute name="src"><xsl:value-of select="."/></xsl:attribute></img></li>
		</xsl:for-each>
	</ul>
	</xsl:template>
	<xsl:template match="calle">
		<p>
			<xsl:for-each select=".">
			Anexas:
				<xsl:value-of select="@anexas"/>
			</xsl:for-each>
		</p>
		<p>
		<xsl:for-each select=".">
			Calle:
			<xsl:value-of select="."/>
		</xsl:for-each>
		</p>
	</xsl:template>
</xsl:stylesheet>