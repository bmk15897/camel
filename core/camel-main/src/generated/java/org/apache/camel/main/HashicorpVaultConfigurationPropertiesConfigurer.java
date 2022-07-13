/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.HashicorpVaultConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HashicorpVaultConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.HashicorpVaultConfigurationProperties target = (org.apache.camel.main.HashicorpVaultConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": target.setAwsVaultConfiguration(property(camelContext, org.apache.camel.vault.AwsVaultConfiguration.class, value)); return true;
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": target.setAzureVaultConfiguration(property(camelContext, org.apache.camel.vault.AzureVaultConfiguration.class, value)); return true;
        case "engine":
        case "Engine": target.setEngine(property(camelContext, java.lang.String.class, value)); return true;
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": target.setGcpVaultConfiguration(property(camelContext, org.apache.camel.vault.GcpVaultConfiguration.class, value)); return true;
        case "hashicorp":
        case "Hashicorp": target.setHashicorp(property(camelContext, org.apache.camel.vault.HashicorpVaultConfiguration.class, value)); return true;
        case "host":
        case "Host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "port":
        case "Port": target.setPort(property(camelContext, java.lang.String.class, value)); return true;
        case "scheme":
        case "Scheme": target.setScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "token":
        case "Token": target.setToken(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": return org.apache.camel.vault.AwsVaultConfiguration.class;
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": return org.apache.camel.vault.AzureVaultConfiguration.class;
        case "engine":
        case "Engine": return java.lang.String.class;
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": return org.apache.camel.vault.GcpVaultConfiguration.class;
        case "hashicorp":
        case "Hashicorp": return org.apache.camel.vault.HashicorpVaultConfiguration.class;
        case "host":
        case "Host": return java.lang.String.class;
        case "port":
        case "Port": return java.lang.String.class;
        case "scheme":
        case "Scheme": return java.lang.String.class;
        case "token":
        case "Token": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.HashicorpVaultConfigurationProperties target = (org.apache.camel.main.HashicorpVaultConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": return target.getAwsVaultConfiguration();
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": return target.getAzureVaultConfiguration();
        case "engine":
        case "Engine": return target.getEngine();
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": return target.getGcpVaultConfiguration();
        case "hashicorp":
        case "Hashicorp": return target.getHashicorp();
        case "host":
        case "Host": return target.getHost();
        case "port":
        case "Port": return target.getPort();
        case "scheme":
        case "Scheme": return target.getScheme();
        case "token":
        case "Token": return target.getToken();
        default: return null;
        }
    }
}

