package org.uma.jmetal.auto.irace.parametertype.parameter.mutation;

import org.uma.jmetal.auto.irace.parametertype.impl.RealParameterType;

public class UniformMutationPerturbationParameter extends RealParameterType {
  public UniformMutationPerturbationParameter(double lowerBound, double upperBound) {
    super("uniformMutationPerturbation", lowerBound, upperBound) ;

    setParentTag("uniform");
  }
}
