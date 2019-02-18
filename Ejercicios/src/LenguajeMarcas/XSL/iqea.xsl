<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
	<xsl:output method="html" encoding="iso-8859-1"/>
	
	<xsl:template match="/iqea">
		<html>
		   <head>
		      <title><xsl:value-of select="titulo"/></title>
		      <xsl:call-template name="css"/>
		   </head>
		   <body>
		      <div style="width: 1000px; margin: 0 auto;">
		         <div style="width: 1000px;"><img src="{logo}"/></div>
		         <xsl:apply-templates select="menu-navegacion"/>
		         <xsl:apply-templates select="banners"/>
		         <xsl:apply-templates select="restaurante"/>
		      </div>
		   </body>
		</html>
	</xsl:template>
	
	
	
	<xsl:template match="menu-navegacion">
       <div id="menu" style="width: 1000px; margin: 0px; padding: 0px;">
         <ul>
			<xsl:apply-templates select="elemento"/>
         </ul>
		</div>
	</xsl:template>
	
	
	<xsl:template match="elemento">
  		<xsl:choose>
  			<xsl:when test="position() mod 2 = 1">
  				<xsl:call-template name="elementoMenuConColor">
  					<xsl:with-param name="color">F27E2B</xsl:with-param>
  				</xsl:call-template>
  			</xsl:when>
  			<xsl:otherwise>
  				<xsl:call-template name="elementoMenuConColor">
  					<xsl:with-param name="color">DDE640</xsl:with-param>
  				</xsl:call-template>
  			</xsl:otherwise>
  		</xsl:choose>
	</xsl:template>
	
	
	<xsl:template name="elementoMenuConColor">
		<xsl:param name="color"/>
       	<li style="background: #{$color};">
       		<a href="{@href}"><xsl:value-of select="."/></a>
       	</li>
	</xsl:template>
	
	
	<xsl:template match="banners">
		<xsl:for-each select="banner">
			<table class="tablaBanner" border="1">
				<xsl:call-template name="imagenEnBanner">
					<xsl:with-param name="idImagen"><xsl:value-of select="@idImagen"/></xsl:with-param>
				</xsl:call-template>
				<tr>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">1</xsl:with-param>
	                    <xsl:with-param name="y">1</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">2</xsl:with-param>
	                    <xsl:with-param name="y">1</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">3</xsl:with-param>
	                    <xsl:with-param name="y">1</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">4</xsl:with-param>
	                    <xsl:with-param name="y">1</xsl:with-param>
	                </xsl:call-template>
				</tr>
				<tr>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">1</xsl:with-param>
	                    <xsl:with-param name="y">2</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">2</xsl:with-param>
	                    <xsl:with-param name="y">2</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">3</xsl:with-param>
	                    <xsl:with-param name="y">2</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">4</xsl:with-param>
	                    <xsl:with-param name="y">2</xsl:with-param>
	                </xsl:call-template>
				</tr>
				<tr>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">1</xsl:with-param>
	                    <xsl:with-param name="y">3</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">2</xsl:with-param>
	                    <xsl:with-param name="y">3</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">3</xsl:with-param>
	                    <xsl:with-param name="y">3</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">4</xsl:with-param>
	                    <xsl:with-param name="y">3</xsl:with-param>
	                </xsl:call-template>
				</tr>
				<tr>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">1</xsl:with-param>
	                    <xsl:with-param name="y">4</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">2</xsl:with-param>
	                    <xsl:with-param name="y">4</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">3</xsl:with-param>
	                    <xsl:with-param name="y">4</xsl:with-param>
	                </xsl:call-template>
	                <xsl:call-template name="celda">
	                    <xsl:with-param name="x">4</xsl:with-param>
	                    <xsl:with-param name="y">4</xsl:with-param>
	                </xsl:call-template>
				</tr>
			</table>
		</xsl:for-each>
	</xsl:template>
	
	
	
	<xsl:template name="celda">
        <xsl:param name="x"/>
        <xsl:param name="y"/>
        <td>
            <xsl:for-each select="texto">
                <xsl:if test="($x = @x) and ($y = @y)">
					<xsl:value-of select="."/>
                </xsl:if>
            </xsl:for-each>
        </td>	
	</xsl:template>
	
	
	<xsl:template name="imagenEnBanner">
		<xsl:param name="idImagen"/>
		<xsl:for-each select="/iqea/imagenes/imagen">
			<xsl:if test="$idImagen = @id">
				<xsl:attribute name="style">background: url('<xsl:value-of select="."/>') no-repeat;</xsl:attribute>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>
	
	
	
	<xsl:template match="restaurante">
		<p/><p/>
		<table border="1">
			<tr>
				<xsl:for-each select="plato"> 
					<td>
						<xsl:call-template name="imagenComida">
							<xsl:with-param name="idImagen"><xsl:value-of select="@idImagen"/></xsl:with-param>
						</xsl:call-template>
						<br/>
						<xsl:value-of select="@tipo"/> - <xsl:value-of select="."/>
					</td>
				</xsl:for-each>			
			</tr>
		</table>
	</xsl:template>
	

	<xsl:template name="imagenComida">
		<xsl:param name="idImagen"/>
		<xsl:for-each select="/iqea/imagenes/imagen">
			<xsl:if test="$idImagen = @id">
				<img src="{.}"/>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>
	
	
	
	<xsl:template name="css">
      <style type="text/css">
                    body {
                    font-family: Arial;
                    font-size: 12px;
                    }
                    
                    .tablaBanner td {
                    	width:80px;
                    	height:80px;
                    }
                    
                    ol, ul
                    {
                    margin-top: 10px;
                    margin-left: 0px;
                    }
                    
                    #menu li
                    {
                    margin-left: 0px;
                    display: inline;
                    list-style-type: none;
                    padding: 10px 50px;
                    }
                    
                    .noticia {
                    /* border: #000 solid 1px; */
                    padding: 10px 5px;
                    float: left; 
                    width: 338px;
                    }
                    
                    .noticia img {
                    width: 338px;
                    }
                    
                    .noticiaDobleAncho {
                    /* border: #000 solid 1px; */
                    padding: 10px 5px;
                    float: left; 
                    width: 690px;
                    }
                    
                    .noticiaDobleAncho img {
                    width: 690px;
                    }
                    
                    .fechaNoticia {
                    color: #A3A34B;
                    }
                    
                    .comentariosNoticia {
                    color: #A3A34B;
                    padding-left: 20px;
                    }
                    
                    .divPublicidad {
                    /* border: #000 solid 1px; */
                    padding: 10px 5px;
                    float: right; 
                    width: 280px;                    }
                    }
                    
                    .divPublicidad img {
                    width: 200px;
                    }
   		</style>
	</xsl:template>
	
</xsl:stylesheet>