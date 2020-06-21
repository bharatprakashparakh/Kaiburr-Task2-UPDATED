package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Platform
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-20T11:30:19.835+05:30")




public class Platform   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("framework")
  private String framework = null;

  public Platform id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Platform Id
   * @return id
  **/
  @ApiModelProperty(value = "Platform Id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Platform name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Platform Name
   * @return name
  **/
  @ApiModelProperty(value = "Platform Name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Platform language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Platform Language
   * @return language
  **/
  @ApiModelProperty(value = "Platform Language")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Platform framework(String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Platform Framework
   * @return framework
  **/
  @ApiModelProperty(value = "Platform Framework")


  public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Platform platform = (Platform) o;
    return Objects.equals(this.id, platform.id) &&
        Objects.equals(this.name, platform.name) &&
        Objects.equals(this.language, platform.language) &&
        Objects.equals(this.framework, platform.framework);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, language, framework);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
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

