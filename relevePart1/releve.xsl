<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Releve</title>
            </head>
            <body>
                <strong>
                    <p>
                    <h1>Releve bancaire </h1> <br/> 
                    RIB : <xsl:value-of select="releve/@RIB"></xsl:value-of> <br/>
                    Date de releve : <xsl:value-of select="releve/dateReleve"></xsl:value-of> <br/>
                    Solde en mad :  <xsl:value-of select="releve/solde"></xsl:value-of> <br/>
                    Liste des operations effectuees entre <xsl:value-of select="releve/operations/@dateDebut"></xsl:value-of> et 
                    <xsl:value-of select="releve/operations/@dateFin"></xsl:value-of> <br/>
                    </p>
                </strong>
                <table border="1" width="90%">
                    <tr>
                        <th>Type</th><th>Montant</th><th>Description</th>
                    </tr>
                    <xsl:for-each select="releve/operations/operation"> 
                        <tr>
                            <td> <xsl:value-of select="@type"></xsl:value-of> </td>
                            <td> <xsl:value-of select="@montant"></xsl:value-of> </td>
                            <td> <xsl:value-of select="@description"></xsl:value-of> </td>
                        </tr> 
                    </xsl:for-each>
                    <tr>
                        <td> TOTAL DES DEBIT </td>
                        <td colspan="2"> <xsl:value-of select=" sum(releve/operations/operation[@type='DEBIT']/@montant)"> </xsl:value-of> </td>
                    </tr>
                    <tr>
                        <td> TOTAL DES CREDIT </td>
                        <td colspan="2"> <xsl:value-of select=" sum(releve/operations/operation[@type='CREDIT']/@montant)"> </xsl:value-of> </td>
                    </tr>
                </table>
            </body>
        </html>
        
    </xsl:template>
    
</xsl:stylesheet>