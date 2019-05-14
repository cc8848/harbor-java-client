/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.imwyh.harbor.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * EmailServerSetting
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class EmailServerSetting {

  @SerializedName("email_host")
  private String emailHost = null;

  @SerializedName("email_port")
  private Integer emailPort = null;

  @SerializedName("email_username")
  private String emailUsername = null;

  @SerializedName("email_password")
  private String emailPassword = null;

  @SerializedName("email_ssl")
  private Boolean emailSsl = null;

  @SerializedName("email_identity")
  private String emailIdentity = null;
  public EmailServerSetting emailHost(String emailHost) {
    this.emailHost = emailHost;
    return this;
  }

  

  /**
  * The host of email server.
  * @return emailHost
  **/
  @Schema(description = "The host of email server.")
  public String getEmailHost() {
    return emailHost;
  }
  public void setEmailHost(String emailHost) {
    this.emailHost = emailHost;
  }
  public EmailServerSetting emailPort(Integer emailPort) {
    this.emailPort = emailPort;
    return this;
  }

  

  /**
  * The port of email server.
  * @return emailPort
  **/
  @Schema(description = "The port of email server.")
  public Integer getEmailPort() {
    return emailPort;
  }
  public void setEmailPort(Integer emailPort) {
    this.emailPort = emailPort;
  }
  public EmailServerSetting emailUsername(String emailUsername) {
    this.emailUsername = emailUsername;
    return this;
  }

  

  /**
  * The username of email server.
  * @return emailUsername
  **/
  @Schema(description = "The username of email server.")
  public String getEmailUsername() {
    return emailUsername;
  }
  public void setEmailUsername(String emailUsername) {
    this.emailUsername = emailUsername;
  }
  public EmailServerSetting emailPassword(String emailPassword) {
    this.emailPassword = emailPassword;
    return this;
  }

  

  /**
  * The password of email server.
  * @return emailPassword
  **/
  @Schema(description = "The password of email server.")
  public String getEmailPassword() {
    return emailPassword;
  }
  public void setEmailPassword(String emailPassword) {
    this.emailPassword = emailPassword;
  }
  public EmailServerSetting emailSsl(Boolean emailSsl) {
    this.emailSsl = emailSsl;
    return this;
  }

  

  /**
  * Use ssl/tls or not.
  * @return emailSsl
  **/
  @Schema(description = "Use ssl/tls or not.")
  public Boolean isEmailSsl() {
    return emailSsl;
  }
  public void setEmailSsl(Boolean emailSsl) {
    this.emailSsl = emailSsl;
  }
  public EmailServerSetting emailIdentity(String emailIdentity) {
    this.emailIdentity = emailIdentity;
    return this;
  }

  

  /**
  * The dentity of email server.
  * @return emailIdentity
  **/
  @Schema(description = "The dentity of email server.")
  public String getEmailIdentity() {
    return emailIdentity;
  }
  public void setEmailIdentity(String emailIdentity) {
    this.emailIdentity = emailIdentity;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailServerSetting emailServerSetting = (EmailServerSetting) o;
    return Objects.equals(this.emailHost, emailServerSetting.emailHost) &&
        Objects.equals(this.emailPort, emailServerSetting.emailPort) &&
        Objects.equals(this.emailUsername, emailServerSetting.emailUsername) &&
        Objects.equals(this.emailPassword, emailServerSetting.emailPassword) &&
        Objects.equals(this.emailSsl, emailServerSetting.emailSsl) &&
        Objects.equals(this.emailIdentity, emailServerSetting.emailIdentity);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(emailHost, emailPort, emailUsername, emailPassword, emailSsl, emailIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailServerSetting {\n");
    
    sb.append("    emailHost: ").append(toIndentedString(emailHost)).append("\n");
    sb.append("    emailPort: ").append(toIndentedString(emailPort)).append("\n");
    sb.append("    emailUsername: ").append(toIndentedString(emailUsername)).append("\n");
    sb.append("    emailPassword: ").append(toIndentedString(emailPassword)).append("\n");
    sb.append("    emailSsl: ").append(toIndentedString(emailSsl)).append("\n");
    sb.append("    emailIdentity: ").append(toIndentedString(emailIdentity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}