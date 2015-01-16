package com.mangofactory.spring.web.plugins;

import com.mangofactory.schema.plugins.DocumentationType;
import com.mangofactory.service.model.builder.ParameterBuilder;
import com.mangofactory.spring.web.readers.operation.ResolvedMethodParameter;
import org.springframework.core.MethodParameter;

public class ParameterContext {
  private final ParameterBuilder parameterBuilder;
  private final ResolvedMethodParameter resolvedMethodParameter;
  private final DocumentationContext documentationContext;

  public ParameterContext(ResolvedMethodParameter resolvedMethodParameter,
                          ParameterBuilder parameterBuilder,
                          DocumentationContext documentationContext) {
    this.parameterBuilder = parameterBuilder;
    this.resolvedMethodParameter = resolvedMethodParameter;
    this.documentationContext = documentationContext;
  }

  public ResolvedMethodParameter resolvedMethodParameter() {
    return resolvedMethodParameter;
  }

  public MethodParameter methodParameter() {
    return resolvedMethodParameter.getMethodParameter();
  }

  public ParameterBuilder parameterBuilder() {
    return parameterBuilder;
  }

  public DocumentationContext getDocumentationContext() {
    return documentationContext;
  }

  public DocumentationType getDocumentationType() {
    return documentationContext.getDocumentationType();
  }
}